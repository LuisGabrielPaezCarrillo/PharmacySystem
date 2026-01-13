package modelo;

public class modeloEstado {
    
    private int IDestado;
    private String Estado;

    public modeloEstado() {
    }

    public modeloEstado(int IDestado, String Estado) {
        this.IDestado = IDestado;
        this.Estado = Estado;
    }

    public int getIDestado() {
        return IDestado;
    }

    public void setIDestado(int IDestado) {
        this.IDestado = IDestado;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    @Override
    public String toString() {
        return "estado{" + "IDestado=" + IDestado + ", Estado=" + Estado + '}';
    }
    
    public void imprimir(){
        System.out.println(toString());
    }
}
