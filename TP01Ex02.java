/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp01ex02;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class TP01Ex02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 2. Calcular e exibir a área de um quadrado, a partir do valor de sua aresta que será digitado.
        //Alexandre Zampieri, Caio Andrade 
            Scanner scanner = new Scanner(System.in);

        double area, aresta;
        System.out.println("Digite a aresta do quadrado: ");
        aresta = scanner.nextDouble();
        
        area = aresta * aresta;
        
        System.out.println("Com base na aresta digitada, o valor da área do quadrado é: " + area);

    }
    
}
