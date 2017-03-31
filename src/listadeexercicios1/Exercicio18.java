
package listadeexercicios1;

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        double a, b, c;
        System.out.print("Digite o maior número: ");
        a = leitor.nextDouble();
        System.out.print("Digite o segundo maior número: ");
        b = leitor.nextDouble();
        System.out.print("Digite o menor numero: ");
        c = leitor.nextDouble();
        if ((a >= b + c)) {
            System.out.println("Não forma triângulo!");
        } 
        if ((a * a) == (b * b) + (c * c)) {
            System.out.println("Triângulo retângulo!");
        } 
        if ((a * a) > (b * b) + (c * c)) {
            System.out.println("Triângulo obtusângulo!");
        } 
        if ((a * a) < (b * b) + (c * c)) {
            System.out.println("Triângulo acutângulo!"); 
        } 
        if ((a == b) && (b == c) && (c == a)) {
            System.out.println("Triângulo equilátero!");
        } 
        if (((a == b) && (a != c) && (b != c)) || ((b == c) && (b != a) && (c != a)) || ((c == a) && (c != b) && (b != a))){
            System.out.println("Triângulo isósceles!");
        }
            System.out.println("Fim!");
    }
}
