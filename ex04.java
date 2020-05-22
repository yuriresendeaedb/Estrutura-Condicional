/*
Yuri Resende Corrêa - 20157082
 */
package exercicios_cond3;

import java.util.Scanner;

public class ex04 {
        public static void main(String[] args) {
        
            int a, b, c;
            
            Scanner scan = new Scanner (System.in);
            
            System.out.print("1º lado do triângulo: ");
            a = scan.nextInt();
            System.out.print("2º lado do triângulo: ");
            b = scan.nextInt();
            System.out.print("3º lado do triângulo: ");
            c = scan.nextInt();
            
            if (((a + b) > c) && ((a + c) > b) && ((b + c) > a)){
            /// VERIFICAR SE O TRIÃNGULO EXISTE
                System.out.println("\n");
                if (a == b && b == c){
                    System.out.println("EQUILÁTERO");
                
                }else if (a == b || a == c || b == c){
                    System.out.println("ISÓCELES");
                
                }else if (a != b && b != c){
                    System.out.println("ESCALENO");
                }
            
            }else{
                System.out.println("Esse triãngulo não existe.");
            }
    }
}
