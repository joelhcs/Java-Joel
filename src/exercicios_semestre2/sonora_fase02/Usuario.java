package exercicios_semestre2.sonora_fase02;
public class Usuario {

    private static int proximoId;
    private int id;
    private String nome;
    private String email;

    public Usuario(String nome, String email) {
        
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("O nome não pode ser nulo, vazio e nem conter só espaços.");
        }
        this.nome = nome;
        
        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("O email não pode ser nulo, vazio e nem conter só espaços.");
        }
        if (!email.contains("@")) {
            throw new IllegalArgumentException("O endereço de email precisa conter '@'.");
        }
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