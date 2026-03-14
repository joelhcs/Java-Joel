package exercicios;

import java.util.Scanner;

public class Ex04 {
public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);
    System.out.println("Insira sua primeira nota: ");
    float n1 = teclado.nextFloat();
    float nota1 = n1*5/10;
    System.out.println("Insira sua segunda nota: ");
    float n2 = teclado.nextFloat();
    float nota2 = n2*3/10;
    System.out.println("Insira sua terceira nota: ");
    float n3 = teclado.nextFloat();
    float nota3 = n3*2/10;
    float médiaPonderada = nota1 + nota2 + nota3;
    System.out.println("Sua média ponderada foi de " + médiaPonderada);


        
    
    }
}


