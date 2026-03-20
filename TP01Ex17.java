/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp01ex17;
import java.util.Scanner;
import java.lang.Math;

/*Nomes: Caio Andrade, Alexandre Zampiere
            
   17. Entrar via teclado com dois valores quaisquer “X” e “Y”. Calcular e exibir o 
cálculo XY (“X” elevado a “Y”). Pesquisar as funções Exp e Ln.   */

/**
 *
 * @author cavia
 */
public class TP01Ex17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      
      double x,y,res;
      
        System.out.println("Digite um valor para x");
        x = scan.nextDouble();
        System.out.println("Digite um valor para y");
        y = scan.nextDouble();
        
        res = Math.pow(x,y);
        
        System.out.println("X elevado a Y: " + res);
        
        System.out.println("Exp(x): " + Math.exp(x));
        System.out.println("Ln(x): " + Math.log(x));
    }
    
}
