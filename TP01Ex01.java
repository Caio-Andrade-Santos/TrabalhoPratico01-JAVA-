/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp01ex01;

import java.util.Scanner;
import java.util.Locale;
/**
 *
 * @author aluno
 */
public class TP01Ex01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            /**
     *     1. Entrar via teclado com a base e a altura de um retângulo, calcular e exibir sua área.
     */
        
       Scanner scanner = new Scanner(System.in);
        double area, base, altura;
        
         System.out.print("Digite a base do retâgulo: ");
         base = scanner.nextDouble();
        
        System.out.print("Digite a base do retâgulo: ");
         altura = scanner.nextDouble();
        if( base != altura)
        {
        area = base * altura;
        
        System.out.println("A área é: " + area);
        }
        else
        {
            System.out.println("Os valores digitados são iguais, a forma geométrica não é um retangulo!");
        }
       
        scanner.close();
        
    }
    
}
