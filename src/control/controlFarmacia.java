package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import modelo.modeloFarmacia;
import vista.vistaFarmacia;

public class controlFarmacia implements ActionListener{
    private vistaFarmacia vistaFarmacia;
    private modeloFarmacia modeloFarmacia;

    public controlFarmacia() {
    }

    public controlFarmacia(vistaFarmacia vistaFarmacia, modeloFarmacia modeloFarmacia) {
        this.vistaFarmacia = vistaFarmacia;
        this.modeloFarmacia = modeloFarmacia;
        
        vistaFarmacia.btnRegistrar.addActionListener(this);
    }

    public void iniciarVista(){
        vistaFarmacia.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vistaFarmacia.setLocationRelativeTo(null);
        vistaFarmacia.setTitle("REGISTRO FARMACIAS");
        vistaFarmacia.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        if(vistaFarmacia.btnRegistrar == evento.getSource()){
        
        }
    }  
}
