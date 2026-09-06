 package prjJPA;
import java.util.Scanner;
public class idAluno {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int idAluno;
        System.out.println("digite a idade do aluno");
        idAluno = ler.nextInt();
        switch(idAluno) {
        case 6:
            System.out.println("Aluno Dente de Leite");
            break;
        case 7:
            System.out.println("Aluno Junior");
            break;
        case 8:
            System.out.println("Aluno Junior Max");
            break;
        case 9:
            System.out.println("Aluno Junior Master");
            break;
        case 10:
            System.out.println("Aluno Master");
            break;
        default:
            System.out.println("aluno nao classificado");
            
        }
        
      }
    }