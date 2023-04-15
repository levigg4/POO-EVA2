package eva2_17_interfaz;
//RODRIGO LEVI GARCIA GARAY 
public class Computadora extends Producto{
     public String procesador;
    public int memoria;

    public Computadora() {
        procesador = "-----";
        memoria = 0;
    }

    public Computadora(String procesador, int memoria, double precio, String nombre) {
        super(precio, nombre);
        this.procesador = procesador;
        this.memoria = memoria;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }
    
    @Override
    public void imprimirDatos(){
        System.out.println("DATOS COMPUTADORA");
        super.imprimirDatos(); 
        System.out.println("Procesador: "+procesador);
        System.out.println("Memoria: "+memoria);
    }
}
