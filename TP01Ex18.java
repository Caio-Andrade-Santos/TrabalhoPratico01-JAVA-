/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp01ex18;
import java.util.Scanner;
import java.lang.Math;

/*Nomes: Caio Andrade, Alexandre Zampiere
            
  18. Entrar via teclado com o valor de cinco produtos. Após as entradas, digitar um 
valor referente ao pagamento da somatória destes valores. Calcular e exibir o troco 
que deverá ser devolvido.    */

/**
 *
 * @author cavia
 */
public class TP01Ex18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double produto,pagamento,produtos = 0;
        
        for(int i = 1; i<=5; i++){
            System.out.println("Digite o valor do produto " + i);
            produto = scan.nextDouble();
            produtos = produtos + produto;
        }
        System.out.println("O total de produtos em R$" + produtos);
        
        System.out.println("Digite o valor de pagamento");
        pagamento = scan.nextDouble();
        
        while(pagamento < produtos){
            System.out.println("Insira o valor de pagamento correto");
            pagamento = scan.nextDouble();
        }
        double troco = pagamento - produtos;
        System.out.println("O seu troco é de " + troco);
                
                
    }
    
}
