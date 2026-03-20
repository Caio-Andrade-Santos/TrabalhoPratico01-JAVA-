/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp01ex05;
import java.util.Scanner;
import java.lang.Math;

/**
 *
 * @author aluno
 */
public class TP01Ex05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 5. Calcular e exibir o volume de uma esfera a partir do valor de seu diâmetro que será digitado.
        //Alexandre Zampieri, Caio Andrade 
            double volume, diametro, raio;
            double pi = Math.PI; 
             Scanner scanner = new Scanner(System.in);
             
              System.out.println("Digite o diametro da esfera: ");
             diametro = scanner.nextDouble();
             
             raio = diametro / 2;
             
             volume = ((4 * pi)/3) * Math.pow(raio, 3);
             
             System.out.println("A área do triângulo é: " + volume);

    }
    
}
