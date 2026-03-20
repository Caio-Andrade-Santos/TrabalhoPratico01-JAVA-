/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp01ex14;
import java.util.Scanner;
import java.lang.Math;

/**
 *
 * @author cavia
 */
public class TP01Ex14 {
    /*Nomes: Caio Andrade, Alexandre Zampiere
            
   14. Calcular e exibir o volume livre de um ambiente que contém uma esfera de raio 
“r” inscrita em um cubo perfeito de aresta “a”. Os valores de “r “ e “a” serão 
digitados. */
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       double r, a, volumeC,volumeE,volumeL;
       double pi = Math.PI;
       Scanner scan = new Scanner (System.in);
       
        System.out.println("Digite a aresta do cubo: ");
        a = scan.nextDouble();
        volumeC = Math.pow(a, 3);
        System.out.println("Digite o raio da esfera: ");
        r = scan.nextDouble();
        volumeE = (4.0/3.0) * pi * Math.pow(r,3);
        volumeL = volumeC - volumeE;
        System.out.println("O valor do volume do cubo: " + volumeC + "o valor do volume da esfera: "
                + volumeE + " o volume livre " + volumeL);
        
    }
    
}
