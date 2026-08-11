package exercicios_semestre2.lista01;

class Carro {

    private String cor;
    private String modelo;
    private int ano;
    private int renavam;
    private boolean documentoEmDia;

    Carro(String cor, String modelo, int ano, int renavam, boolean documentoEmDia) {
        this.cor = cor;
        this.modelo = modelo;
        this.ano = ano;
        this.renavam = renavam;
        this.documentoEmDia = documentoEmDia;
    }
    
    public String getCor() {
        return cor;
    }
    
    public String getModelo() {
        return modelo;
    }
    
    public int getAno() {
        return ano;
    }
    
    public int getRenavam() {
        return renavam;
    }
    
    public boolean isDocumentoEmDia() {
        return documentoEmDia;
    }
}

public class AppConstrutores {
    public static void main(String[] args) {
        Carro carro = new Carro("Branco", "BMW 320", 2026, 123546, true);
        
        String situacao = carro.isDocumentoEmDia() ? "Sim" : "Não";
        System.out.println("Cor: " + carro.getCor());
        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Ano: " + carro.getAno());
        System.out.println("Renavam: " + carro.getRenavam());
        System.out.println("Documento em dia? " + situacao);
    }
}