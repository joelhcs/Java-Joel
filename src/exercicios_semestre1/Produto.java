package exercicios_semestre1;

import java.util.Scanner;

public class Produto {

    String nome;
    double preco;
    int estoque;

    public Produto(String nome, double preco, int estoque) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    public void vender(int qtd) {
        if (qtd > estoque) {
            System.out.println("Estoque insuficiente! Disponível: " + estoque);
        } else {
            estoque -= qtd;
            System.out.println("Venda realizada!");
        }
    }

    public void repor(int qtd) {
        estoque += qtd;
        System.out.println("Estoque reposto!");
    }

    public boolean estaEmBaixa() {
        return estoque <= 3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Produto[] produtos = new Produto[8];

        produtos[0] = new Produto("Fone Bluetooth", 89.90, 2);
        produtos[1] = new Produto("Mouse Gamer", 149.90, 15);
        produtos[2] = new Produto("Teclado Mec.", 299.90, 1);
        produtos[3] = new Produto("Monitor 24\"", 899.90, 5);
        produtos[4] = new Produto("Webcam HD", 199.90, 8);
        produtos[5] = new Produto("Caixa de Som", 129.90, 3);
        produtos[6] = new Produto("SSD 500GB", 249.90, 10);
        produtos[7] = new Produto("Headset", 179.90, 4);

        int opcao = -1;

        while (opcao != 0) {

            System.out.println("\n=== ESTOQUE ===");
            System.out.println("1 - Listar produtos");
            System.out.println("2 - Vender");
            System.out.println("3 - Repor estoque");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            opcao = sc.nextInt();

            switch (opcao) {

                case 1:

                    System.out.println("\nCód | Produto | Preço | Estoque");

                    for (int i = 0; i < produtos.length; i++) {

                        System.out.print((i + 1) + " | "
                                + produtos[i].nome + " | R$ "
                                + produtos[i].preco + " | "
                                + produtos[i].estoque);

                        if (produtos[i].estaEmBaixa()) {
                            System.out.print(" ⚠ BAIXO");
                        }

                        System.out.println();
                    }

                    break;

                case 2:

                    System.out.print("Código do produto: ");
                    int codigoVenda = sc.nextInt();

                    if (codigoVenda >= 1 && codigoVenda <= 8) {

                        System.out.print("Quantidade: ");
                        int qtdVenda = sc.nextInt();

                        produtos[codigoVenda - 1].vender(qtdVenda);

                    } else {
                        System.out.println("Código inválido!");
                    }

                    break;

                case 3:

                    System.out.print("Código do produto: ");
                    int codigoReposicao = sc.nextInt();

                    if (codigoReposicao >= 1 && codigoReposicao <= 8) {

                        System.out.print("Quantidade: ");
                        int qtdReposicao = sc.nextInt();

                        produtos[codigoReposicao - 1].repor(qtdReposicao);

                    } else {
                        System.out.println("Código inválido!");
                    }

                    break;

                case 0:
                    System.out.println("Encerrando sistema.");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }

        sc.close();
    }
}