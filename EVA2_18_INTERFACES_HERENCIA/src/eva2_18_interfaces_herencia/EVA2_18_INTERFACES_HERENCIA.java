package eva2_18_interfaces_herencia;
//RODRIGO LEVI GARCIA GARAY

public class EVA2_18_INTERFACES_HERENCIA {

    public static void main(String[] args) {
        
    }
    
}

interface intA {
    void A();
}

interface intB {
    void B();
}

interface intC extends intA, intB{
    void C();
}

class Prueba implements intC{

    @Override
    public void C() {
        
    }

    @Override
    public void A() {
        
    }

    @Override
    public void B() {
        
    }


}