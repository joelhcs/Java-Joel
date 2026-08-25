package exercicios_semestre2.sonora_fase02;

public class Musica {
    
    private static int proximoId;
    private int id;
    private String titulo;
    private String artista;
    private int duracaoSegundos;
    private int reproducoes;

    public Musica(String titulo, String artista, int duracaoSegundos) {
        if (titulo == null || titulo.isBlank()) {
            throw new IllegalArgumentException("O título não pode ser nulo, vazio e nem só conter espaços.");
        }
        this.titulo = titulo;
        
        if (artista == null || artista.isBlank()) {
            throw new IllegalArgumentException("O nome do artista não pode ser nulo, vazio e nem só conter espaços.");

        }
        this.artista = artista;

        if (duracaoSegundos <= 0) {
            throw new IllegalArgumentException("A música precisa conter no mínimo 1 segundo.");
        }
        this.duracaoSegundos = duracaoSegundos;
        proximoId++;
        this.id = proximoId;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getArtista() {
        return artista;
    }

    public int getDuracaoSegundos() {
        return duracaoSegundos;
    }

    public int getReproducoes() {
        return reproducoes;
    }

    public void reproduzir() {
        reproducoes++;
    }

    public String getDuracaoFormatada() {
        int minutos = duracaoSegundos / 60;
        int segundos = duracaoSegundos % 60;

        return String.format("%02d:%02d", minutos, segundos);
    }
}
