package prj2PA;

import java.util.Scanner;

public class expoente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a base: ");
        int base = scanner.nextInt();
        System.out.print("Digite o expoente: ");
        int expoente = scanner.nextInt();

        long resultado = 1;

        for (int i = 1; i <= expoente; i++) {
            resultado *= base;
        }

        System.out.println(base + " elevado a " + expoente + " é: " + resultado);

        scanner.close();
    }
}