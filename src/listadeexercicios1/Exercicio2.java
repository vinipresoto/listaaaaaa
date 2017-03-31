
package listadeexercicios1;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
       Scanner leitor = new Scanner (System.in);
       double bas, exp, res;
        System.out.println("Encontrando a potência");
        System.out.print("Digite o número que será a base: ");
        bas = leitor.nextInt();
        System.out.print("Digite o número que será o expoente: ");
        exp = leitor.nextInt();
        res = Math.pow(bas, exp); 
        System.out.println("O resultado da potência é: "+res);
        System.out.println("");
        System.out.println("Fim;");
               
        
    }
    
}
