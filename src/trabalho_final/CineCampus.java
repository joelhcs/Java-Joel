package trabalho_final;
import java.util.Scanner;
import java.util.Random;
public class CineCampus {

    // Mostra o mapa da sala com linhas e colunas
    public void mostrarMapa(boolean[][] assentos) {

        System.out.print("\n   ");

        // Mostra os números das colunas
        for(int i = 0; i < assentos.length; i++) {
            System.out.print(i + " ");
        }

        // Percorre as linhas da matriz
        for (int lin = 0; lin < assentos.length; lin ++) {
            System.out.print("\n" + lin + "  ");

            // percorre as colunas
            for(int col = 0; col < assentos[lin].length; col++) {

                //se estiver ocupado mostra #, senão -
                if (assentos[lin][col]) {
                    System.out.print("# ");
                } else {
                    System.out.print("- ");
                }
            }                
        }
        System.out.println();
    }

    // Preenche os 15 lugares aleatórios como já vendidos
    public void preencherAleatorio(boolean[][] assentos) {

        Random random = new Random();
        int ocupacao = 0;

        //Enquanto não tiver os 15 lugares, continua sorteando as posições
        while (ocupacao < 15) {
            
            int linha = random.nextInt(assentos.length);
            int coluna = random.nextInt(assentos[0].length);

            //Só contabiliza se o assento estiver livre
            if (!assentos[linha][coluna]) {
                assentos[linha][coluna] = true;
                ocupacao++;
            }
        }
    }

    //Cria os preços de cada fileira
    public double[] criarPrecos() {

        double[] precoFila = new double[10];

        for(int i = 0; i < precoFila.length; i++) {
            if (i <= 1) {
                precoFila[i] = 15.00;
            } else if (i <= 7) {
                precoFila[i] = 25.00;
            } else {
                precoFila[i] = 35.00;
            }
        }
        return precoFila;
    }

    // mostra resumo das vendas
    public void mostrarResumo(int ingressosVendidos, double bilheteria, int ocupacao) {

        System.out.printf("%nIngressos vendidos: %d%nBilheteria: R$ %.2f%nOcupação: %d%%",
                    ingressosVendidos, bilheteria, ocupacao);
    }

    // Dá a classificação da sessão de acordo com a ocupação
    public void classificarSessao(int ocupacao) {

        if (ocupacao < 40) {
            System.out.println("\n\nSala Vazia - precisa divulgar mais");
        } else if (ocupacao >= 40 && ocupacao <= 69) {
            System.out.println("\n\nSessão Mediana");
        } else if (ocupacao >= 70 && ocupacao <= 89) {
            System.out.println("\n\nCasa Cheia");
        } else {
            System.out.println("\n\nSessão Esgotada — Sucesso de Bilheteria!");
        }
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        CineCampus app = new CineCampus();

        //Matriz da sala
        boolean[][] assentos = new boolean[10][10];
            
        int ingressosVendidos = 0;
        double bilheteria = 0;
        int opcao = 0;
        
        //Variável criada pra não repetir informações do menu
        boolean mostrarCabecalho = true;

        //Preenche 15 lugares aleatórios
        app.preencherAleatorio(assentos);

        int ocupacao = 15;

        double[] precoFila = app.criarPrecos();
        
        do {
            
            //Mostra o cabeçalho do sistema
            if (mostrarCabecalho) {
                
                System.out.print("\n========== CineCampus - Totem de Autoatendimento ==========");
                System.out.printf("%nIngressos vendidos: %d%nBilheteria: R$ %.2f%nOcupação: %d%%",
                    ingressosVendidos, bilheteria, ocupacao);
            }

            //Mostra o mapa da sala
            app.mostrarMapa(assentos);

            mostrarCabecalho = true;

            //Menu principal
            System.out.println("\n\nMenu:\n1 - Ver mapa\n2 - Comprar\n3 - Resumo\n0 - Encerrar");
            System.out.print("Opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 0:
                    System.out.println("Encerrando atendimento...");
                break;
                case 1:
                    //Só mostra o mapa novamente sem a presença do cabeçalho
                    mostrarCabecalho = false;
                    System.out.println("Mapa atualizado:");
                break;
                case 2:

                    boolean posicaoValida = false;
                    int fileira, coluna;

                    //Valida a posição escolhida
                    do {
                        System.out.print("Insira a posição do local desejado\nFileira: ");
                        fileira = sc.nextInt();
                        System.out.print("Assento: ");
                        coluna = sc.nextInt();

                        if (fileira > 9 || fileira < 0 || coluna > 9 || coluna < 0) {
                            System.out.println("Posição fora dos limites!");    
                        }else if (assentos[fileira][coluna]) {
                            System.out.println("Posição já está ocupada!");
                        } else {
                            posicaoValida = true;
                        }

                    } while (!posicaoValida);  
                    
                    int tipoIngresso;

                    
                    do {
                        System.out.println("Tipo (1-Inteira / 2-Meia): ");
                        tipoIngresso = sc.nextInt();
                    } while (tipoIngresso > 2 || tipoIngresso < 1);
                    
                    //calcula o valor base
                    double valorIngresso = precoFila[fileira];

                    //Cálculo do ingresso com base no tipo dele (meia ou inteira)
                    if (tipoIngresso == 2) {
                        valorIngresso *= 0.5;
                    }

                    //define o tipo de poltrona
                    String tipoPoltrona;

                    if (fileira <= 1) {
                        tipoPoltrona = "frente";
                    } else if (fileira <= 7) {
                        tipoPoltrona = "meio";
                    } else {
                        tipoPoltrona = "VIP";
                    }

                    char confirma;

                    //confirmação da compra
                    do {
                        System.out.printf("Poltrona: %s. Valor: R$ %.2f. Confirma? (S/N): ", tipoPoltrona, valorIngresso);
                        confirma = sc.next().toUpperCase().charAt(0);
                        if (confirma == 'S') {
                            assentos[fileira][coluna] = true;
                            ingressosVendidos++;
                            bilheteria += valorIngresso;
                            ocupacao++;
                            
                            System.out.println("Compra realizada! Bom filme :)");
                        
                        } else if (confirma == 'N') {
                            System.out.println("Voltando ao menu...");
                        
                        } else {
                            System.out.println("Opção inválida!");
                        }
                    
                    } while (confirma != 'S' && confirma != 'N');
                
                break;
                             
                case 3:
                    //mostra o resumo, sem precisar rodar o cabeçalho novamente
                    app.mostrarResumo(ingressosVendidos, bilheteria, ocupacao);
                    mostrarCabecalho = false;
                break;
                
                default:
                    System.out.println("Opção inválida!");
                    break;
            }

            //aviso de sala cheia
            if (ocupacao == 100) {
                System.out.println("\nSala lotada!");
            }

        } while(opcao != 0 && ocupacao < 100);

        //Mostra o resultado final
        System.out.print("\n\n   ");

        app.mostrarMapa(assentos);
        app.mostrarResumo(ingressosVendidos, bilheteria, ocupacao);
        app.classificarSessao(ocupacao);

        sc.close();
    }
}