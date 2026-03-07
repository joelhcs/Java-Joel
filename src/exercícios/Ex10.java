package exercícios;
import java.util.Scanner;
public class Ex10 {
public static void main(String[] args) {
    
    Scanner teclado = new Scanner(System.in);
    System.out.println("Qual o comprimento do cateto oposto do triângulo retângulo?");
    byte catetoOposto = teclado.nextByte();
    System.out.println("Qual o comprimento do cateto adjacente do triângulo retângulo?");
    byte catetoAdjacente = teclado.nextByte();
    double hipotenusa = Math.sqrt((Math.pow(catetoOposto, 2)) + (Math.pow(catetoAdjacente, 2)));
    System.out.println("A hipotenusa do triângulo retângulo é igual a " + hipotenusa);


}


}
