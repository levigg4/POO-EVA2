package eva2_21_polimorfismo;
//RODRIGO LEVI GARCIA GARAY 
/*Clase derivada extends Clase Base
Subclase extenda superclase
Hijo extends padre*/

//Estudiante is-a (es-un) Persona
public class Estudiante extends Persona{

    //PERSONA ES LA CLASE BASE
    //ESTUDIANTE ES LA CLASE DERIVADA  
   
    public Estudiante() {
        super(); //llamando al constructor de la superclase
        this.noControl = "----";
        
    }
    
    public Estudiante(String nombre, String apellido, int edad, String noControl){
        super(nombre, apellido, edad); //se llama al constructor de la superclase con argumentos
        this.noControl = noControl;
    }

    private String noControl;

    public String getNoControl() {
        return noControl;
    }

    public void setNoControl(String noControl) {
        this.noControl = noControl;
    }
    
    @Override //se "reemplaza"el método de la superclase (CON LA MISMA FIRMA)
              // en ets caso, ocultamos imprimirDatos() de Persona
    public void imprimirDatos(){
        super.imprimirDatos(); //llamando imprimirDatos de la superclase
        System.out.println("No. de Control: "+this.noControl);
        //en realidad se está añadiendo funcionalidad al método original
    }   
}
