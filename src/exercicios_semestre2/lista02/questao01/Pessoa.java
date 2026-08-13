package exercicios_semestre2.lista02.questao01;
public class Pessoa {
    private double altura;
    private double peso;
    private String nome;

    double calcularImc() {
        return peso / Math.pow(altura,2);
    }

    void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Peso: " + peso);
        System.out.println("Altura: " + altura);
        System.out.println("IMC: " + calcularImc());
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}