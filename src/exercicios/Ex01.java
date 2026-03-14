package exercicios;

import java.util.Scanner;

public class Ex01 {
public static void main(String[] args) {
    System.out.println("Qual o comprimento do terreno?");
    Scanner teclado = new Scanner(System.in);
    
    double comprimentoTerreno = teclado.nextDouble();

    System.out.println("Qual a largura do terreno? ");


    double larguraTerreno = teclado.nextDouble();

    double areaTerreno = comprimentoTerreno*larguraTerreno;

    System.out.println("A área do terreno é: " + areaTerreno);


}
}