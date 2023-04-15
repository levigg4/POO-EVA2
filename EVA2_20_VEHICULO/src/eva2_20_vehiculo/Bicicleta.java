package eva2_20_vehiculo;
//RODRIGO LEVI GARCIA GARAY 

public final class Bicicleta extends Vehiculo{
    protected String tipo; //montana, calle, carrera

    public Bicicleta(String tipo, String marca) {
        super(marca);
        this.tipo = tipo;
    }

    public Bicicleta() {
        super();
        tipo = "----";
    }
    
    @Override
    public void Acelerar(){
        velocidad++;
        if(velocidad > 80){
            velocidad = 80;
            System.out.println("Velocidad Máxima");
        }
    }    
}
