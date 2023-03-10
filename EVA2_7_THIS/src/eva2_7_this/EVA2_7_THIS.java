package eva2_7_this;
//rodrigo levi garcia garay 
public class EVA2_7_THIS {
        //el static se crea al momento de arrancar el programa 
    public static void main(String[] args) {
        ///imprimir()
        //no se puede usar en un contexto no estatico
    }
    public void imprimir(){
    //tambien es visible this aqui
    }
    
}
//this es un referencia a una instancia de la clase
//todos los objetos tiene this 
//puden usar this en cualquier clase
class Persona{
    private String nombre;

    public void persona(String nombre){
        this.nombre = nombre;
        //this.nombre es el atributo de la clase
        //nombre es la variable(parametro)
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void immprimirDatos(){
        System.out.println("Este es nombre: " + this.nombre);
    }
}
