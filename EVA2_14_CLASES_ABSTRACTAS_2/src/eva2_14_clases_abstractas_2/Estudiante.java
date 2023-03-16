package eva2_14_clases_abstractas_2;
//RODRGIO LEVI GARCIA GARAY 

public class Estudiante extends Persona {
    private String noControl;

    public Estudiante() {
        super();
        noControl = "-------";
        
    }

    public Estudiante(String nombre, int edad, String noControl) {
        super(nombre, edad);
        this.noControl = noControl;
    }

    public String getNoControl() {
        return noControl;
    }

    public void setNoControl(String noControl) {
        this.noControl = noControl;
    }
    
    @Override
    public void imprimirDatos() {
        System.out.println("Nombre: "+ getNombre());
        System.out.println("Edad: "+ getEdad());
        System.out.println("No de Control: "+ getNoControl());
    }
    
}