/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp01ex16;
import java.util.Scanner;
import java.lang.Math;

/*Nomes: Caio Andrade, Alexandre Zampiere
            
   16. Entrar via teclado com o valor de um ângulo em graus, calcular e exibir as 
seguintes funções trigonométricas: seno, cosseno, tangente e secante deste ângulo. 
Lembre-se que uma função trigonométrica trabalha em radianos.  */
/**
 *
 * @author cavia
 */
public class TP01Ex16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        Scanner scan = new Scanner(System.in);
        
        double rad,graus,secante,cos,sen,tg;
        double pi = Math.PI;
        
        System.out.println("Digite um valor em graus");
        graus = scan.nextDouble();
        rad = Math.toRadians(graus);
        
        sen = Math.sin(rad);
        cos = Math.cos(rad);
        tg = Math.tan(rad);
        secante = 1/cos;
        
        System.out.println("o valor do Seno " + sen + "o valor de coseno " + cos + "o valor da tangente \n "
        + tg + " o valor de secante " + secante);
        
        
    }
    
}
