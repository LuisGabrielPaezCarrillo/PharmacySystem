package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import modelo.modeloPuesto;
import vista.vistaPuesto;

public class controlPuesto implements ActionListener{
    private vistaPuesto vistaPuesto;
    private modeloPuesto modeloPuesto;

    public controlPuesto() {
    }

    public controlPuesto(vistaPuesto vistaPuesto, modeloPuesto modeloPuesto) {
        this.vistaPuesto = vistaPuesto;
        this.modeloPuesto = modeloPuesto;
        
        vistaPuesto.btnRegistrar.addActionListener(this);
    }
    
    public void iniciarVista(){
        vistaPuesto.setLocationRelativeTo(null);
        vistaPuesto.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vistaPuesto.setTitle("REGISTRO DE PUESTOS");
        vistaPuesto.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        if(vistaPuesto.btnRegistrar == evento.getSource()){
        
        }
    } 
}
