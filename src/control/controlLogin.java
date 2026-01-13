package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import modelo.modeloLogin;
import vista.vistaLogin;
import vista.vistaPrincipal;

public class controlLogin implements ActionListener{
    
    private modeloLogin modeloLogin;
    private vistaLogin vistaLogin;
    
    public controlLogin() {
    }

    public controlLogin(modeloLogin modeloLogin, vistaLogin vistaLogin) {
        this.modeloLogin = modeloLogin;
        this.vistaLogin = vistaLogin;
        
        this.vistaLogin.btnLogin.addActionListener(this);
    }
    
    public void iniciarVista(){
        vistaLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        vistaLogin.setTitle("INICIO DE SESION");
        vistaLogin.setLocationRelativeTo(null);
        vistaLogin.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent evento) {
        if(vistaLogin.btnLogin == evento.getSource()){      
            vistaPrincipal vp = new vistaPrincipal();
            controlPrincipal cp = new controlPrincipal(vp);
        
            cp.iniciarVista();
        }
    }
    
}
