package exercícios;
import java.util.Scanner;
public class Ex19 {
public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);

    System.out.println("Qual o salário mensal do funcionário?");
    int salario = scan.nextInt();
    System.out.println("Quantos meses o funcionário trabalhou no ano?");
    double meses = scan.nextDouble();
    double salario13 = salario * (meses/12);
    System.out.println("O valor do 13° salário é R$" + salario13);

}
}
