package exercicios_semestre2.lista02.questao03;
public class ContaBancaria {

    private String numero;
    private String titular;
    private double saldo;
    
    public String getNumero() {
        return numero;
    }
    
    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    public String getTitular() {
        return titular;
    }
    
    public void setTitular(String titular) {
        this.titular = titular;
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        } else {
            System.out.println("O depósito deve ser positivo.");
        }
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("O valor deve ser positivo");
        } else if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo indisponível");
        }
    }

    public void transferir(ContaBancaria contaDestino, double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            contaDestino.depositar(valor);
        } else {
            System.out.println("Não foi possível realizar a transferência");
        }
    }
}