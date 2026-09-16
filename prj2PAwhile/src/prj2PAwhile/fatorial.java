package prj2PAwhile;

import java.util.Scanner;

public class fatorial {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int fatorial = 1;
        int n;

        System.out.print("Digite um número inteiro: ");
         n = ler.nextInt();
        
         while (n > 0) {
        	 fatorial = fatorial * n;
        	 n--;
         }
        

        System.out.println("O fatorial de " + n + " é: " + fatorial);

    }
}