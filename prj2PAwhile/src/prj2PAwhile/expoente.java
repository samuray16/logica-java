package prj2PAwhile;

	import java.util.Scanner;

	public class expoente {
	    public static void main(String[] args) {
	        Scanner ler = new Scanner(System.in);
	        int expoente, base;
	        int resultado = 1;
	        int i = 1;
	        
	        System.out.print("Digite a base: ");
	        base = ler.nextInt();
	        
	        System.out.print("Digite o expoente: ");
	        expoente = ler.nextInt();
	        

	       while (i<= expoente) {
	    	   resultado = resultado * base;
	    	   i++;
	    	   
	       }

	        System.out.println(base + " elevado a " + expoente + " é: " + resultado);

	    }
	}