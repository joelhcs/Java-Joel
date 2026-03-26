package exercicios;
import java.util.Scanner;
public class Uni4Ex14 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite o dia:");
    int dia = sc.nextInt();
    System.out.println("Digite o mês:");
    int mes = sc.nextInt();
    System.out.println("Digite o ano:");
    int ano = sc.nextInt();
    boolean valida = false;
    if (dia > 0 && mes > 0 && mes < 13 && ano > 0) {
        // Meses com 31 dias
        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            valida = dia <= 31;

        // Meses com 30 dias
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            valida = dia <= 30;

        // Fevereiro
        } else if (mes == 2){
            boolean bissexto = (ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0));
                        
            if (bissexto) {
                valida = dia <= 29;
            } else {
                valida = dia <= 28;
            }
        }
    }

    if (valida) {
        System.out.println("Válida");
    } else {
        System.out.println("Não válida");
    }
}
}