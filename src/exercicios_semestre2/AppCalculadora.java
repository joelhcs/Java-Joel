package exercicios_semestre2;
 
class Calculadora {

    public void somar(int valor1, int valor2) {
        int soma = valor1 + valor2;
        System.out.println("O resultado da soma é: " + soma);
    }

    public void somar(double valor1, double valor2) {
        double soma = valor1 + valor2;
        System.out.println("O resultado da soma é: " + soma);
    }

    public void somar(int valor1, int valor2, int valor3) {
        int soma = valor1 + valor2 + valor3;
        System.out.println("O resultado da soma é: " + soma);
    }
}

public class AppCalculadora {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        calc.somar(1,2);
        calc.somar(1.5,2.5);
        calc.somar(1, 2,3);
    }
}