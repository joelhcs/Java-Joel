package exercicios_semestre1;
import java.util.Scanner;
public class Uni4Ex19 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Informe a coordenada X:");
    int x = sc.nextInt();
    System.out.println("Informe a coordenada Y:");
    int y = sc.nextInt();
    if (x == 0 && y == 0) {
        System.out.println("Quadrante 0");
    } else if (x > 0 && y > 0){
        System.out.println("Quadrante 1");
    } else if (x < 0 && y > 0){
        System.out.println("Quadrante 2");
    } else if (x < 0 && y < 0){
        System.out.println("Quadrante 3");
    } else{
        System.out.println("Quadrante 4");
    }
    }

    }

