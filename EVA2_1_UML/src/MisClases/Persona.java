package MisClases;

public class Persona {
    private String nombre;
    private String ID;
    private int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String name) {
        this.nombre = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String identificacion) {
        this.ID = identificacion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int age) {
        this.edad = age;
    }
    
    public void imprimirDatos(){
        System.out.println("Esta es el ID: "+ID);
        System.out.println("Esta es el nombre: "+nombre);
        System.out.println("Esta es la edad: "+edad);
        
    }
    
}
