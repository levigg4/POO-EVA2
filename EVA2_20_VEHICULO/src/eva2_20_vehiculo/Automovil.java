package eva2_20_vehiculo;
//RODRIGO LEVI GARCIA GARAY 
public final class Automovil extends Vehiculo {
    
    protected int cilindraje; // 6,4,8 cilindros
    
    public Automovil(String marca, int cilindraje) {
        super(marca);
        this.cilindraje = cilindraje;
    }

    public Automovil(){
        super();
        cilindraje = 0;
    }
    
    @Override
    public void Acelerar() {
        velocidad++;
        if(velocidad > 200){
            velocidad = 200;
            System.out.println("Velocidad Máxima");
        }
    }

     
}
