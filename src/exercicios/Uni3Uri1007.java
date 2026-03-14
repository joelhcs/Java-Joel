package exercicios;
import java.util.Scanner;
public class Uni3Uri1007 {
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    int b = scan.nextInt();
    int c = scan.nextInt();
    int d = scan.nextInt();
    int diferenca = (a * b - c * d);
    System.out.println("DIFERENCA = " + diferenca);
    scan.close();
    
}
}
