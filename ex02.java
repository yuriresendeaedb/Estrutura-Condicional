/*
Yuri Resende Corrêa - 20157082
 */
package exercicios_cond3;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        
        int idd;
        
        Scanner scan = new Scanner (System.in);
        
        System.out.print("Digite sua idade: ");
        idd = scan.nextInt();
        
        if (idd >= 5 && idd <= 19){
            System.out.println("JUVENIL");
        
        }else if (idd >= 11 && idd <= 17){
            System.out.println("JUVENIL");
        
        }else if (idd >= 18){
            System.out.println("ADULTO");
        }
    }
}
