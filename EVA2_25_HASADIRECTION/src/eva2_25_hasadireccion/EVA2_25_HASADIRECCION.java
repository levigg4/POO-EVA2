package eva2_25_hasadireccion;
//RODRIGO LEVI GARCIA
public class EVA2_25_HASADIRECCION {


    public static void main(String[] args) {
        Persona persona = new Persona();
        //Direccion dir = new Direccion("Sendero aluminado",16099,"Vicente Guerrero","31173", "Chihuahua", "Chihuahua");
        persona.setNombre("Levi ");
        persona.setApellido("Garcia");
        persona.setEdad(19);
        //para asignar la dirección primero debemos crearla
        //persona.setPersonalDir(dir);
        persona.imprimirDatos();
        
        //dentro del mismo constructor se puede crear el objeto de direccion 
        Persona persona1 = new Persona("Rodrigo", "Garay", 19,new Direccion("Jose Maria Mata", 14328, "Del Real", "15234", "Monterrey", "Nuevo Leon"));
        persona1.imprimirDatos();
    }
    
}

class Direccion{
    private String calle;
    private int num;
    private String colonia;
    private String codPostal;
    private String ciudad;
    private String estado;

    public Direccion() {
        this.calle = "-----";
        this.num = 0;
        this.colonia = "-----";
        this.codPostal = "------";
        this.ciudad = "------";
        this.estado = "------";
    }

    public Direccion(String calle, int num, String colonia, String codPostal, String ciudad, String estado) {
        this.calle = calle;
        this.num = num;
        this.colonia = colonia;
        this.codPostal = codPostal;
        this.ciudad = ciudad;
        this.estado = estado;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getCodPostal() {
        return codPostal;
    }

    public void setCodPostal(String codPostal) {
        this.codPostal = codPostal;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public void imprimirDatos(){
        System.out.println("DATOS DIRECCIÓN");
        System.out.println(calle+" #"+num+", "+colonia+"\nC.P. "+codPostal+", "+ciudad+", "+estado);
    }
}

//una persona no extiende una direccion las relaciones de herencia tienen que ser coherentes
class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    //HAS A (tiene una) dirección
    private Direccion personalDir; //se trata como un atribtuo más 

    public Persona() {
        this.nombre = "-----";
        this.apellido = "-----";
        this.edad = 0;
        //hacer que la dirección no exista (null)
        this.personalDir = null;
    }

    public Persona(String nombre, String apellido, int edad, Direccion personalDir) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.personalDir = personalDir;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Direccion getPersonalDir() {
        return personalDir;
    }

    public void setPersonalDir(Direccion personalDir) {
        this.personalDir = personalDir;
    }
    
    public void imprimirDatos(){
        System.out.println("\nDATOS PERSONA");
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellido: "+apellido);
        System.out.println("Edad: "+edad);
        if(personalDir != null){
                personalDir.imprimirDatos();
        }else {
            System.out.println("(Sin dirección registrada)");
        }
        }
        //CUANDO LAS CLASES TENGAN OBJETOS DENTRO DE ELLAS
        //asegurarse que tengan datos por default
        //o verificar que no sean null
    }

