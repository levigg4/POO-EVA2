package eva2_11_override_figuras;
//RODRIGO LEVI GARCIA GARAY 

public class Circulo extends Figura{
    private double radio;

    public Circulo() {
       this.radio = 0;
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    @Override
    public double calcularArea(){
        return Math.PI*radio*radio;
    }
    
    @Override
    public double calcularPeri(){
        return Math.PI*(radio*2);
    }
    
    
}
