package SuperClases;
//RODRIGO LEVI GARCIA GARAY 

public abstract class Electronica extends Producto {
    private int garantia; //dias de garantia (30, 150, 15)
    private String modelo;
    private String fabricante;

    public Electronica() {
        super();
        garantia = 0;
        modelo = "-----";
        fabricante = "-----";
    }

    public Electronica(int garantia, String modelo, String fabricante, double precio, String nombre, String unidad) {
        super(precio, nombre, unidad);
        this.garantia = garantia;
        this.modelo = modelo;
        this.fabricante = fabricante;
    }

    public int getGarantia() {
        return garantia;
    }

    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    
}
