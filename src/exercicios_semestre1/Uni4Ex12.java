package exercicios_semestre1;
import java.util.Scanner;
public class Uni4Ex12 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Comprimento do lado 1: ");
    double lado1 = sc.nextDouble();
    System.out.println("Comprimento do lado 2: ");
    double lado2 = sc.nextDouble();
    System.out.println("Comprimento do lado 3: ");
    double lado3 = sc.nextDouble();
    if (lado1 < (lado2 + lado3) && lado2 < (lado1 + lado3) && lado3 < (lado1 + lado2)) {
        if (lado1 == lado2 && lado1 == lado3) {
            System.out.println("É equilátero");
        } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3){
            System.out.println("É isósceles");
        } else{
            System.out.println("É escaleno");
        }
            
        }
        else{
            System.out.println("Não formam um triângulo");
        }
    }
}
