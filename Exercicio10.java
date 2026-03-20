/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TP01Ex10;
import java.util.Scanner;

/**
 *
 * @author cavia
 */
public class TP01Ex10 {
    /*Nomes: Caio Andrade, Alexandre Zampiere
            
    10. Entrar via teclado com o valor de uma temperatura em graus Celsius, calcular e
exibir sua temperatura equivalente em Fahrenheit. */
    
  /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       double far = 0;
       double cel = 0;
       
        System.out.println("Digite uma temperatura em celcius");
        Scanner scan= new Scanner(System.in); // Pode ser reutilizado
        cel = scan.nextDouble();
        far = (cel * 1.8) + 32;
        System.out.println("O valor em Fahrenheit " + far);
    }
    
}
