/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp01ex15;
import java.util.Scanner;
import java.lang.Math;

/**
 *
 * @author cavia
 */
public class TP01Ex15 {
 /*Nomes: Caio Andrade, Alexandre Zampiere
            
   15. Entrar via teclado com o valor da cotação do dólar e uma certa quantidade de 
dólares. Calcular e exibir o valor correspondente em Reais (R$). */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double dolar,real,cota;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite a cotação atual do dolar");
        cota = scan.nextDouble();
        System.out.println("Digite a quantidade de dolares");
        dolar = scan.nextDouble();
        real = cota * dolar;
        System.out.println("Valor em reais: R$ " + real);
    }
    
}
