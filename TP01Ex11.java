/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp01ex11;
import java.util.Scanner;
import java.lang.Math;

/**
 *
 * @author cavia
 */
public class TP01Ex11 {
    /*Nomes: Caio Andrade, Alexandre Zampiere
            
    10. Entrar via teclado com o valor de uma temperatura em graus Celsius, calcular e
exibir sua temperatura equivalente em Fahrenheit. */

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double diametro = 0;
        double raio = 0;
        double area = 0 ;
       
        
        System.out.println("Digite o diametro do circulo");
        Scanner scan= new Scanner(System.in); // Pode ser reutilizado
        diametro = scan.nextDouble();
        raio = diametro/2;
        area = Math.pow(raio,2) * 3.14;
        System.out.println("A aréa da circunferencia" + area); 
    }
    
}
