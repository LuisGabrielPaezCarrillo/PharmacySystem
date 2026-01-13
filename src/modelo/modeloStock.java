package modelo;

public class modeloStock {
    private int IDfarmacia;
    private int IDproducto;
    private int CantidadPorfarmacia;

    public modeloStock() {
    }

    public modeloStock(int IDfarmacia, int IDproducto, int CantidadPorfarmacia) {
        this.IDfarmacia = IDfarmacia;
        this.IDproducto = IDproducto;
        this.CantidadPorfarmacia = CantidadPorfarmacia;
    }

    public int getIDfarmacia() {
        return IDfarmacia;
    }

    public void setIDfarmacia(int IDfarmacia) {
        this.IDfarmacia = IDfarmacia;
    }

    public int getIDproducto() {
        return IDproducto;
    }

    public void setIDproducto(int IDproducto) {
        this.IDproducto = IDproducto;
    }

    public int getCantidadPorfarmacia() {
        return CantidadPorfarmacia;
    }

    public void setCantidadPorfarmacia(int CantidadPorfarmacia) {
        this.CantidadPorfarmacia = CantidadPorfarmacia;
    }

    @Override
    public String toString() {
        return "stock{" + "IDfarmacia=" + IDfarmacia + ", IDproducto=" + IDproducto + ", CantidadPorfarmacia=" + CantidadPorfarmacia + '}';
    }
    
    public void imprimir(){
        System.out.println(toString());
    }
}
