package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import modelo.modeloStock;
import vista.vistaStock;

public class controlStock implements ActionListener{
    
    private vistaStock vistaStock;
    private modeloStock modeloStock;

    public controlStock() {
    }

    public controlStock(vistaStock vistaStock, modeloStock modeloStock) {
        this.vistaStock = vistaStock;
        this.modeloStock = modeloStock;
        
        vistaStock.btnRegistrar.addActionListener(this);
    }
    
    public void iniciarVista(){
        vistaStock.setLocationRelativeTo(null);
        vistaStock.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vistaStock.setTitle("REGISTRO DE STOCK");
        vistaStock.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent evento) {
        if(vistaStock.btnRegistrar == evento.getSource()){
        
        }
    }
    
    
    
}
