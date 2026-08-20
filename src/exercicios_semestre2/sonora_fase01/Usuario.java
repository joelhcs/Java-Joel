package exercicios_semestre2.sonora_fase01;
public class Usuario {

    private static int proximoId;
    private int id;
    private String nome;
    private String email;

    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
        proximoId++;
        this.id = proximoId;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }
}