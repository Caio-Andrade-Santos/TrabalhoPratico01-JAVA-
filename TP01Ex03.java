/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp01ex03;
import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class TP01Ex03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 3. Calcular e exibir a área de um quadrado a partir do valor de sua diagonal que será digitado.
        
            double diagonal, area;
             Scanner scanner = new Scanner(System.in);
             
             System.out.println("Digite a diagonal do quadrado: ");
             diagonal = scanner.nextDouble();
             
             area = (diagonal * diagonal) / 2;
             
             System.out.println("A área do quadrado com base na diagonal é: " + area);

    }
    
}
