
package listadeexercicios1;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        double a, b, c, delta, x1, x2;
        System.out.print("Digite o valor de a: ");
        a = leitor.nextDouble();
        System.out.print("Digite o valor de b: ");
        b = leitor.nextDouble();
        System.out.print("Digite o valor de c: ");
        c = leitor.nextDouble();
        
        delta = ((b*b) -4 * a * c);
        //System.out.println("Delta: " + delta);
        
        if (delta < 0 || a == 0) {
            System.out.println("Impossível calcular");
        }else if (delta == 0) {
            x1 = ((- b) / (2 * a));
            System.out.println("x = " + x1);
        } else {
            x1 = (((-b) + (Math.sqrt(delta))) / (2 * a));
            x2 = (((-b) - (Math.sqrt(delta))) / (2 * a));
            System.out.println("x1 = " + x1 + " e x2 = " +x2);
        }
        System.out.println("Fim!");
        
    }
    
}
      
  
