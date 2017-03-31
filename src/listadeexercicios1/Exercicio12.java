
package listadeexercicios1;

import static java.lang.Math.PI;
import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        double l, r, al, ar;
        System.out.print("Digite a medida de um dos lados do quadrado: ");
        l = leitor.nextDouble();
        System.out.print("Digite a medida do raio do circulo: ");
        r = leitor.nextDouble();
        al = l * l;
        ar = PI * Math.pow(r, 2);
        if (al > ar) {
            System.out.println("Quadrado!");
        } else {
            System.out.println("Circulo!");
        }
        System.out.println("Fim!");
    }
}
