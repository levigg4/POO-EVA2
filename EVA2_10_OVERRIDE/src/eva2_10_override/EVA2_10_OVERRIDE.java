package eva2_10_override;
//RODRIGO LEVI GARCIA GARAY
public class EVA2_10_OVERRIDE {

    public static void main(String[] args) {
        Persona perso = new Persona();//INSTANCIAR
        Persona perso2 = new Persona("Levi Garcia", 19);
        System.out.println(perso);
        System.out.println(perso2);
        
    }
}

class Persona{
    private String nombre;
    private int edad;
    
    public Persona(){
       this.nombre = "-----";
       this.edad = 0;
    }
    
    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
       
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    @Override
    public String toString(){
        //NO ESTAMOS INVOCANDO AL METODO SOBREESCRITO DE LA SUPERCLASE, LO ESTAMOS REMPLAZANDO TOTALMENTE
        //A toString DE LA SUPERCLASE
        String cade = "Datos: \n" +
                      "Nombre: " + nombre + "\n" +
                      "Edad: " + edad;
        return cade;
    }

}