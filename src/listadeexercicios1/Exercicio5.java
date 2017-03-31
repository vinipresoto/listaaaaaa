
package listadeexercicios1;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
    Scanner leitor = new Scanner (System.in);
    double lad, qua;
    System.out.print("Digite o número desejado: ");
    lad = leitor.nextDouble();
    qua = (lad * lad);
        System.out.println("A área de um quadrado de lado " + lad + " é: " + qua);
        System.out.println("Fim!");
}

}