
package eva2_9_super_2;

public class Docente extends Persona {
    private String plaza;

    public Docente() {
        super();
        this.plaza = "------";
    }

    public Docente(String nombre, String apellido, int edad,String plaza) {
        super(nombre, apellido, edad);
        this.plaza = plaza;
    }
 
    public String getPlaza() {
        return plaza;
    }

    public void setPlaza(String plaza) {
        this.plaza = plaza;
    }
    
    @Override
    public void imprimirDatos(){
        super.imprimirDatos();
        System.out.println("No de Plaza: "+ getPlaza());
    }
    
}
