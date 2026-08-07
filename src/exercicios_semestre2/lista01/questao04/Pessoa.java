package exercicios_semestre2.lista01.questao04;
public class Pessoa {
    double altura;
    double peso;
    String nome;

    double calcularImc() {
        return peso / Math.pow(altura,2);
    }

    void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Peso: " + peso);
        System.out.println("Altura: " + altura);
        System.out.println("IMC: " + calcularImc());
    }
}