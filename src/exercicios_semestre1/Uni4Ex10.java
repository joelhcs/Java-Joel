package exercicios_semestre1;
import java.util.Scanner;
public class Uni4Ex10 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Idade de Marquinhos: ");
    int idadeMarquinhos = sc.nextInt();
    System.out.println("Idade de Zezinho");
    int idadeZezinho = sc.nextInt();
    System.out.println("Idade de Luluzinha: ");
    int idadeLuluzinha = sc.nextInt();
    if (idadeMarquinhos < idadeLuluzinha && idadeMarquinhos < idadeZezinho) {
        System.out.println("O Marquinhos é o caçula.");
       }   else if (idadeLuluzinha < idadeMarquinhos && idadeLuluzinha < idadeZezinho) {
            System.out.println("O Luluzinha é o caçula.");
       } else {
        System.out.println("O Zezinho é o caçula.");

       }
       }

        
        
    }

