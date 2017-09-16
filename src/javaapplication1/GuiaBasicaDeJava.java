/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Scanner;
/**
 *
 * @author pc1
 */
public class GuiaBasicaDeJava {
    /**
     * @param args the command line arguments
     */
    private static Scanner teclado;
    
    public static void main(String[] args) {
        teclado = new Scanner(System.in);
        teclado.useDelimiter("\n"); // permite ingresar cadenas separadas por Enter
        //ejercicio3();
        //ejercicio4Asignacion();
        //ejercicio4Teclado();
        //ejercicio5();
        //ejercicio6();
        //ejercicio7();
        ejercicio8();
        
    }
    public static void visualizarVariables (int a, int b, int c){  
        System.out.println("* El valor de la variable a es:"+a);
        System.out.println("* El valor de la variable b es:"+b);
        System.out.println("* El valor de la variable c es:"+c);
    }
    public static void ejercicio3 (){
        int a=10;
        int b=-8;
        int c=36;
        int aux=0;
        visualizarVariables(a, b, c);
        aux=a;
        a=b;
        b=c;
        c=aux;
        visualizarVariables(a, b, c);
    }
    
    public static void mayor(int valor1, int valor2){
        if (valor1>valor2){
            System.out.println("\n* El mayor de las varibles es 'valor1' con:"+valor1);
        }else {
            if (valor2>valor1){
                System.out.println("\n* El mayor de las varibles es 'valor2' con:"+valor2);
            }else{
                System.out.println("\n* Las variables 'valor1' y 'valor2' son iguales");
            }
        }
    }
    
    public static void ejercicio4Asignacion(){
        /**
         * comparacion a traves de asignacion a las variables
         */
        int valor1=10;
        int valor2=13;
        mayor(valor1,valor2);
        valor1=57;
        valor2=13;
        mayor(valor1,valor2);
    }
    public static void ejercicio4Teclado(){
        /**
         * comparacion a traves de asignacion por teclado a las variables
         */        
        System.out.print("\nEscriba el 1er. valor: ");
        int valor1= teclado.nextInt();
        System.out.print("\nEscriba el 2do. valor: ");
        int valor2= teclado.nextInt();
        mayor(valor1,valor2);
        System.out.print("\nEscriba el 1er. valor: ");
        valor1= teclado.nextInt();
        System.out.print("\nEscriba el 2do. valor: ");
        valor2= teclado.nextInt();
        mayor(valor1,valor2);
    }
    
    public static void ejercicio5(){
        /**
         *  Declara un String que contenga tu nombre, después muestra un mensaje de
         * bienvenida por consola. Por ejemplo: si introduzco “Fernando”, me aparezca
         * “Bienvenido Fernando”.
         */
        String nombre = "Rocio";
        System.out.println("\nBienvenida "+nombre);
    }
    
    public static void ejercicio6(){
        /**
         *  Modifica la aplicación anterior, para que nos pida el nombre que queremos introducir
            por teclado.
         */
        System.out.print("Introduzca su Nombre: ");
        String nombre= teclado.next();
        System.out.println("\n\nBienvenida "+nombre);
    }
    
    public static void ejercicio7(){
        /**
         * Haz una aplicación que calcule el área de un círculo (pi*R2). El radio se pedirá por
         * teclado.
         */
    }
    public static void ejercicio8(){
        /**
         *  Lee un número por teclado e indica si es divisible entre 2. Si no lo es, también
            debemos indicarlo.
         */
        System.out.print("Introduzca un valor: ");
        Double numero= teclado.nextDouble();
        if ((numero%2)== 0){
            System.out.println(numero+" es divisible por 2");
        }else{
            System.out.println(numero+" NO es divisible por 2");
        }
    }
    
    public static void ejercicio9(){
        /**
         * Lee un número por teclado y muestra por consola, el carácter al que pertenece en la
         * tabla ASCII. Por ejemplo: si introduzco un 97, me muestre una a.
         */
        System.out.print("Introduzca un numero: ");
        int numero= teclado.nextInt();
        System.out.print("\nEl numero introducido es: "+numero);
        
    }
    
    public static void ejercicio10(){
        /**
         * Modifica el ejercicio anterior, para que en lugar de pedir un número, pida un carácter
         * (char) y muestre su código en la tabla ASCII.
         */
    }
    
    public static void ejercicio11(){
        /**
         * Lee un número por teclado que pida el precio de un producto y calcule el precio final
         * con IVA. El IVA sera una constante que sera del 21%.
         */
    }
    
   public static void ejercicio12(){
       /**
        * Muestra los números del 1 al 100 (ambos incluidos). Usa un bucle while
        */
   }
}
