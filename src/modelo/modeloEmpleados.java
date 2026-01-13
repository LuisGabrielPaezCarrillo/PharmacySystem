package modelo;

public class modeloEmpleados {
    
    private int IDempleados;
    private int IDfarmacia;
    private String nombreEmpleado;
    private boolean farmaceutico;
    private String Direccion;
    private String RFC;

    public modeloEmpleados() {
    }

    public modeloEmpleados(int IDempleados, int IDfarmacia, String nombreEmpleado, boolean farmaceutico, String Direccion, String RFC) {
        this.IDempleados = IDempleados;
        this.IDfarmacia = IDfarmacia;
        this.nombreEmpleado = nombreEmpleado;
        this.farmaceutico = farmaceutico;
        this.Direccion = Direccion;
        this.RFC = RFC;
    }

    public int getIDempleados() {
        return IDempleados;
    }

    public void setIDempleados(int IDempleados) {
        this.IDempleados = IDempleados;
    }

    public int getIDfarmacia() {
        return IDfarmacia;
    }

    public void setIDfarmacia(int IDfarmacia) {
        this.IDfarmacia = IDfarmacia;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public boolean isFarmaceutico() {
        return farmaceutico;
    }

    public void setFarmaceutico(boolean farmaceutico) {
        this.farmaceutico = farmaceutico;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getRFC() {
        return RFC;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }

    @Override
    public String toString() {
        return "empleados{" + "IDempleados=" + IDempleados + ", IDfarmacia=" + IDfarmacia + ", nombreEmpleado=" + nombreEmpleado + ", farmaceutico=" + farmaceutico + ", Direccion=" + Direccion + ", RFC=" + RFC + '}';
    }
    
    public void imprimir(){
        System.out.println(toString());
    }
}
