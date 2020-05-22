/*
Yuri Resende Corrêa - 20157082
 */
package exercicios_cond3;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        
        float n1, n2, n3, n4, nf, nm, med;
        
        Scanner scan = new Scanner (System.in);
        
        System.out.print("Digite seu número de matrícula: ");
        nm = scan.nextInt();
        
        System.out.println("Digite as 4 notas: ");
        n1 = scan.nextInt();
        n2 = scan.nextInt();
        n3 = scan.nextInt();
        n4 = scan.nextInt();
        
        med = (n1 + n2 + n3 + n4) / 4;
        if (med >= 7){
            System.out.println("APROVADO");
            
        }else if (med >= 3.5){
            System.out.println("RECUPERAÇÃO");
            
        }else if (med < 3.5){
            System.out.println("REPROVADO");
            
        }
    }
}
