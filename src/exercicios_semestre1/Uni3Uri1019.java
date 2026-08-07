package exercicios_semestre1;
import java.util.Scanner;
public class Uni3Uri1019 {
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int tempo = scan.nextInt();
    int horas = tempo / 3600;
    tempo = tempo % 3600;
    int minutos = tempo / 60;
    tempo = tempo % 60;
    
    System.out.println(horas + ":" + minutos + ":" + tempo);
    scan.close();

}
}