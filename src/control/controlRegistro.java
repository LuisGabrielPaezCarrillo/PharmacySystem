package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import modelo.modeloCatalogo;
import modelo.modeloCiudad;
import modelo.modeloEmpleados;
import modelo.modeloEstado;
import modelo.modeloFarmacia;
import modelo.modeloPuesto;
import modelo.modeloStock;
import vista.vistaCatalogo;
import vista.vistaCiudad;
import vista.vistaEmpleados;
import vista.vistaEstado;
import vista.vistaFarmacia;
import vista.vistaPuesto;
import vista.vistaRegistros;
import vista.vistaStock;

public class controlRegistro implements ActionListener{
    
    private vistaRegistros vistaRegistros;

    public controlRegistro() {
    }

    public controlRegistro(vistaRegistros vistaRegistros) {
        this.vistaRegistros = vistaRegistros;
        
        this.vistaRegistros.btnCiudad.addActionListener(this);
        this.vistaRegistros.btnEstado.addActionListener(this);
        this.vistaRegistros.btnFarmacia.addActionListener(this);
        this.vistaRegistros.btnCatalogo.addActionListener(this);
        this.vistaRegistros.btnStock.addActionListener(this);
        this.vistaRegistros.btnEmpleado.addActionListener(this);
        this.vistaRegistros.btnPuesto.addActionListener(this);
    }
    
    public void iniciarVista(){
        vistaRegistros.setTitle("MENU PRINCIPAL DE REGISTROS");
        vistaRegistros.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vistaRegistros.setLocationRelativeTo(null);
        vistaRegistros.setVisible(true);
    }
   
    @Override
    public void actionPerformed(ActionEvent evento) {
        if(vistaRegistros.btnCiudad == evento.getSource()){
            vistaCiudad va = new vistaCiudad();
            modeloCiudad mc = new modeloCiudad();
            controlCiudad cc = new controlCiudad(va, mc);
            
            cc.iniciarVista();
            
        }else if(vistaRegistros.btnEstado == evento.getSource() ){
            vistaEstado ve = new vistaEstado();
            modeloEstado me = new modeloEstado();
            controlEstado ce = new controlEstado(ve, me);
            
            ce.iniciarVista();
               
        }else if(vistaRegistros.btnFarmacia == evento.getSource()){
            vistaFarmacia vf = new vistaFarmacia();
            modeloFarmacia mf = new modeloFarmacia();
            controlFarmacia cf = new controlFarmacia(vf, mf);
            
            cf.iniciarVista();
            
        }else if(vistaRegistros.btnCatalogo == evento.getSource()){
            vistaCatalogo vc = new vistaCatalogo();
            modeloCatalogo mc = new modeloCatalogo();
            controlCatalogo cc = new controlCatalogo(vc, mc);
            
            cc.iniciarVista();
            
        }else if(vistaRegistros.btnStock == evento.getSource()){
            vistaStock vs = new vistaStock();
            modeloStock ms = new modeloStock();
            controlStock cs = new controlStock(vs, ms);
            
            cs.iniciarVista();
            
        }else if(vistaRegistros.btnEmpleado == evento.getSource()){
            vistaEmpleados ve = new vistaEmpleados();
            modeloEmpleados me = new modeloEmpleados();
            controlEmpleado ce = new controlEmpleado(ve, me);
            
            ce.iniciarVista();
             
        }else if(vistaRegistros.btnPuesto == evento.getSource()){
            vistaPuesto vp = new vistaPuesto();
            modeloPuesto mp = new modeloPuesto();
            controlPuesto cp = new controlPuesto(vp, mp);
            
            cp.iniciarVista();
            
        }
    }
    
}
