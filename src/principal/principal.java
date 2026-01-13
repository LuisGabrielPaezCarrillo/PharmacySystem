package principal;

import control.controlLogin;
import control.controlPrincipal;
import modelo.modeloLogin;
import vista.vistaLogin;
import vista.vistaPrincipal;

public class principal {

    public static void main(String[] args) {

        vistaLogin vl   = new vistaLogin();
        modeloLogin ml = new modeloLogin();
        controlLogin cl = new controlLogin(ml, vl);
        
        cl.iniciarVista();
    }
}
