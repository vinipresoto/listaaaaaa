
package listadeexercicios1;

import java.util.Scanner;

public class Exercicio16 {
   public static void main(String[] args) { 
   Scanner leitor = new Scanner (System.in);
   int hi, hf, reshi, resfi;
       System.out.print("Digite a hora inicial do jogo: ");
       hi = leitor.nextInt();
       System.out.print("Digite a hora final do jogo: ");
       hf = leitor.nextInt();
       if (hi > hf) {
               reshi = ((24 - hi) + (hf));
               
               System.out.println("O jogo durou " + reshi + " hora(s)");
               }else if (hi == hf){
                   System.out.println("O jogo durou 0 hora");
               }else {
                   resfi = (hf - hi);
                   System.out.println("O jogo durou: " + resfi + " hora(s)");
       System.out.println("Fim!");
    }
   }
}