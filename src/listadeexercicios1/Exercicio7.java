
package listadeexercicios1;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
    Scanner leitor = new Scanner (System.in);
    double a, b, hip;
        System.out.print("Digite o primeiro cateto: ");
        a = leitor.nextDouble();
        System.out.print("Digite o segundo cateto: ");
        b = leitor.nextDouble();
        hip = Math.sqrt((a*a) + (b * b));
        System.out.println("A hipotenusa do triangûlo retângulo com catetos " + a + " e " + b + " é igual a: " + hip);
        
        System.out.println("Fim!");
    }
}
