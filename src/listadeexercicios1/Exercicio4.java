
package listadeexercicios1;

import java.util.Scanner;


public class Exercicio4 {
    public static void main(String[] args) {
       Scanner leitor = new Scanner (System.in);
       int n1, n2, pn1, pn2;
        System.out.print("Digite o primeiro número: ");
        n1 = leitor.nextInt();
        System.out.print("Digite o segundo número: ");
        n2 = leitor.nextInt();
        pn1 = n1+1;
        System.out.println("O número consecutivo ao primeiro número digitado é: " + pn1);
        pn2 = n2+1;
        System.out.println("O número consecutivo ao segundo número digitado é: " + pn2);
        System.out.println("");
        System.out.println("Fim;");
        
        
    }
}
