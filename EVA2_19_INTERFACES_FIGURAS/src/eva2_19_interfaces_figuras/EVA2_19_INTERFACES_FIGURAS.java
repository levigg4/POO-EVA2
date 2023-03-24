package eva2_19_interfaces_figuras;
//RODDRIGO LEVI GARCIA GARAY 

public class EVA2_19_INTERFACES_FIGURAS {

    public static void main(String[] args) {
        //Figura figura = new Figura(); NO SE PUEDEN CREAR INSTANCIAS DE INTERFACES
        //MostarDatos mostrar = new MostrarDatos();
        Circulo cir = new Circulo(3);
        cir.imprimirDatos();
        Triangulo tri = new Triangulo(3,4);
        tri.imprimirDatos();
    }
    
}