package exercicios_semestre1;
import java.util.Scanner;
public class Uni6Exe01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numero = new int[10];

        for(int i = 0; i < numero.length; i++) {
            numero[i] = sc.nextInt();
        }

        for(int i = numero.length; i > 0; i--) {
            System.out.println(numero[i-1]);
        }
    }
}