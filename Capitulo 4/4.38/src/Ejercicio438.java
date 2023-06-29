/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
   import java.util.Scanner;
/**
 *
 * @author Anny Yohana
 */
        public class Ejercicio438 {

        public static void main (String[] args) {

        Scanner entrada=new Scanner(System.in);

        int numero;
        int factorial;
        double x;

            System.out.println("\n------------Operaciones con factorial------------");

            System.out.println("\n a)Calculando el factorial de un entero no negativo");
            do{

            System.out.print("Por favor, ingrese un numero entero >=0: ");

            numero=entrada.nextInt();
            if(numero<0)

            System.out.println("Numero incorrecto, intente de nuevo.");

        }while(numero<0);

            factorial=calculaFactorial(numero);

            System.out.println("El factorial de "+numero+" es "+factorial);

            System.out.println("\n b)Estimando el valor de la constante matemática e");

            System.out.println("El valor aproximado de e es: "+calculaE());

            System.out.println("\n c)Estimando el valor de e^x");

            System.out.print("Por favor, ingrese un numero: ");

            x=entrada.nextDouble();
            System.out.println("El valor aproximado de e^x es: "+calculaEaX(x));

            }
        //metodo para calcular factorial de un entero positivo
        public static int calculaFactorial(int n){

        int factorial=1;
        if(n!=0){
        for (int i=1;i<=n;i++){
        factorial=factorial*i;
        }

        }
        return factorial;
        }
        //metodo para calcular e
        public static double calculaE(){
        double e=1;
        for (int i=1;i<=19;i++) {
        e=e+(1/(double)calculaFactorial(i));
        }
        return e;
        }
        //metodo para calcular e^x
        public static double calculaEaX(double x){
        double ex=1;
        for (int i=1;i<=19;i++) {
        ex=ex+((Math.pow(x,i))/(double)calculaFactorial(i));
        }
        return ex;
        }
        }
