package prj2PAwhile;
import java.util.Scanner;

public class fibonacci {

	    public static void main(String[] args) {
	        Scanner ler = new Scanner(System.in);
	        int n,tvN;
	        int tA = 1;
	        int taN = 1;
	        int i = 3;
	        System.out.print("Digite a quantidade de termos da série de Fibonacci: ");
	         n = ler.nextInt();
	         System.out.println(taN);
	         System.out.println(tA);
	          while ( i <= n) {
	        	  tvN = taN + tA;
	        	  System.out.println(tvN);
	        	  taN = tA;
	        	  tA = tvN;
	        	  i++;
	          }
	         	

	       
	    }
	}
