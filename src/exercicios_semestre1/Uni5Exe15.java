package exercicios_semestre1;
import java.util.Scanner;
public class Uni5Exe15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        String nome = "";
        double nota1, nota2, media;

        System.out.println("Nome: ");
        nome = sc.next();

        while (!nome.equals("fim")) {

            System.out.println("Nota 1: ");
            nota1 = sc.nextDouble();

            System.out.println("Nota 2: ");
            nota2 = sc.nextDouble();

            media = (nota1 + nota2) / 2;

            System.out.printf("A média do(a) " + nome + " é %.2f " , media);

            System.out.println("\nNome: ");
            nome = sc.next();
            
        }
    }
}
