package prj_pa_dowhile;
import java.util.Scanner;
public class mediadoaluno_dw {

	public static void main(String[] args) {
	int i =2 ;
	double n1,n2,media;
	Scanner ler = new Scanner(System.in);
	do {
		System.out.println("entre com a primeira nota");
		n1 = ler.nextDouble();
		System.out.println("entre com a segunda nota");
		n2 = ler.nextDouble();
		media = (n1 + n2)/2;
		System.out.println("media e igual a: "+media);
		System.out.println("\n Deseja continuar? 1-sim / 2-nao");
		i = ler.nextInt();
	}while(i==1);
	ler.close();
	}

}
