package exercicios;
import java.util.Scanner;
public class Ex15 {
public static void main(String[] args) {
    
    Scanner teclado = new Scanner(System.in);

    System.out.println("Digite um número de até 3 dígitos:");
    short numero = teclado.nextShort();
    byte centena = (byte) (numero/100);
    byte dezena = (byte) (numero%100/10);
    byte unidade = (byte) (numero%10);
    System.out.println(centena + " centena(s) " + dezena + " dezena(s) " + unidade + " unidade(s) ");

}
}
