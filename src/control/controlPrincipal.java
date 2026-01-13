package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import modelo.modeloRegistroUser;
import vista.vistaPrincipal;
import vista.vistaRegistroUser;
import vista.vistaRegistros;

public class controlPrincipal implements ActionListener{
    
    private vistaPrincipal vistaPrincipal;

    public controlPrincipal() {
    }

    public controlPrincipal(vistaPrincipal vistaPrincipal) {
        this.vistaPrincipal = vistaPrincipal;
        
        this.vistaPrincipal.btnAdministrador.addActionListener(this);
        this.vistaPrincipal.btnEmpleado.addActionListener(this);
        this.vistaPrincipal.btnAdduser.addActionListener(this);
    }
    
    public void iniciarVista(){
        vistaPrincipal.setTitle("VISTA PRINCIPAL");
        vistaPrincipal.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vistaPrincipal.setLocationRelativeTo(null);
        vistaPrincipal.setResizable(false);
        vistaPrincipal.setVisible(true);
    }
    
    

    @Override
    public void actionPerformed(ActionEvent evento) {
        if(vistaPrincipal.btnAdministrador == evento.getSource()){
            vistaRegistros vr = new vistaRegistros();
            controlRegistro cr = new controlRegistro(vr);
            
            cr.iniciarVista();         
        }else if(vistaPrincipal.btnEmpleado == evento.getSource()){
        
        }else if(vistaPrincipal.btnAdduser == evento.getSource()){
            vistaRegistroUser vru = new vistaRegistroUser();
            modeloRegistroUser mru = new modeloRegistroUser();
            controlRegistroUser cru = new controlRegistroUser(mru, vru);
            
            cru.iniciarVista();
        }
        
    }
    
}
