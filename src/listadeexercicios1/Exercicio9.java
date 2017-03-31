
package listadeexercicios1;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        int cad;
        double ht, vh, sal;
        System.out.print("Digite o número de cadastro do funcionário: ");
        cad = leitor.nextInt();
        System.out.print("Digite a quantidade de horas trabalhadas deste funcionário: ");
        ht = leitor.nextDouble();
        System.out.print("Digite o valor da hora deste funcionário (R$): ");
        vh = leitor.nextDouble();
        sal = ht * vh;
        System.out.println("O número de cadastro deste funcionário é " + cad + " e o salário dele é R$: " + sal);
        
        System.out.println("Fim!");
      
        
    }
}
