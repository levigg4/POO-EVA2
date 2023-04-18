package eva2_24_collections;
import java.util.ArrayList;
//RODRIGO LEVI GARCIA GARAY 
public class EVA2_24_COLLECTIONS {

    public static void main(String[] args) {
        ArrayList objArray = new ArrayList();
        objArray.add(new Persona());
        objArray.add(new Perro());
        objArray.add(new Automovil());
        System.out.println(objArray);
        
        //especificando int con "integer"
        ArrayList <Integer> intArray = new ArrayList();
        intArray.add(100);
        intArray.add(200);
        intArray.add(300);
        intArray.add(400);
        System.out.println(intArray);
    }
    
}
    class Persona{

    }
    class Automovil{
        
    }
    class Perro{

    }
        
