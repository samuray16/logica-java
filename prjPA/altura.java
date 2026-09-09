package prjPA;

public class altura {

	public static void main(String[] args) {
		double j = 134;
		double p = 145;
		double i = 0;
		while (p>j) {
			System.out.println("quantidade de anos:  "+i);
			p = p+ 2;
			j = j+ 2.5;
			i = i + 1;
			System.out.println( "a altura de pedro é: "+p+ " e a do joão é " +j+ " centimetros" );
			System.out.println("-------------------------------------------------------");
			
		}
		
		System.out.println(" a quantidade de anos que vai levar para joão ficar maior que o pedro é de: "+i+ " anos");
	}

}
