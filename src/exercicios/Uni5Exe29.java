package exercicios;
import java.util.Scanner;
public class Uni5Exe29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cedula1 = 0, cedula2 = 0, cedula5 = 0, cedula10 = 0, cedula20 = 0;
        System.out.println("Digite o valor: ");
        int valor = sc.nextInt();

        while (valor != 0) {
            if (valor >= 20) {
                cedula20++;
                valor -= 20;
            } else if (valor >= 10) {
                cedula10++;
                valor -= 10;
            } else if (valor >= 5) {
                cedula5++;
                valor -= 5;
            } else if (valor >= 2) {
                cedula2++;
                valor -= 2;
            } else if (valor >= 1) {
                cedula1++;
                valor -= 1;
            }
        }

        System.out.println("Cédulas de 20: " + cedula20);
        System.out.println("Cédulas de 10: " + cedula10);
        System.out.println("Cédulas de 5: " + cedula5);
        System.out.println("Cédulas de 2: " + cedula2);
        System.out.println("Cédulas de 1: " + cedula1);
    }
}