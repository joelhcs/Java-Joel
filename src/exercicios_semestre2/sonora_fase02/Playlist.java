package exercicios_semestre2.sonora_fase02;
public class Playlist {

    private String nome;
    private Usuario dono;
    private Musica[] musicas;
    private int quantidade;
    
    public Playlist(String nome, Usuario dono) {
        this.nome = nome;
        this.dono = dono;
        musicas = new Musica[100];
    }

    public String getNome() {
        return nome;
    }

    public Usuario getDono() {
        return dono;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public boolean adicionar(Musica musica) {
        if (musica == null || quantidade >= musicas.length) {
            return false;
        }
            musicas[quantidade] = musica;
            quantidade++;

            return true;
    }

    public Musica getNaPosicao(int indice) {
        if (indice < 0 || indice >= quantidade) {
            return null;
        }
            return musicas[indice];
    }

    public boolean removerNaPosicao(int indice) {
        if (indice < 0 || indice >= quantidade) {
            return false;
        }
            for(int i = indice; i < quantidade - 1; i++) {
                musicas[i] = musicas[i + 1];
            }

            quantidade--;
            musicas[quantidade] = null;
            return true;
    }

    public int getDuracaoTotalSegundos() {
        
        int duracaoTotal = 0;

        for(int i = 0; i < quantidade; i++) {
            duracaoTotal += musicas[i].getDuracaoSegundos();
        }

        return duracaoTotal;
    }

    public void reproduzirTudo() {
        for(int i = 0; i < quantidade; i++) {
            musicas[i].reproduzir();
        }
    }
}