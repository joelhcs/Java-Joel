package exercicios_semestre1;
import java.util.Scanner;
public class Uni4Ex08 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Informe a letra");
    char letra = sc.next().toUpperCase().charAt(0);

    if (letra == 'A' ||letra == 'E' ||letra == 'I' ||letra == 'O' ||letra == 'U') {
        System.out.println("É vogal");
        }    else {
            System.out.println("NÃO é vogal");
        }
        
    }
}