package exercicios_semestre1;

import java.util.Scanner;

public class Sala {

    int numero;
    boolean[][] assentos;

    public Sala(int numero) {
        this.numero = numero;
        assentos = new boolean[4][6];
    }

    public void exibirMapa() {

        System.out.println("\n=== SALA " + numero + " ===");
        System.out.println("    1   2   3   4   5   6");

        for (int lin = 0; lin < assentos.length; lin++) {

            char letra = (char) ('A' + lin);
            System.out.print(letra + " ");

            for (int col = 0; col < assentos[lin].length; col++) {

                if (assentos[lin][col]) {
                    System.out.print("[X] ");
                } else {
                    System.out.print("[ ] ");
                }
            }

            System.out.println();
        }
    }

    public void reservar(int fileira, int coluna) {

        if (assentos[fileira][coluna]) {
            System.out.println("Assento já ocupado!");
        } else {
            assentos[fileira][coluna] = true;
            System.out.println("Reserva confirmada!");
        }
    }

    public void cancelar(int fileira, int coluna) {

        if (!assentos[fileira][coluna]) {
            System.out.println("Assento já está livre!");
        } else {
            assentos[fileira][coluna] = false;
            System.out.println("Reserva cancelada!");
        }
    }

    public double percentualOcupacao() {

        int ocupados = 0;

        for (int lin = 0; lin < assentos.length; lin++) {
            for (int col = 0; col < assentos[lin].length; col++) {

                if (assentos[lin][col]) {
                    ocupados++;
                }
            }
        }

        return ocupados * 100.0 / 24;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Sala[] salas = new Sala[5];

        for (int i = 0; i < salas.length; i++) {
            salas[i] = new Sala(i + 1);
        }

        int opcao;

        do {

            System.out.println("\n=== CINEMA ===");
            System.out.println("1 - Ver mapa da sala");
            System.out.println("2 - Reservar assento");
            System.out.println("3 - Cancelar reserva");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            opcao = sc.nextInt();

            switch (opcao) {

                case 1:

                    System.out.print("Sala (1-5): ");
                    int salaMapa = sc.nextInt();

                    if (salaMapa >= 1 && salaMapa <= 5) {

                        salas[salaMapa - 1].exibirMapa();

                        System.out.printf("Ocupação: %.1f%%\n",
                                salas[salaMapa - 1].percentualOcupacao());

                    } else {
                        System.out.println("Sala inválida!");
                    }

                    break;

                case 2:

                    System.out.print("Sala (1-5): ");
                    int salaReserva = sc.nextInt();

                    if (salaReserva >= 1 && salaReserva <= 5) {

                        System.out.print("Fileira (A-D): ");
                        char fileira = sc.next().toUpperCase().charAt(0);

                        System.out.print("Coluna (1-6): ");
                        int coluna = sc.nextInt();

                        int linha = fileira - 'A';

                        if (linha >= 0 && linha <= 3 && coluna >= 1 && coluna <= 6) {

                            salas[salaReserva - 1].reservar(linha, coluna - 1);

                        } else {
                            System.out.println("Posição inválida!");
                        }

                    } else {
                        System.out.println("Sala inválida!");
                    }

                    break;

                case 3:

                    System.out.print("Sala (1-5): ");
                    int salaCancela = sc.nextInt();

                    if (salaCancela >= 1 && salaCancela <= 5) {

                        System.out.print("Fileira (A-D): ");
                        char fileira = sc.next().toUpperCase().charAt(0);

                        System.out.print("Coluna (1-6): ");
                        int coluna = sc.nextInt();

                        int linha = fileira - 'A';

                        if (linha >= 0 && linha <= 3 && coluna >= 1 && coluna <= 6) {

                            salas[salaCancela - 1].cancelar(linha, coluna - 1);

                        } else {
                            System.out.println("Posição inválida!");
                        }

                    } else {
                        System.out.println("Sala inválida!");
                    }

                    break;

                case 0:
                    System.out.println("Encerrando sistema.");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        sc.close();
    }
}