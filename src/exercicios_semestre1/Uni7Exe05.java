package exercicios_semestre1;
import java.util.Scanner;
public class Uni7Exe05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[][] matriz = new char[3][3];
        int opcao = 0, linha = 0, coluna = 0;
        boolean posicaoOcupada = false;
        int qtdJogada = 0;
        char jogador = 'X';
        boolean venceu = false;
        char vencedor = ' ';
        char jogarNovamente = 'S';

        while (jogarNovamente == 'S') {

            matriz = new char[3][3];
            qtdJogada = 0;
            venceu = false;
            jogador = 'X';

            do {
                System.out.println("Escolha uma opção:\n1 - Jogar\n2 - Exibir tabuleiro\n3 - Sair");
                opcao = sc.nextInt();

                switch (opcao) {
                    case 1: 
                    do {
                        do {
                            System.out.println("Em qual linha e coluna você deseja marcar o/a " + jogador + "?");
                            linha = sc.nextInt();
                            coluna = sc.nextInt();
                        } while(linha < 0 || linha > 2 || coluna < 0 || coluna > 2);
                        posicaoOcupada = false;

                        if (matriz[linha][coluna] == 'X' || matriz[linha][coluna] == 'O') {
                            posicaoOcupada = true;
                        }

                        if (posicaoOcupada) {
                            System.out.println("Posição ocupada!");
                        }

                    } while (posicaoOcupada);
                
                    matriz[linha][coluna] = jogador;
                    
                    vencedor = jogador;

                    if (jogador == 'X') {
                        jogador = 'O';
                    } else {
                        jogador = 'X';
                    }
                    qtdJogada++;
                    
                    for(int lin = 0; lin < matriz.length; lin++) {
                        if (matriz[lin][0] != '\0' && matriz[lin][0] == matriz[lin][1] && matriz[lin][1] == matriz[lin][2]) {
                            venceu = true;
                            break;
                        }
                    }
                
                    for(int col = 0; col < 3; col++) {
                        if (matriz[0][col] != '\0' && matriz[0][col] == matriz[1][col] && matriz[1][col] == matriz[2][col]) {
                            venceu = true;
                            break;
                        }
                    }

                    if (matriz[0][0] != '\0' && matriz[0][0] == matriz[1][1] && matriz[1][1] == matriz[2][2]) {
                        venceu = true;
                    }

                    if (matriz[0][2] != '\0' && matriz[0][2] == matriz[1][1] && matriz[1][1] == matriz[2][0]) {
                        venceu = true;
                    }

                    if (venceu) {
                        System.out.println("Jogador " + vencedor + " venceu!");
                    } else if (qtdJogada == 9) {
                        System.out.println("Deu velha!");
                    }
                    
                    break;
                    
                    
                    case 2:

                    System.out.println();
                    
                    for(int lin = 0; lin < matriz.length; lin++) {
                        for(int col = 0; col < matriz[lin].length; col++) {
                            if (matriz[lin][col] == '\0') {
                                System.out.print("- ");
                            } else {
                                System.out.print(matriz[lin][col] + " ");
                            }
                        }
                        System.out.println();
                    }
                    
                    break;

                    case 3: System.out.println("Saindo...");
                    break;

                    default: System.out.println("Opção inválida!");
                    break;
                };
                                
            } while(opcao != 3 && !venceu && qtdJogada < 9);

            System.out.println();
            
            for(int lin = 0; lin < matriz.length; lin++) {
                for(int col = 0; col < matriz[lin].length; col++) {
                    if (matriz[lin][col] == '\0') {
                        System.out.print("- ");
                    } else {
                        System.out.print(matriz[lin][col] + " ");
                    }
                }
                System.out.println();
            }
        
            if (opcao != 3) {
                System.out.println("Desejam jogar novamente? S/N");
                jogarNovamente = sc.next().toUpperCase().charAt(0);
            } else {    
                jogarNovamente = 'N';
            }
        }
    }
}