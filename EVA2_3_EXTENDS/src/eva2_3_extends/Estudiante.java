package eva2_3_extends;
//RODRIGO LEVI GARCIA GARAY
                //CLASE DERIVADA EXTIENDE A LA CALSE BASE
                //Subclase extends Superclase
                //Hijo extends Padre
            //estudiante is-a (es-un) persona
public class Estudiante extends Persona {
    private String noControl;

    public String getNoControl() {
        return noControl;
    }

    public void setNoControl(String noControl) {
        this.noControl = noControl;
    }
    
}
