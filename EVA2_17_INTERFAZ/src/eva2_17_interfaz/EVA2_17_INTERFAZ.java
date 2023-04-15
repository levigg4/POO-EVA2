package eva2_17_interfaz;
//RODRIGO LEVI GARCIA GARAY 
public class EVA2_17_INTERFAZ {

    public static void main(String[] args) {
        // NO se pueden instanciar las interfaces
        Persona perso = new Persona("Levi Garcia", 19);
        perso.imprimirDatos();
        
        Computadora miPC = new Computadora("Intel CORE i3", 128, 6500.00, "HP LAPTOP");
        miPC.imprimirDatos();
    }
    
}
