package exercicios_semestre1;
import java.util.Scanner;
public class Uni3Uri1005 {
public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    double notaA = scan.nextDouble() * 3.5/11;
    double notaB = scan.nextDouble() * 7.5/11;
    double media = notaA + notaB;
    System.out.printf("MEDIA = %.5f" , media);
    scan.close();
}
}
