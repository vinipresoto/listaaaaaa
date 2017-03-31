
package listadeexercicios1;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        double n1, n2, n3, n4, med;
        System.out.print("Digite o primeiro número: ");
        n1 = leitor.nextDouble();
        System.out.print("Digite o segundo número: ");
        n2 = leitor.nextDouble();      
        System.out.print("Digite o terceiro número: ");
        n3 = leitor.nextDouble();
        System.out.print("Digite o quarto número: ");
        n4 = leitor.nextDouble();
        med = (n1 + n2 + n3 + n4) / 4;
        System.out.println("A média é: " + med);
        
        System.out.println("Fim!");
    }
}
