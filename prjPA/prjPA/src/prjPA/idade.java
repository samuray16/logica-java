package prjPA;

import java.util.Scanner;

public class idade {

	public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);
			int anoA, anoN,idade; 
			int i = 1;
			while (i <=6) {
			System.out.println("----usuario-----"+i);
			System.out.println("digite seu ano de nascimento: ");
			anoN = ler.nextInt();
			System.out.println("digite o ano atual: ");
			anoA = ler.nextInt();
			idade = anoA - anoN;
			if (idade <= 18) {
				System.out.println("sua idade é "+idade+ " menor de idade");
			}else {
				System.out.println("sua idade é "+idade+ " maior de idade");
				
			} i++;
	}   
			
	}

}
