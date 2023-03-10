package eva2_8_super;
//RODRIGO LEVI GARCIA GARAY 
public class EVA2_8_SUPER {

    public static void main(String[] args) {
        Animal animal = new Animal("Gato", 12);
        Mamifero mamifero = new Mamifero("Azul","perry", 8);
        Canes canino = new Canes();
        
    }
    
}
class Animal {
    private String nombre;
    private int peso;
    
    public Animal(){
        System.out.println("ITS ALIVE!!"); 
    }

    public Animal(String nombre, int peso) {
        this.nombre = nombre;
        this.peso = peso;
        System.out.println("ITS ALIVE!!, constructor 2 "); 
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    public void respirar(){
        System.out.println("RESPIRO!!");
    }
    
}
class Mamifero extends Animal {
    private String colorPelo;

    public Mamifero(String colorPelo, String nombre, int peso) {
        super(nombre, peso);//llamada al construcctor de la superclase
        this.colorPelo = colorPelo;
        System.out.println("Soy un mamifero!!, constructor 2");
    }
    
    public Mamifero() {
        //super. --> super apunta a consturctores y metodos de la clase padre o superclase
        //lo primero a llamar en un constructor es llamar 
        //al constructor de la superclase
        super();//llamada al constructor default
        //super.respirar();
        System.out.println("Soy un mamifero!!");
    
    }

    public String getColorPelo() {
        return colorPelo;
    }

    public void setColorPelo(String colorPelo) {
        this.colorPelo = colorPelo;
    }
  
}

class Canes extends Mamifero{

    public Canes() {
        super();
        System.out.println("Soy un can");
    
    }
    
} 