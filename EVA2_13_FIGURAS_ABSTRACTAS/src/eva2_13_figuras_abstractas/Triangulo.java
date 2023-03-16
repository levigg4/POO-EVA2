package eva2_13_figuras_abstractas;
//RODRIGO LEVI GARCIA GARAY 

public class Triangulo extends Figura{
    private double base;
    private double altura;

    public Triangulo() {
        this.base = 0;
        this.altura = 0;
    }
    
    public Triangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    
    @Override
    public double calcularArea(){
        return base*altura;
    }
    
    @Override
    public double calcularPeri(){
        double suma = (base*base)+(altura*altura);
        return (base+altura+Math.sqrt(suma)); //FALTA HACER CAlC
    }

    /*@Override
    public double calcularArea() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double calcularPeri() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }*/
}
