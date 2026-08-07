package exercicios_semestre1;

import java.util.Scanner;

public class Jogador {

    String nome;
    int[] pontuacoes;

    public Jogador(String nome) {
        this.nome = nome;
        pontuacoes = new int[3];
    }

    public void registrarPontuacao(int rodada, int pontos) {
        if (rodada >= 0 && rodada <= 2) {
            pontuacoes[rodada] = pontos;
        } else {
            System.out.println("Rodada inválida!");
        }
    }

    public int totalPontos() {
        int total = 0;

        for (int i = 0; i < pontuacoes.length; i++) {
            total += pontuacoes[i];
        }

        return total;
    }

    public double mediaPontos() {
        return (double) totalPontos() / pontuacoes.length;
    }

    public int melhorRodada() {
        int melhor = 0;

        for (int i = 1; i < pontuacoes.length; i++) {
            if (pontuacoes[i] > pontuacoes[melhor]) {
                melhor = i;
            }
        }

        return melhor + 1;
    }

    public String classificacao() {

        int total = totalPontos();

        if (total >= 2500) {
            return "Ouro 🥇";
        } else if (total >= 1500) {
            return "Prata 🥈";
        } else if (total >= 800) {
            return "Bronze 🥉";
        } else {
            return "Sem classificação";
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Jogador[] jogadores = new Jogador[4];
        int[][] tabela = new int[4][3];

        System.out.println("=== CADASTRO ===");

        for (int i = 0; i < jogadores.length; i++) {

            System.out.print("Jogador " + (i + 1) + " - Nome: ");
            String nome = sc.nextLine();

            jogadores[i] = new Jogador(nome);

            for (int j = 0; j < 3; j++) {

                System.out.print("  Rodada " + (j + 1) + ": ");
                int pontos = sc.nextInt();
                sc.nextLine();

                jogadores[i].registrarPontuacao(j, pontos);
                tabela[i][j] = pontos;
            }
        }

        int opcao;

        do {

            System.out.println("\n1 - Tabela geral");
            System.out.println("2 - Ranking final");
            System.out.println("3 - Buscar jogador");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

                case 1:

                    System.out.println("\n=== TABELA GERAL ===");
                    System.out.println("Jogador\t\tR1\tR2\tR3\tTotal");

                    for (int i = 0; i < tabela.length; i++) {

                        System.out.print(jogadores[i].nome + "\t\t");

                        for (int j = 0; j < tabela[i].length; j++) {
                            System.out.print(tabela[i][j] + "\t");
                        }

                        System.out.println(jogadores[i].totalPontos());
                    }

                    break;

                case 2:

                    int campeao = 0;
                    int i = 1;

                    while (i < jogadores.length) {

                        if (jogadores[i].totalPontos() > jogadores[campeao].totalPontos()) {
                            campeao = i;
                        }

                        i++;
                    }

                    System.out.println("\n=== RANKING FINAL ===");

                    for (int j = 0; j < jogadores.length; j++) {

                        System.out.print(
                                jogadores[j].nome +
                                " - Total: " + jogadores[j].totalPontos() +
                                " - Média: " + jogadores[j].mediaPontos() +
                                " - Melhor: Rodada " + jogadores[j].melhorRodada() +
                                " - " + jogadores[j].classificacao()
                        );

                        if (j == campeao) {
                            System.out.print(" 🏆 CAMPEÃO");
                        }

                        System.out.println();
                    }

                    break;

                case 3:

                    System.out.print("Nome: ");
                    String busca = sc.nextLine();

                    boolean encontrou = false;
                    int pos = 0;

                    while (pos < jogadores.length && !encontrou) {

                        if (jogadores[pos].nome.equalsIgnoreCase(busca)) {

                            System.out.println("\n=== DETALHES ===");
                            System.out.println("Nome: " + jogadores[pos].nome);

                            System.out.print("Rodadas: ");

                            for (int j = 0; j < 3; j++) {
                                System.out.print(jogadores[pos].pontuacoes[j] + " ");
                            }

                            System.out.println();
                            System.out.println("Total: " + jogadores[pos].totalPontos());
                            System.out.println("Média: " + jogadores[pos].mediaPontos());
                            System.out.println("Melhor rodada: " + jogadores[pos].melhorRodada());
                            System.out.println("Classificação: " + jogadores[pos].classificacao());

                            encontrou = true;
                        }

                        pos++;
                    }

                    if (!encontrou) {
                        System.out.println("Jogador não encontrado.");
                    }

                    break;

                case 0:
                    System.out.println("Fim do torneio!");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        sc.close();
    }
}