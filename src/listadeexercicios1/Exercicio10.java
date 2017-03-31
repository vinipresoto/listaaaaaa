
package listadeexercicios1;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        String nom;
        double sfix, tvend, salfin, com = 0.15;
        
        System.out.print("Digite o nome do funcionário: ");
        nom = leitor.nextLine();
        System.out.print("Digite o salário fixo do funcionário R$: ");
        sfix = leitor.nextDouble();
        System.out.print("Digite o total de vendas efetuadas pelo funcionário no mês R$: ");
        tvend = leitor.nextDouble();
        salfin = sfix + (tvend * 0.15);
        System.out.println("O funcionário " + nom + " deverá receber o total de R$: " + salfin);
        
        System.out.println("Fim!");
    }
}
