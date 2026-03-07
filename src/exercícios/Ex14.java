package exercícios;
import java.util.Scanner;
public class Ex14 {
public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Qual a distância percorrida na viagem?");
    short distancia = teclado.nextShort();
    System.out.println("Quanto tempo levou para chegar até o local?");
    byte tempo = teclado.nextByte();
    short velocidadeMedia = (short) (distancia/tempo);
    float combustivel = distancia/12f;
    System.out.println("A velocidade média foi de " + velocidadeMedia + "km/h e a quantidade de combustível usado foi " + combustivel + " litros.");
}
}
