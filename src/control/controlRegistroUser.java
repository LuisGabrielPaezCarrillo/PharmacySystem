package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import modelo.modeloRegistroUser;
import vista.vistaRegistroUser;

public class controlRegistroUser implements ActionListener {
    private modeloRegistroUser modeloRegistroUser;
    private vistaRegistroUser vistaRegistroUser;

    public controlRegistroUser() {
    }

    public controlRegistroUser(modeloRegistroUser modeloRegistroUser, vistaRegistroUser vistaRegistroUser) {
        this.modeloRegistroUser = modeloRegistroUser;
        this.vistaRegistroUser = vistaRegistroUser;
        
        this.vistaRegistroUser.btnRegistrar.addActionListener(this);
    }
    
    public void iniciarVista(){
        vistaRegistroUser.setTitle("REGISTRO DE USUARIOS");
        vistaRegistroUser.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vistaRegistroUser.setLocationRelativeTo(null);
        vistaRegistroUser.setVisible(true);
    }
    
    

    @Override
    public void actionPerformed(ActionEvent evento) {
        if(vistaRegistroUser.btnRegistrar == evento.getSource()){
        
        }
    }
    
    
    
}
