package prj2PA;

	import java.util.Scanner;

	public class fibonasci {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite a quantidade de termos da série de Fibonacci: ");
	        int n = scanner.nextInt();

	        int t1 = 1, t2 = 1;

	        System.out.print("Série: ");
	        for (int i = 1; i <= n; i++) {
	            if (i == 1 || i == 2) {
	                System.out.print("1 ");
	            } else {
	                int proximo = t1 + t2;
	                System.out.print(proximo + " ");
	                t1 = t2;
	                t2 = proximo;
	            }
	        }

	        scanner.close();
	    }
	}