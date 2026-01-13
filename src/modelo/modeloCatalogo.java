package modelo;

public class modeloCatalogo {
    
    private int ID_producto;
    private String nombreMedicamento;
    private String nombreLaboratorio;
    private String tipoPresentacion;
    private String accionTerapeutica;
    private String nombreMonodroga;
    private double cantidadTotal;
    private double precio;

    public modeloCatalogo() {
    }

    public modeloCatalogo(int ID_producto, String nombreMedicamento, String nombreLaboratorio, String tipoPresentacion, String accionTerapeutica, String nombreMonodroga, double cantidadTotal, double precio) {
        this.ID_producto = ID_producto;
        this.nombreMedicamento = nombreMedicamento;
        this.nombreLaboratorio = nombreLaboratorio;
        this.tipoPresentacion = tipoPresentacion;
        this.accionTerapeutica = accionTerapeutica;
        this.nombreMonodroga = nombreMonodroga;
        this.cantidadTotal = cantidadTotal;
        this.precio = precio;
    }

    public int getID_producto() {
        return ID_producto;
    }

    public void setID_producto(int ID_producto) {
        this.ID_producto = ID_producto;
    }

    public String getNombreMedicamento() {
        return nombreMedicamento;
    }

    public void setNombreMedicamento(String nombreMedicamento) {
        this.nombreMedicamento = nombreMedicamento;
    }

    public String getNombreLaboratorio() {
        return nombreLaboratorio;
    }

    public void setNombreLaboratorio(String nombreLaboratorio) {
        this.nombreLaboratorio = nombreLaboratorio;
    }

    public String getTipoPresentacion() {
        return tipoPresentacion;
    }

    public void setTipoPresentacion(String tipoPresentacion) {
        this.tipoPresentacion = tipoPresentacion;
    }

    public String getAccionTerapeutica() {
        return accionTerapeutica;
    }

    public void setAccionTerapeutica(String accionTerapeutica) {
        this.accionTerapeutica = accionTerapeutica;
    }

    public String getNombreMonodroga() {
        return nombreMonodroga;
    }

    public void setNombreMonodroga(String nombreMonodroga) {
        this.nombreMonodroga = nombreMonodroga;
    }

    public double getCantidadTotal() {
        return cantidadTotal;
    }

    public void setCantidadTotal(double cantidadTotal) {
        this.cantidadTotal = cantidadTotal;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "catalogo{" + "ID_producto=" + ID_producto + ", nombreMedicamento=" + nombreMedicamento + ", nombreLaboratorio=" + nombreLaboratorio + ", tipoPresentacion=" + tipoPresentacion + ", accionTerapeutica=" + accionTerapeutica + ", nombreMonodroga=" + nombreMonodroga + ", cantidadTotal=" + cantidadTotal + ", precio=" + precio + '}';
    }
    
    public void imprimir(){
        System.out.println(toString());
    }
    
    
}
