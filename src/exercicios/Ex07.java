package exercicios;
import java.util.Scanner;

public class Ex07 {
public static void main(String[] args) {
    
    Scanner teclado = new Scanner(System.in);
    System.out.println("Quantas latas de 350ml você comprou?");
    byte lata = teclado.nextByte();
    System.out.println("Quantas garrafas de 600ml você comprou?");
    byte garrafaMenor = teclado.nextByte();
    System.out.println("Quantas garrafas de 2L você comprou?");
    byte garrafaMaior = teclado.nextByte();
    float litro = lata*0.35f+garrafaMenor*0.6f+garrafaMaior*2;
    System.out.println("Você comprou " + litro + " litros ao total");

}
}
