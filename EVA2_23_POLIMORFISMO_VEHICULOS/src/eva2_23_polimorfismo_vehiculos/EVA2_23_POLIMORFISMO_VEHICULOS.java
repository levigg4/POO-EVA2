package eva2_23_polimorfismo_vehiculos;
//  RODRIGO LEVI GARCIA GARAY 
public class EVA2_23_POLIMORFISMO_VEHICULOS {

    public static void main(String[] args) {
          //modelo año marca vel
        Automovil auto1 = new Automovil("Civic", 2006, "Honda", 20);
        //tipo, rodada, marca, vel
        Bicicleta bici1 = new Bicicleta("Carreras", "28", "BMX", 5);
        
        cambiarVelocidad(auto1, 51);
        cambiarVelocidad(bici1, 16);
        //revisar superclase object
    }
    
    //NO se está instanciando cambiarVelocidad
    public static void cambiarVelocidad(DatosVehiculo vehi, int vel){
    //se está pasando de bici/auto (nombre obj)a datos vehiculo
    vehi.acelerar(vel);
    vehi.MostrarDatos();
}
}



interface DatosVehiculo{
    public abstract void acelerar(int cambio);  //modificar la velocidad
    public abstract void MostrarDatos(); //imprimir datos 
}

class Vehiculo{
    private String marca;
    protected int velocidad;

    public Vehiculo(String marca, int velocidad) {
        this.marca = marca;
        this.velocidad = velocidad;
    }

    public Vehiculo() {
        marca = "-----";
        velocidad = 0;
    }
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getVelocidad() {
        return velocidad;
    }
}

class Automovil extends Vehiculo implements DatosVehiculo{
    private String modelo;
    private int año;

    public Automovil(String modelo, int año, String marca, int velocidad) {
        super(marca, velocidad);
        this.modelo = modelo;
        this.año = año;
    }
    
    public Automovil(){
        super();
        modelo= "----";
        año = 0;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
    
    @Override
    public void acelerar(int cambio) {
        
        velocidad += cambio;
        if(cambio <= 0){ //solo cambios positivos
            velocidad = 0;
        }
    }

    @Override
    public void MostrarDatos() {
        System.out.println("\nDATOS AUTOMOVIL");
        System.out.println("Marca: "+ getMarca());
        System.out.println("Año: "+ año);
        System.out.println("Modelo: "+ modelo);
        System.out.println("Velocidad automóvil: "+velocidad);
    }
}

class Bicicleta extends Vehiculo implements DatosVehiculo{
    private String tipo; // carreras, montaña, infantil.
    private String rodada; // CM

    public Bicicleta(String tipo, String rodada, String marca, int velocidad) {
        super(marca, velocidad);
        this.tipo = tipo;
        this.rodada = rodada;
    }

    public Bicicleta() {
        super();
        tipo = "------";
        rodada = "------";
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getRodada() {
        return rodada;
    }

    public void setRodada(String rodada) {
        this.rodada = rodada;
    }

    @Override
    public void acelerar(int cambio) {
        velocidad += cambio;
        if(cambio <= 0){ //solo cambios positivos
            velocidad = 0;
        }
        
        }

    @Override
    public void MostrarDatos() {
        System.out.println("\nDATOS BICICLETA");
        System.out.println("Marca: "+ getMarca());
        System.out.println("Tipo: "+ tipo);
        System.out.println("Rodada (cm): " + rodada);
        System.out.println("Velocidad: "+ velocidad);
    }
    
}


    

