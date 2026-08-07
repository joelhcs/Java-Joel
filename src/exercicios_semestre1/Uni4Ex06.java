package exercicios_semestre1;
import java.util.Scanner;
public class Uni4Ex06 {
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Digite uma letra: ");
    char letra = scan.next().toUpperCase().charAt(0);
    if (letra == 'M') {
        System.out.println("Masculino");
        }    else if (letra == 'F') {
            System.out.println("Feminino");
        }    else if (letra == 'I') {
            System.out.println("Não Informado");

        }   else {
            System.out.println("Entrada Incorreta");
        }    
        }
}
