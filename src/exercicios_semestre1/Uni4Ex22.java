package exercicios_semestre1;
import java.util.Scanner;
public class Uni4Ex22 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite o número do seu curso:");
    System.out.println("1 - Ciência da Computação\n2 - Licenciatura da computação\n3 - Sistemas de Informação");
    int curso = sc.nextInt();
    switch (curso) {
        case 1:
            System.out.println("Bacharel em Ciência da Computação");
            break;
        case 2:
            System.out.println("Licenciado em Computação");
            break;
        case 3:
            System.out.println("Bacharel em Sistemas de Informação");
            default:
            break;
    }
}
}
