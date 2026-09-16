package prj2PAwhile;


import java.util.Scanner;

public class faixaetaria {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int idade;
		int usuario = 0;
		int f1 = 0, f2 =0, f3 =0, f4 =0, f5 = 0;
		
		double p1,p2,p3,p4,p5;
	
		while (usuario <= 9) {
			 usuario++;
			System.out.println("----USUSARIO "+usuario+"---- informe a sua idade: ");
			idade = ler.nextInt();

				if (idade <= 15) {
					f1 = f1 +1;
			} else if (idade <= 30) {
				f2 = f2 +1;
				
			} else if (idade <= 45) {
				f3 = f3 +1;
				
			} else if (idade <= 60) {
				f4 = f4 +1;
				
			}else if (idade > 61) {
				f5 = f5 +1;
			}
		}
				
				p1 = (f1*100) /10;
				p2 = (f2*100) /10;
				p3 = (f3*100) /10;
				p4 = (f4*100) /10;
				p5 = (f5*100) /10;
				
				System.out.println("quantidade de pessoas na faixaetaria 1: "+f1+  "  porcentagem  "+p1+"%");
				System.out.println("quantidade de pessoas na faixaetaria 2: "+f2+  "  porcentagem  "+p2+"%");
				System.out.println("quantidade de pessoas na faixaetaria 3: "+f3+  "  porcentagem  "+p3+"%");
				System.out.println("quantidade de pessoas na faixaetaria 4: "+f4+  "  porcentagem  "+p4+"%");
				System.out.println("quantidade de pessoas na faixaetaria 5: "+f5+  "  porcentagem  "+p5+"%");
				
			 
			
		}
	}

