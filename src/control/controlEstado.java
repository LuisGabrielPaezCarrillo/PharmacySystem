package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import modelo.modeloEstado;
import vista.vistaEstado;

public class controlEstado implements ActionListener{
    private vistaEstado vistaEstado;
    private modeloEstado modeloEstado;

    public controlEstado() {
    }

    public controlEstado(vistaEstado vistaEstado, modeloEstado modeloEstado) {
        this.vistaEstado = vistaEstado;
        this.modeloEstado = modeloEstado;
        
        vistaEstado.btnRegistrar.addActionListener(this);
    }

    public void iniciarVista(){
        vistaEstado.setLocationRelativeTo(null);
        vistaEstado.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vistaEstado.setTitle("REGISTRO ESTADOS");
        vistaEstado.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        if(vistaEstado.btnRegistrar == evento.getSource()){
       
        }
    } 
}
