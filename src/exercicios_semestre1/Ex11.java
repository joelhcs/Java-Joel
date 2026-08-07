package exercicios_semestre1;
import java.util.Scanner;
public class Ex11 {
public static void main(String[] args) {
    
    Scanner teclado = new Scanner(System.in);
    System.out.println("Qual a temperatura em °C?");
    byte celsius = teclado.nextByte();
    float fahrenheit = (9/5f) * celsius + 32;
    System.out.println("A temperatura é de " + fahrenheit + "°F");
}
}
