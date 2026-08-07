package exercicios_semestre1;
import java.util.Scanner;
public class Uni5Exe32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dia da semana do primeiro dia do mês: ");
        int diaDaSemana = sc.nextInt();

        System.out.println("Número de dias do mês:");
        int diasNoMes = sc.nextInt();

        int contador = 1;

        System.out.println("D \tS \tT \tQ \tQ \tS \tS");

        while (contador < diaDaSemana) {
            System.out.print("\t");
            contador++;
        }

        int dia = 1;

        while (dia <= diasNoMes) {
            System.out.print(dia + "\t");

            if (contador % 7 == 0) {
                System.out.println();
            }
            dia++;
            contador++;
        }
        
        
    }
}