/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp01ex04;
import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class TP01Ex04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 4. A partir dos valores da base e altura de um triângulo, calcular e exibir sua área.
        //Alexandre Zampieri, Caio Andrade 
            double base, altura, area;
             Scanner scanner = new Scanner(System.in);
             
             System.out.println("Digite a base do triângulo: ");
             base = scanner.nextDouble();
             
             System.out.println("Digite a altura do triângulo: ");
             altura = scanner.nextDouble();
             
             area = (base * altura) / 2;
             
             System.out.println("A área do triângulo é: " + area);
    }
    
}
