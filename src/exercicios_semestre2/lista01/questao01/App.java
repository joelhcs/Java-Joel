package exercicios_semestre2.lista01.questao01;
public class App {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        
        pessoa1.altura = 1.75;
        pessoa1.peso = 78;

        System.out.println("IMC: " + pessoa1.calcularImc());
    }
}