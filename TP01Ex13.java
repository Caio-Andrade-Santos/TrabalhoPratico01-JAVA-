/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp01ex13;
import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author cavia
 */
public class TP01Ex13 {
    /*Nomes: Caio Andrade, Alexandre Zampiere
            
   13. Calcular e exibir a velocidade final (em km/h) de um automóvel, a partir dos
valores da velocidade inicial (em m/s), da aceleração (m/s²) e do tempo de percurso
(em s) que serão digitados. */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double vInicial;
        double aceleracao;
        double tempo;
        double vFinal;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o valor da velocidade incial em m/s");
        vInicial = scan.nextDouble();
        System.out.println("Digite o valor da aceleracao incial em m/s²");
        aceleracao = scan.nextDouble();
        System.out.println("Digite o valor do tempo do percurso em s");
        tempo = scan.nextDouble();
        vFinal = vInicial + (aceleracao * tempo);
        vFinal = vFinal * 3.6 ;
        System.out.println("Velocidade final: " + vFinal + " km/h");
        
        
        
        
    }
    
}
