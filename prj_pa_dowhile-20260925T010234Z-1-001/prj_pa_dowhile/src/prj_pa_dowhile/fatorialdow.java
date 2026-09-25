package prj_pa_dowhile;
import java.util.Scanner;

public class fatorialdow {
	    public static void main(String[] args) {
	        Scanner ler = new Scanner(System.in);
	        int fatorial = 1;
	        int n;
	        System.out.print("Digite um número inteiro: ");
	         n = ler.nextInt();
	        do {
	         fatorial = fatorial * n;
	       	 n--;
	       	 
	        } while( n>0);
	        System.out.println("o fatorial é:" +fatorial);
       	 
	    }
	}