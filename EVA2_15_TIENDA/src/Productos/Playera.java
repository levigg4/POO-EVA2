package Productos;
import SuperClases.Ropa;
//RODRIGO LEVI GARCIA GARAY 

public final class Playera extends Ropa{
private int talla;
   private String tipo;   

    public Playera() {
        super();
        talla = 0;
        tipo = "----";
    }

    public Playera(String marca, String color, double precio, String nombre, String unidad) {
        super(marca, color, precio, nombre, unidad);
    }

    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    @Override
    public double precioVenta(int cant){
       if(cant > 5){
           return getPrecio() * .5;
       } else
       return getPrecio() * cant;
    }
    
    @Override
    public String toString(){
        String cadena = "\nDATOS PLAYERA "+
                "\nPrecio: "+ getPrecio()+
                "\nNombre: "+getNombre()+
                "\nUnidad: "+getUnidad()+
                "\nMarca: "+getMarca()+
                "\nColor: "+getColor()+
                "\nTalla: "+talla+
                "\nTipo: "+tipo;
        return cadena;
    }
    
    
}
