package exercicios_semestre1;
import java.util.Scanner;
public class Uni4Ex01 {
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Quantas horas você trabalhou no mês?");
    int horasTrabalhadas = scan.nextInt();
    System.out.println("Quanto você ganha por hora?");
    double salarioHora = scan.nextDouble();
    double salarioTotal = salarioHora * horasTrabalhadas;

    if (horasTrabalhadas > 160) {
        double salarioExtra = (horasTrabalhadas - 160) * (salarioHora * 1/2);
        salarioTotal = salarioTotal + salarioExtra;
    }
    System.out.println("O salário total é : " + salarioTotal);
        
    }
}
