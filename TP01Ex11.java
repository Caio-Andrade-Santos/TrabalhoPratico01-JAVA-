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
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // 11. A partir do diâmetro de um círculo que será digitado, calcular e exibir sua área
         //Alexandre Zampieri, Caio Andrade 
        double diametro = 0;
        double raio = 0;
        double area = 0 ;
        double pi = Math.PI;
       
        
        System.out.println("Digite o diametro do circulo: ");
        Scanner scan= new Scanner(System.in); 
        diametro = scan.nextDouble();
        raio = diametro/2;
        area = Math.pow(raio,2) * pi;
        System.out.println("A aréa da circunferencia: " + area); 
    }
    
}
