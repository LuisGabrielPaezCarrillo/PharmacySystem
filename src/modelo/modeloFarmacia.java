package modelo;

public class modeloFarmacia {
    private int IDfarmacia;
    private int IDciudad;
    private String direccion;

    public modeloFarmacia() {
    }

    public modeloFarmacia(int IDfarmacia, int IDciudad, String direccion) {
        this.IDfarmacia = IDfarmacia;
        this.IDciudad = IDciudad;
        this.direccion = direccion;
    }

    public int getIDfarmacia() {
        return IDfarmacia;
    }

    public void setIDfarmacia(int IDfarmacia) {
        this.IDfarmacia = IDfarmacia;
    }

    public int getIDciudad() {
        return IDciudad;
    }

    public void setIDciudad(int IDciudad) {
        this.IDciudad = IDciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "farmacia{" + "IDfarmacia=" + IDfarmacia + ", IDciudad=" + IDciudad + ", direccion=" + direccion + '}';
    }
    
    public void imprimmir(){
        System.out.println(toString());
    }
}
