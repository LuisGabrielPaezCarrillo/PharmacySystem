package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import modelo.modeloCiudad;
import vista.vistaCiudad;

public class controlCiudad implements ActionListener{
    private vistaCiudad vistaCiudad;
    private modeloCiudad modeloCiudad;

    public controlCiudad() {
    }

    public controlCiudad(vistaCiudad vistaCiudad, modeloCiudad modeloCiudad) {
        this.vistaCiudad = vistaCiudad;
        this.modeloCiudad = modeloCiudad;
    }
  
    public void iniciarVista(){
        vistaCiudad.setLocationRelativeTo(null);
        vistaCiudad.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vistaCiudad.setTitle("REGISTRO DE CIUDADES");
        vistaCiudad.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        if(vistaCiudad.btnRegistrar == evento.getSource()){
        
        }
    } 
}
