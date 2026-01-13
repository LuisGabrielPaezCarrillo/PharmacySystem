package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import modelo.modeloCatalogo;
import vista.vistaCatalogo;



public class controlCatalogo implements ActionListener{
    private vistaCatalogo vistaCatalogo;
    private modeloCatalogo modeloCatalogo;
    

    public controlCatalogo() {
    }

    public controlCatalogo(vistaCatalogo vistaCatalogo, modeloCatalogo modeloCatalogo) {
        this.vistaCatalogo = vistaCatalogo;
        this.modeloCatalogo = modeloCatalogo;
        
        this.vistaCatalogo.btnRegistrar.addActionListener(this);
    }

    
    
    public void iniciarVista(){
        vistaCatalogo.setLocationRelativeTo(vistaCatalogo);
        vistaCatalogo.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vistaCatalogo.setLocationRelativeTo(null);
        vistaCatalogo.setVisible(true);
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent evento) {
        if(vistaCatalogo.btnRegistrar == evento.getSource()){
        
        }
    }
}
