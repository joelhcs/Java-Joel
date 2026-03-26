package exercicios;
import java.util.Scanner;
public class Uni4Ex21 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Insira sua altura em metros:");
    double altura = sc.nextDouble();
    if (altura <= 0) {
        System.out.println("Altura inválida");
        return;
    }

    System.out.println("Insira sua massa corporal em quilogramas:");
    double massa = sc.nextDouble();
    if (massa <= 0) {
        System.out.println("Massa inválida");
        return;
    }
    
    double imc = massa/Math.pow(altura, 2);
    String classificacao;
    if (imc < 18.5) {
        classificacao = "Magreza";
    } else if (imc <= 24.9){
        classificacao = "Saudável";
    } else if (imc <= 29.9){
        classificacao = "Sobrepeso";
    } else if (imc <= 34.9){
        classificacao = "Obesidade Grau I";
    } else if (imc <= 39.9){
        classificacao = "Obesidade Grau II (severa)";
    } else {
        classificacao = "Obesidade Grau III (mórbida)";
    }
    System.out.println(classificacao);
    }
    }