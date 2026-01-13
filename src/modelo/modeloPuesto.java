package modelo;

public class modeloPuesto {
    
    private int IDpuesto;
    private String nombrePuesto;

    public modeloPuesto() {
    }

    public modeloPuesto(int IDpuesto, String nombrePuesto) {
        this.IDpuesto = IDpuesto;
        this.nombrePuesto = nombrePuesto;
    }

    public int getIDpuesto() {
        return IDpuesto;
    }

    public void setIDpuesto(int IDpuesto) {
        this.IDpuesto = IDpuesto;
    }

    public String getNombrePuesto() {
        return nombrePuesto;
    }

    public void setNombrePuesto(String nombrePuesto) {
        this.nombrePuesto = nombrePuesto;
    }

    @Override
    public String toString() {
        return "puesto{" + "IDpuesto=" + IDpuesto + ", nombrePuesto=" + nombrePuesto + '}';
    }
    
    public void imprimir(){
        System.out.println(toString());
    }
    
    
}
