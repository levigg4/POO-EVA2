package eva2_22_polimorfismo_figuras;
//RODRIGO LEVI GARCIA GARAY

import java.util.Scanner;


public class EVA2_22_POLIMORFISMO_FIGURAS {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Numero de figuras: ");
        int n = sc.nextInt();
        Figuras[] figArray = new Figuras[n];
        for(int i=0 ; i<n ; i++){
            System.out.print("Figuras:\n1.Circulo\n2. Triangulo\n ");
            int x = sc.nextInt();
            if(x == 1){
                Circulo Circu = new Circulo();
                System.out.print("Radio: ");
                Circu.setRadio(sc.nextDouble());
                figArray[i] = Circu;
            }
            else {
                Triangulo Trian = new Triangulo();
                System.out.print("Base: ");
                Trian.setBase(sc.nextDouble());
                System.out.print("Altura:");
                Trian.setAltura(sc.nextDouble());
                figArray[i] = Trian;

            }
        }
        
        for(int i=0 ; i<figArray.length ; i++){
            System.out.println();
            if(figArray[i] instanceof Circulo){
                System.out.println("Figura "+(i+1)+": CIRCULO");
                Circulo Circ =(Circulo)figArray[i]; //CASTING
                //regresando de "Figura" a Circulo/Triangulo
                Circ.imprimirDatos();
            }
            else{
                System.out.println("Figura "+(i+1)+": TRIANGULO");
                Triangulo Trian = (Triangulo)figArray[i]; //CASTING
                Trian.imprimirDatos();
                
            }
        }
        
    }
       /*Circulo circle = new Circulo(5);
        circle.imprimirDatos();
        Figuras figu = circle; //reduciendo de figura a circulo
        System.out.println("Area: "+figu.calcularArea());
        // los datos (que se pueden) se heredan
        // figu sigue siendo circulo visto de otra manera
        // (reduciendole atributos/metodos)
        
        //int[] a, b, c TODOS SON ARREGLOS
        Circulo[] circArr = new Circulo[10]; //ninguno ha sido creado
        //NullPoinerException => no se ha creado el objeto
        
        for(int i=0 ; i<circArr.length ; i++){
            circArr[i] = new Circulo(i);
            circArr[i].calcularArea();
            circArr[i].imprimirDatos();
            //creando objeto en index i
        }*/
        
    }
    

