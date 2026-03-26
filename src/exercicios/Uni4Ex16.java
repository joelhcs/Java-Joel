package exercicios;
import java.util.Scanner;
public class Uni4Ex16 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite a idade do primeiro homem:");
    int homem1 = sc.nextInt();
    System.out.println("Digite a idade do segundo homem:");
    int homem2 = sc.nextInt();
    System.out.println("Digite a idade da primeira mulher:");
    int mulher1 = sc.nextInt();
    System.out.println("Digite a idade da segunda mmulher:");
    int mulher2 = sc.nextInt();
    boolean homemNovo = homem1 > homem2;
    boolean mulherNova = mulher1 > mulher2;
    if (mulherNova && homemNovo) {
        System.out.println("Soma: " + (homem1 + mulher2) + " Produto: " + (homem2*mulher1));
    } else if (mulherNova && !homemNovo){
        System.out.println("Soma: " + (homem2 + mulher2) + " Produto: " + (homem1*mulher1));
    } else if (!mulherNova && homemNovo){
        System.out.println("Soma: " + (homem1 + mulher1) + " Produto: " + (homem2 * mulher2));
    } else {
        System.out.println("Soma: " + (homem2 + mulher1) + " Produto: " + (homem1 * mulher2));


    }
    }
        
}
