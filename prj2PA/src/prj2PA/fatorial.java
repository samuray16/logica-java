package prj2PA;

import java.util.Scanner;

public class fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int num = scanner.nextInt();
        long fatorial = 1;

        for (int i = num; i >= 1; i--) {
            fatorial *= i;
        }

        System.out.println("O fatorial de " + num + " é: " + fatorial);

    }
}
