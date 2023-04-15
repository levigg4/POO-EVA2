package eva2_22_polimorfismo_figuras;
//RODRIGO LEVI GARCIA GARAY

//implements = extends para interfaces
//se pueden incorporar varias interaces mediante comas
public class Circulo implements Figuras, MostrarDatos{
     private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public Circulo() {
        this.radio = 0.0;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public double calcularPerim() {
        return Math.PI * radio * 2;
    }

    @Override
    public void imprimirDatos() {
        System.out.println("\nDATOS CIRCULO");
        System.out.println("Radio: "+radio);
        System.out.println("Área: "+calcularArea());
        System.out.println("Perímetro: "+calcularPerim()+"\n");
    }
}
