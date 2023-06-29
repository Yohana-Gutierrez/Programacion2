/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg4.pkg22;
import java.util.Scanner;
/**
 *
 * @author Anny Yohana
 */
public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n; //Valor N=5
        System.out.println("Programa para calcular el producto de 10, 100 y1000");
        System.out.println("Digite un valor para N : ");
        n = entrada.nextInt();
 System.out.println("N\t10*N\t100*N\t1000*N");
 for(int i=1; i<=n; i++){
    System.out.println((i)+"\t "+(10*i)+"\t "+(100*i)+"\t"+(1000*i));
}
}
}


