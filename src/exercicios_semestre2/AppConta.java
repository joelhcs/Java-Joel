package exercicios_semestre2;
public class AppConta {
    public static void main(String[] args) {
    
        ContaBancaria cc = new ContaBancaria();

        cc.setNumero(1325);
        cc.setTitular("Joel");
        cc.setAtiva(true);
        cc.depositar(1000);
        cc.sacar(50);
        
        
        System.out.println("Nome: " + cc.getTitular());
        System.out.println("Número da conta: " + cc.getNumero());
        System.out.println("Saldo atual da conta: " + cc.getSaldo());
        
        String situacao = cc.isAtiva() ? "Ativa" : "Inativa";
        System.out.println("Situação da conta: " + situacao);
    
        ContaBancaria c2 = new ContaBancaria();
        ContaBancaria c3 = new ContaBancaria();
        ContaBancaria c4 = new ContaBancaria();

        System.out.println("Id da última conta bancária: " + ContaBancaria.getId());
    }
}