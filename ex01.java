/*
Yuri Resende Corrêa - 20157082
 */
package exercicios_cond3;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        
        int num;
        
        Scanner scan = new Scanner (System.in);
        
        System.out.print("Digite um número: ");
        num = scan.nextInt();
        
        if ((num >20) && (num < 90)){
            System.out.println("O número está entre 20 e 90");
        }else{
            System.out.println("O número não está entre 20 e 90");
        }
    }
}
