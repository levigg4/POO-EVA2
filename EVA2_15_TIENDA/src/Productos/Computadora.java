package Productos;
import SuperClases.Electronica;

public final class Computadora extends Electronica {
    private double tamaño;
    private int memoria;
        private String procesador;
    private String DD;

    public Computadora(double tamaño, int memoria, String procesador, String DD, int garantia, String modelo, String fabricante, double precio, String nombre, String unidad) {
        super(garantia, modelo, fabricante, precio, nombre, unidad);
        this.tamaño = tamaño;
        this.memoria = memoria;
        this.procesador = procesador;
        this.DD = DD;
    }

    public Computadora() {
        super();
        tamaño = 0.0;
        memoria = 0;
        procesador = "-----";
        DD = "-----";
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getDD() {
        return DD;
    }

    public void setDD(String DD) {
        this.DD = DD;
    }
    
    @Override
    public double precioVenta(int cant) {
        //10 unidades --> el precio es del 80%
        if(cant<10){
            return getPrecio()*cant;
        }else
            return (getPrecio()*0.8)*cant;
    }
     @Override
    public String toString(){
        String cadena =  "DATOS COMPUTADORA\n"+
                "Precio "+getPrecio()+
                "\nNombre: "+getNombre()+
                "\nUnidad: "+getUnidad()+
                "\nFabricante: "+getFabricante()+
                "\nModelo: "+getModelo()+
                "\nGarantia: "+getGarantia()+
                "\nTamaño: "+tamaño+
                "\nMemoria: "+memoria+
                "\nProcesador: "+procesador+
                "\nDisco Duro: "+DD;
        return cadena;
    }
 
}
