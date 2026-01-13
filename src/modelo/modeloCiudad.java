package modelo;

public class modeloCiudad {
    private int IDciudad;
    private int IDestado;
    private String nombreCiudad;

    public modeloCiudad() {
    }

    public modeloCiudad(int IDciudad, int IDestado, String nombreCiudad) {
        this.IDciudad = IDciudad;
        this.IDestado = IDestado;
        this.nombreCiudad = nombreCiudad;
    }

    public int getIDciudad() {
        return IDciudad;
    }

    public void setIDciudad(int IDciudad) {
        this.IDciudad = IDciudad;
    }

    public int getIDestado() {
        return IDestado;
    }

    public void setIDestado(int IDestado) {
        this.IDestado = IDestado;
    }

    public String getNombreCiudad() {
        return nombreCiudad;
    }

    public void setNombreCiudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }

    @Override
    public String toString() {
        return "ciudad{" + "IDciudad=" + IDciudad + ", IDestado=" + IDestado + ", nombreCiudad=" + nombreCiudad + '}';
    }
    
    public void imprimir(){
        System.out.println(toString());
    }


}
