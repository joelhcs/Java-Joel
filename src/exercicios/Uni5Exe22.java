package exercicios;

public class Uni5Exe22 {
    public static void main(String[] args) {
        
        double salario = 1.015 * 2000;
        double aumento = 0.015;
        int ano = 1997;

        while (ano <= 2026) {
            
            aumento *= 2;
            salario = (aumento + 1)*salario;
            ano++;
        }

        System.out.printf("Salário atual: R$%.2f" , salario);
    }
}