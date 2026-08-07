package exercicios_semestre1;
import java.util.Scanner;
public class Uni4Ex27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o horário que você chegou (Primeiro informe a hora e depois os minutos):");
        int horaChegada = sc.nextInt();
        int minChegada = sc.nextInt();
        System.out.println("Digite o horário que você saiu (no mesmo esquema da chegada):");
        int horasSaida = sc.nextInt();
        int minSaida = sc.nextInt();
        int inicio = horaChegada * 60 + minChegada;
        int fim = horasSaida * 60 + minSaida;
        int tempo = fim - inicio;
        int horasReal = tempo / 60;
        int minutosReal = tempo % 60;
        if (tempo < 0) {
            System.out.println("Horário inválido");
            return;    
        }
        int horas = tempo / 60;
        int minutos = tempo % 60;

        if (tempo < 30) {
            horas = 1;
        } else if (minutos >= 30) {
            horas = horas + 1;
        }
        double valor;
        if (horas <=2) {
            valor = horas * 5;
        } else if (horas <= 4) {
            valor = 10 + (horas - 2) * 7.5;
        } else {
            valor = 25 + (horas - 4) * 10;
        }
        System.out.println("Tempo estacionado: " + horasReal + " hora(s) e " + minutosReal + " minuto(s).");
        System.out.printf("Preço cobrado = R$ %.2f" , valor);
    }            
}