package exercicios_semestre2.lista01.questao03;
public class Pessoa {
    double altura;
    double peso;

    double calcularImc() {
        return peso / Math.pow(altura,2);
    }
}