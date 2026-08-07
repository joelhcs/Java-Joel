package exercicios_semestre1;
import java.util.Scanner;
public class Uni4Ex13 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Informe a carta 1:");
    int carta1 = sc.nextInt();
    System.out.println("Informe a carta 2:");
    int carta2 = sc.nextInt();
    System.out.println("Informe a carta 3:");
    int carta3 = sc.nextInt();
    int qtCartasBoas = 0;
    if (carta1 == 1 || carta1 == 2 || carta1 == 3) {
        qtCartasBoas = qtCartasBoas + 1;
    } if (carta2 == 1 || carta2 == 2 || carta2 == 3){
        qtCartasBoas = qtCartasBoas + 1;
    } if (carta3 == 1 || carta3 == 2 || carta3 == 3){
        qtCartasBoas = qtCartasBoas + 1;
    } if (qtCartasBoas == 1){
        System.out.println("TRUCO");
    } else if (qtCartasBoas == 2){
        System.out.println("SEIS");
    } else if (qtCartasBoas == 3){
        System.out.println("NOVE");
    } else {
        System.out.println("-");
    }

    }
    }