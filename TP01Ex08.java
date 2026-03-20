/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp01ex08;
import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class TP01Ex08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 8. Sabendo que uma milha marítima equivale a um mil, oitocentos e cinquenta e dois metros e que um quilômetro possui mil metros, 
        //fazer um programa para converter milhas marítimas em quilômetros.
        //Alexandre Zampieri, Caio Andrade 
          Scanner scanner = new Scanner(System.in);
          
          double milhasMvalor = 1852, milhasMaritimas;
          
          System.out.println("Digite as milhas marítimas : ");
          milhasMaritimas = scanner.nextDouble();
          
          System.out.println("As milhas convertidas para Km: " + milhasMaritimas*milhasMvalor);
          
    }
    
}
