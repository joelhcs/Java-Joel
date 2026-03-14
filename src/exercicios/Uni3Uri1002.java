package exercicios;
import java.util.Scanner;
public class Uni3Uri1002 {
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    float raio = scan.nextFloat();
    double area = 3.14159 * Math.pow(raio,2);
    System.out.printf("A= %.4f" , area);
    scan.close();
}
}
