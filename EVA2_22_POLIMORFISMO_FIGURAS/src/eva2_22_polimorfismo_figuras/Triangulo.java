package eva2_22_polimorfismo_figuras;
//RODRIGO LEVI GARCIA GARAY 

public class Triangulo implements Figuras,MostrarDatos{
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Triangulo() {
        base = 0.0;
        altura = 0.0;
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
    public double calcularArea() {
        return base * altura * 0.5;
    }

    @Override
    public double calcularPerim() {
        //se asume que es un triangulo rectangulo
        return base + altura + Math.hypot(base, altura);
    }

    @Override
    public void imprimirDatos() {
        System.out.println("\nDATOS TRIÁNGULO");
        System.out.println("Base: "+base);
        System.out.println("Altura: "+altura);
        System.out.println("Área: "+calcularArea());
        System.out.println("Perímetro: "+calcularPerim());
    }
}
