package exercícios;
import java.util.Scanner;
public class Ex16 {
public static void main(String[] args) {
    
    Scanner teclado = new Scanner(System.in);

    System.out.println("Valor total da compra:");
    short valorTotal = teclado.nextShort();
    System.out.println("Valor total dado pelo cliente:");
    short valorCliente = teclado.nextShort();
    short troco = (short) (valorCliente - valorTotal);
    byte notaCem = (byte) (troco/100);
    byte notaDez = (byte) (troco%100/10);
    byte notaUm = (byte) (troco%10);
    byte totalNotas = (byte) (notaCem + notaDez + notaUm);
    System.out.println("O troco é de R$" + troco + "\n O número mínimo de notas de troco é: " + totalNotas + "\n Notas de cem: " + notaCem + "\n Notas de dez: " + notaDez + "\n Notas de um: " + notaUm);
    




}
}
