/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp01ex06;
import java.util.Scanner;
/**
 *
 * @author aluno
 */
public class TP01Ex06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 6. Calcular e exibir a média aritmética de quatro valores quaisquer que serão digitados.
        //Alexandre Zampieri, Caio Andrade 
        int i = 1;
             Scanner scanner = new Scanner(System.in);
             double valorDigitado = 0, soma = 0;
        do {
        
            System.out.println("Digite o valor " + i +": ");
            valorDigitado = scanner.nextDouble();
            soma += valorDigitado;
            i++;
        } while (i < 5);
        
        double media = soma / 4;
          System.out.println("A média é : " + media);

    }
    
}
