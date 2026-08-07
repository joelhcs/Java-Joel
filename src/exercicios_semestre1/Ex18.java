package exercicios_semestre1;
import java.util.Scanner;
public class Ex18 {
public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);

    System.out.println("Quantos quilômetros o ciclista percorreu?");
    byte distancia = scan.nextByte();
    System.out.println("Quantos minutos foram gastos?");
    double minutos = scan.nextDouble();
    Double horas = minutos/60;
    double velocidade = distancia / horas;
    double ritmo = minutos / distancia;
    System.out.println("Tempo em horas: " + horas + "\nVelocidade média: " + velocidade + "km/h\nRitmo médio: " + ritmo + " min/km");



}
}
