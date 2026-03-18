/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp01ex12;
import java.util.Scanner;
import java.lang.Math;

/**
 *
 * @author cavia
 */
public class TP01Ex12 {
  /*Nomes: Caio Andrade, Alexandre Zampiere
            
   12. Calcular e exibir o volume de um cone a partir dos valores da altura e do raio da
base que serão digitados. */

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double altura;
        double raio;
        double volume;
        double pi = Math.PI;
      
        System.out.println("Digite o valor da Altura de um cone");
        Scanner scan = new Scanner(System.in);
        altura = scan.nextDouble();
        System.out.println("Digite o valor do Raio da base de um cone");
        raio = scan.nextDouble();
        volume = ((1*pi)/3) * Math.pow(raio, 2) * altura;
        System.out.println("o Volume do cone é: " + volume );
        
    }
    
}
