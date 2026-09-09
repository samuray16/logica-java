package prjPA;

import java.util.Scanner;

public class tabuada {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int incre = 1;
		int produto,numero;
		System.out.println("digite qualquer numero");
		numero = ler.nextInt();
		while(incre <= 10) {
			produto = numero*incre;
			System.out.println(+numero+" x  "+incre+" = "+produto);
			incre = incre + 1;
			
			
			
			
			
		}
		
	
	
	
	}

}
