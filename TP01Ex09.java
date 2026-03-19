/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp01ex09;
import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class TP01Ex09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 9. Calcular e exibir a tensão de um determinado circuito eletrônico a partir dos valores da resistência e corrente elétrica que serão digitados.
        //Utilize a lei de Ohm.
        double corrente, res, tensao;
            Scanner scanner = new Scanner(System.in);
            
        System.out.println("Digite o valor da resistência: ");
        res = scanner.nextDouble();
        
        System.out.println("Digite o valor da corrente elétrica: ");
        corrente = scanner.nextDouble();
        
        tensao = corrente*res;
        
        System.out.println("A tensão referente aos valores digitados é: "+ tensao+"V");
    }
    
}
