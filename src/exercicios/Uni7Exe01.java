package exercicios;
import java.util.Scanner;
public class Uni7Exe01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[4][4];
        
        for(int lin = 0; lin < matriz.length; lin++) {
            for(int col = 0; col < matriz[lin].length; col++) {
                System.out.println("Digite o número da linha [" + lin + "] coluna [" + col + "]");
                matriz[lin][col] = sc.nextInt();
            }
        }

        int somaDiagonal = 0;

        for(int lin = 0; lin < matriz.length; lin++) {
            for(int col = 0; col < matriz[lin].length; col++) {
                if (lin == col) {
                    System.out.println(matriz[lin][col]);
                    somaDiagonal += matriz[lin][col];
                }
            }
        }

        System.out.println("A soma dos valores da diagonal principal é igual a: " + somaDiagonal);
    }
}