/*
Yuri Resende Corrêa - 20157082
 */
package exercicios_cond3;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        
        float sal;
        
        Scanner scan = new Scanner (System.in);
        
        System.out.print("Digite seu salário: R$");
        sal = scan.nextInt();
        
        if (sal <= 1000) {
            System.out.println("15% - R$"+(((sal * 15) / 100) + sal));
            
        }else if (sal > 1000 && sal <= 2500) {
             System.out.println("7% - R$"+(((sal * 7) / 100) + sal));
        
        }else{
            System.out.println("Sem aumento.");
        }
    }
}
