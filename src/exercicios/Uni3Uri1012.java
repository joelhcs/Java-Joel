package exercicios;
import java.util.Scanner;
public class Uni3Uri1012 {
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    double a = scan.nextDouble();
    double b = scan.nextDouble();
    double c = scan.nextDouble();
    double triangulo = a * c / 2;
    double circulo = 3.14159 * Math.pow(c, 2);
    double trapezio = (a + b) * c / 2;
    double quadrado = Math.pow(b,2);
    double retangulo = a * b;
    System.out.printf("TRIANGULO: %.3f\nCIRCULO: %.3f\nTRAPEZIO: %.3f\nQUADRADO: %.3f\nRETANGULO: %.3f" , triangulo , circulo, trapezio, quadrado, retangulo);
    System.out.println("");
    scan.close();
}
}
