package exercicios_semestre1;
import java.util.Scanner;
public class Uni4Ex20 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Insire sua nota da Prova1:");
    double prova1 = sc.nextDouble();
    System.out.println("Insira sua nota da Prova2:");
    double prova2 = sc.nextDouble();
    System.out.println("Insire sua nota da Prova3:");
    double prova3 = sc.nextDouble();
    System.out.println("Insire sua média dos exercícios:");
    double notaExercicios = sc.nextDouble();
    double media = (prova1 + prova2*2 + prova3*3 + notaExercicios)/7;
    boolean aprovacao = media >= 6;
    char conceito;
    if (media >=9) {
        conceito = 'A';
    } else if (media >= 7.5){
        conceito = 'B';
    } else if (media >=6){
        conceito = 'C';
    } else if (media >=4){
        conceito = 'D';
    } else{
        conceito = 'E';
    } 
    
    if (aprovacao) {
        System.out.printf("A média de aproveitamento foi: %.2f. Conceito: %c. Aprovado\n", media, conceito);
    } else{
        System.out.printf("A média de aproveitamento foi: %.2f. Conceito: %c. Reprovado\n",media,conceito);
    }
        
    }
    }
