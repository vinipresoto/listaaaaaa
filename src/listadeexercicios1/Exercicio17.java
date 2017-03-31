
package listadeexercicios1;

import java.util.Scanner;


public class Exercicio17 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        int a, b, c, d;
        System.out.print("Digite o valor de a: ");
        a = leitor.nextInt();
        System.out.print("Digite o valor de b: ");
        b = leitor.nextInt();
        System.out.print("Digite o valor de c: ");
        c = leitor.nextInt();
        System.out.print("Digite o valor de d: ");
        d = leitor.nextInt();
        if (b > c && d > a && c + d > a + b && c > 0 && d > 0 && a % 2 == 0 ) {
            System.out.println("Valores aceitos!");
        } else 
            System.out.println("Valores não aceitos!");
        
        System.out.println("Fim!");
                
                
                
    }
 
}
