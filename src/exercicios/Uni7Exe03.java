package exercicios;
import java.util.Scanner;
public class Uni7Exe03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz1 = new int[3][3];
        int[][] matriz2 = new int[3][3];

        for(int lin = 0; lin < matriz1.length; lin++) {
            for(int col = 0; col < matriz1[lin].length; col++) {
                System.out.println("Digite o valor da linha [" + lin + "] coluna [" + col + "] da matriz 1");
                matriz1[lin][col] = sc.nextInt();
            }
        }

        for(int lin = 0; lin < matriz2.length; lin++) {
            for(int col = 0; col < matriz2[lin].length; col++) {
                System.out.println("Digite o valor da linha [" + lin + "] coluna [" + col + "] da matriz 2");
                matriz2[lin][col] = sc.nextInt();
            }
        }

        int[][] matriz3 = new int[3][3];

        for(int lin = 0; lin < matriz3.length; lin++) {
            for(int col = 0; col < matriz3[lin].length; col++) {
                matriz3[lin][col] = matriz1[lin][0] * matriz2[0][col] + matriz1[lin][1] * matriz2[1][col] + matriz1[lin][2] * matriz2[2][col];
            }
        }

        for(int lin = 0; lin < matriz1.length; lin++) {
            for(int col = 0; col < matriz1[lin].length; col++) {
                System.out.print(matriz1[lin][col] + " ");
            }
            System.out.println();
        }

        System.out.println("-----------------------------");

        for(int lin = 0; lin < matriz2.length; lin++) {
            for(int col = 0; col < matriz2[lin].length; col++) {
                System.out.print(matriz2[lin][col] + " ");
            }
            System.out.println();
        }

        System.out.println("-----------------------------");


        for(int lin = 0; lin < matriz3.length; lin++) {
            for(int col = 0; col < matriz3[lin].length; col++) {
                System.out.print(matriz3[lin][col] + " ");
            }
            System.out.println();
        }
    }
}
