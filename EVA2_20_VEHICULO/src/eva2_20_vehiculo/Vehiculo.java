package eva2_20_vehiculo;
//RODRIGO LEVI GARCIA GARAY

public abstract class Vehiculo implements Velocidad {
    protected double velocidad;
    protected String marca;

    public Vehiculo(String marca) {
        this.velocidad = 0;
        this.marca = marca;
    }

    public Vehiculo() {
        velocidad = 0;
        marca = "----";
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    @Override
    public void Detener() {
        System.out.println("Vehículo Detenido");
        velocidad = 0;
    }

    @Override
    public void imprimirVelocidad() {
        System.out.println("Velocidad: "+velocidad+" km/h");
    }
    
}
