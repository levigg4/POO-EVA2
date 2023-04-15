package eva2_15_tienda;
import Productos.*;

//RODRIGO LEVI GARCIA GARAY 


public class EVA2_15_TIENDA {
    
    public static void main(String[] args) {
        Computadora compu = new Computadora(16, 128, "Intel CORE i3", "SDD", 28, "Pavilion", "HP", 6500.00, "HP LAPTOP", "P2");
        System.out.println(compu);//toString();
        Playera playe = new Playera("Nike", "Negro", 999.99, "Dri-fit BKLYN NETS", "P2");
        System.out.println(playe); //toString();
    }
    
}
