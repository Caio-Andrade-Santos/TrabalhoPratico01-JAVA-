/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp01ex07;
import java.util.Scanner;
/**
 *
 * @author aluno
 */
public class TP01Ex07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 7. Calcular e exibir a média geométrica de dois valores quaisquer que serão digitados.
        Scanner scanner = new Scanner(System.in);
        double n1,n2;
        
        System.out.println("Digite o primeiro valor: ");
        n1 = scanner.nextDouble();
        
        System.out.println("Digite o segundo valor: ");
        n2 = scanner.nextDouble();
        
        double mediaG = n1*n2;
        
        System.out.println("A média geométrica dos valores é: "+ Math.sqrt(mediaG));
        
    }
    
}
