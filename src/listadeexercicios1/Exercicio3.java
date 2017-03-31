
package listadeexercicios1;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        double a, b, som;
        System.out.print("Digite o primeiro número: ");
        a = leitor.nextDouble();
        System.out.print("Digite o segundo número: ");
        b = leitor.nextDouble();
        som = (a*a)+(b*b);
        System.out.println("A soma dos quadrados dos dois números é: " + som);
        System.out.println("");
        System.out.println("Fim;");
                
        
        
    }
}
