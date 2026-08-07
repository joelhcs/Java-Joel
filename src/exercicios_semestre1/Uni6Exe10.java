package exercicios_semestre1;
import java.util.Scanner;
public class Uni6Exe10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] vetor = new int[50];
        int tamanho = 0;
        int opcao;

        do {

            System.out.println("1-Incluir");
            System.out.println("2-Pesquisar");
            System.out.println("3-Alterar");
            System.out.println("4-Excluir");
            System.out.println("5-Mostrar");
            System.out.println("6-Ordenar");
            System.out.println("7-Inverter");
            System.out.println("8-Sair");

            opcao = sc.nextInt();

            switch (opcao) {

                case 1:

                    if (tamanho < 50) {

                        System.out.println("Digite o valor:");
                        vetor[tamanho] = sc.nextInt();

                        tamanho++;

                        System.out.println("Valor incluído.");

                    } else {

                        System.out.println("Vetor cheio.");
                    }

                    break;

                case 2:

                    System.out.println("Digite o valor:");
                    int pesquisa = sc.nextInt();

                    boolean encontrou = false;

                    for (int i = 0; i < tamanho; i++) {

                        if (vetor[i] == pesquisa) {

                            encontrou = true;
                        }
                    }

                    if (encontrou) {

                        System.out.println("Valor encontrado.");

                    } else {

                        System.out.println("Valor não encontrado.");
                    }

                    break;

                case 3:

                    System.out.println("Valor que deseja alterar:");
                    int antigo = sc.nextInt();

                    System.out.println("Novo valor:");
                    int novo = sc.nextInt();

                    boolean alterou = false;

                    for (int i = 0; i < tamanho; i++) {

                        if (vetor[i] == antigo) {

                            vetor[i] = novo;

                            alterou = true;

                            break;
                        }
                    }

                    if (alterou) {

                        System.out.println("Valor alterado.");

                    } else {

                        System.out.println("Número não encontrado.");
                    }

                    break;

                case 4:

                    System.out.println("Digite o valor:");
                    int excluir = sc.nextInt();

                    boolean excluiu = false;

                    for (int i = 0; i < tamanho; i++) {

                        if (vetor[i] == excluir) {

                            for (int j = i; j < tamanho - 1; j++) {

                                vetor[j] = vetor[j + 1];
                            }

                            tamanho--;

                            excluiu = true;

                            break;
                        }
                    }

                    if (excluiu) {

                        System.out.println("Valor excluído.");

                    } else {

                        System.out.println("Valor não encontrado.");
                    }

                    break;

                case 5:

                    if (tamanho == 0) {

                        System.out.println("Vetor vazio.");

                    } else {

                        for (int i = 0; i < tamanho; i++) {

                            System.out.print(vetor[i] + " ");
                        }

                        System.out.println();
                    }

                    break;

                case 6:

                    for (int i = 0; i < tamanho - 1; i++) {

                        for (int j = 0; j < tamanho - 1 - i; j++) {

                            if (vetor[j] > vetor[j + 1]) {

                                int troca = vetor[j];

                                vetor[j] = vetor[j + 1];

                                vetor[j + 1] = troca;
                            }
                        }
                    }

                    System.out.println("Vetor ordenado.");

                    break;

                case 7:

                    for (int i = 0; i < tamanho / 2; i++) {

                        int troca = vetor[i];

                        vetor[i] = vetor[tamanho - 1 - i];

                        vetor[tamanho - 1 - i] = troca;
                    }

                    System.out.println("Vetor invertido.");

                    break;

                case 8:

                    System.out.println("Sistema encerrado.");

                    break;

                default:

                    System.out.println("Opção inválida.");
            }

        } while (opcao != 8);
    }
}