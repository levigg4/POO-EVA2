package eva2_20_vehiculo;

public class EVA2_20_VEHICULO {
//RODRIGO LEVI GARCIA GARAY 
    public static void main(String[] args) {
        Automovil bocho = new Automovil("VolksWagen", 2);
        Bicicleta bici = new Bicicleta("Harley Davidson","Carretera");
        
        System.out.println("BOCHITO");
        for(int i=0 ; i<=200 ; i++){
            bocho.Acelerar();
            bocho.imprimirVelocidad();
        }
        bocho.Detener();
        bocho.imprimirVelocidad();
        
        System.out.println("\nBICICLETA");
        for(int i=0 ; i<=80 ; i++){
            bici.Acelerar();
            bici.imprimirVelocidad();
        }
        bici.Detener();
        bici.imprimirVelocidad();
    }
    }
    

