package exercicios_semestre2.lista02.questao02;
public class Produto {
    
    private String nome;
    private double preco;
    private int estoque;

    public void vender(int quantidade) {
        if (quantidade <= 0) {
            System.out.println("A quantidade precisa ser positiva");
        } else if (estoque >= quantidade) {
            estoque -= quantidade;
        } else {
            System.out.println("Estoque insuficiente...");
        }
    }

    public void repor(int quantidade) {
        if (quantidade > 0) {
            estoque += quantidade;
        } else {
            System.out.println("A quantidade precisa ser positiva.");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco > 0) {
            this.preco = preco;
        } else {
            System.out.println("O valor precisa ser positivo.");
        }
    }

    public int getEstoque() {
        return estoque;
    }
}