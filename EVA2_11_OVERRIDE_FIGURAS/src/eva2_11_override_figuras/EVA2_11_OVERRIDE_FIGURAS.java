package eva2_11_override_figuras;
//RODDRIGO LEVI GARCIA GARAY 
public class EVA2_11_OVERRIDE_FIGURAS {

    public static void main(String[] args) {
        System.out.println("\nCIRCULO");
        Circulo circu = new Circulo(6);
        System.out.println("ÁREA: "+circu.calcularArea());
        System.out.println("PERIMETRO: "+circu.calcularPeri());
        System.out.println("\nTRIANGULO");
        Triangulo trian = new Triangulo(4,3);
        System.out.println("ÁREA: "+trian.calcularArea());
        System.out.println("PERIMETRO: "+trian.calcularPeri());
        
    }
    
}
