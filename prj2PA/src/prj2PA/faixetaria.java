package prj2PA;

import java.util.Scanner;

public class faixetaria {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int idade;
		int usuario = 0;
	
		while (usuario <= 9) {
			 usuario++;
			System.out.println("----USUSARIO "+usuario+"---- informe a sua idade: ");
			idade = ler.nextInt();

				if (idade <= 15) {
					System.out.println("faixaetaria: 1");
			} else if (idade <= 30) {
				System.out.println("faixaetaria: 2");
				
			} else if (idade <= 45) {
				System.out.println("faixaetaria: 3");
			} else if (idade <= 60) {
				System.out.println("faixaetaria: 4");
			}else if (idade > 61) {
				System.out.println("faixaetaria: 5");
				
			} else {
				System.out.println("-------");
			}
			 
			
		}
	}

}
