
package listadeexercicios1;

import static java.lang.Math.PI;
import java.util.Scanner;


public class Exercicio6 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        double a, b, c, atr, ac, at, aq, ar, pr;
        System.out.print("Digite um número: ");
        a = leitor.nextDouble();
        System.out.print("Digite um número: ");
        b = leitor.nextDouble();
        System.out.print("Digite um número: ");
        c = leitor.nextDouble();
        
        // Exercício 6 - Letra A:
        
        atr = (a * c) / 2;
        System.out.println("A área do triângulo retângulo com base " + a + " e altura " + c + " é igual à: " + atr );
        
        // Exercício 6 - Letra B:
        
        ac = PI * (Math.pow(c, 2));
        System.out.println("A área do circulo de raio " + c + " é igual a: " + ac);
        
        // Exercício 6 - Letra C:
        
        at = ((a + b)*c) / 2;
        System.out.println("A área do trapézio de bases " + a + " e " + b + " e altura " + c + " é igual a: " + at);
        
        // Exercício 6 - Letra D:
        
        aq = b * b;
        System.out.println("A área do quadrado de lado " + b + " é igual a: " + aq);
        
        // Exercício 6 - Letra E:
        
        ar = a * b;
        System.out.println("A área do retângulo de lados " + a + " e " + b + " é igual a: " + ar);
        
       // Exercício 6 - Letra F:
       
       pr = (a + b) * 2;
        System.out.println("O perímetro do retângulo de lados " + a + " e " + b + " é igual a: " + pr);
        
        System.out.println("Fim!");
       
    }
}
