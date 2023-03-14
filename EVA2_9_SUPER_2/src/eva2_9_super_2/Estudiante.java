package eva2_9_super_2;
//RODRIGO LEVI GARCIA GARAY
public class Estudiante extends Persona {
    private String noControl;

    public Estudiante() {
        super();//SIEMPTE LLAMAR AL CONSTRUCTOR
        this.noControl = "------";
    }

    public Estudiante(String nombre, String apellido, int edad, String noControl) {
        super(nombre, apellido, edad);
        this.noControl = noControl;
    }
    
    public String getNoControl() {
        return noControl;
    }

    public void setNoControl(String noControl) {
        this.noControl = noControl;
    }
    
     //OVERRIDE:  REEMPLAZA EL METODO DE LA SUPERCLASE(CON LA MISMA FIRMA)EN LA SUPERCLASE
              //EN ESTE CASO OCULTAMOS IMPRIMIRDATOS() DE PERSONA
    @Override
    public void imprimirDatos(){
        /*System.out.println("Nombre: "+ getNombre());
        System.out.println("Apellido: "+ getApellido());
        System.out.println("Edad: "+ getEdad());*/
        super.imprimirDatos();
        System.out.println("No de Control: "+ getNoControl());
        //System.out.println("ESTUDIANTE!!!");
    }
    
}