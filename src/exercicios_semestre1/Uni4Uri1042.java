package exercicios_semestre1;
import java.util.Scanner;
public class Uni4Uri1042 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int valorMaior, valorMeio, valorMenor;
    if (a > b && a > c) {
        valorMaior = a;
    } else if (b > a && b > c) {
        valorMaior = b;
    } else {
        valorMaior = c;
    }
    if ((a > b && a < c) || (a < b && a > c)) {
        valorMeio = a;
    } else if ((b > a && b < c) || (b < a && b > c)) {
        valorMeio = b;
    } else {
        valorMeio = c;
    }
    if (a < b && a < c) {
        valorMenor = a;
    } else if (b < a && b < c) {
        valorMenor = b;
    } else {
        valorMenor = c;
    }
    System.out.println(valorMenor + "\n" + valorMeio + "\n" + valorMaior + "\n");
    System.out.println(a + "\n" + b + "\n" + c);
}
}
