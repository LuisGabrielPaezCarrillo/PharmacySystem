package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import modelo.modeloEmpleados;
import vista.vistaEmpleados;

public class controlEmpleado implements ActionListener{
    
    private vistaEmpleados vistaEmpleado;
        private modeloEmpleados modeloEmpleado;

    public controlEmpleado() {
    }

    public controlEmpleado(vistaEmpleados vistaEmpleado, modeloEmpleados modeloEmpleado) {
        this.vistaEmpleado = vistaEmpleado;
        this.modeloEmpleado = modeloEmpleado;
    }
    
    public void iniciarVista(){
        vistaEmpleado.setLocationRelativeTo(null);
        vistaEmpleado.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vistaEmpleado.setTitle("REGISTRO DE EMPLEADOS");
        vistaEmpleado.setVisible(true);    
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        if(vistaEmpleado.btnRegistrar == evento.getSource()){
        
        }
    }
}
