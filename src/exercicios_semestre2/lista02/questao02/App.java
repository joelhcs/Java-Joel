package exercicios_semestre2.lista02.questao02;
public class App {
    public static void main(String[] args) {
        Produto produto = new Produto();
        
        produto.setNome("Cesta de chocolates");

        produto.repor(78);
        produto.vender(50);
        
        produto.setPreco(-56);
        produto.setPreco(80);
        
        System.out.println("Estoque do(a) " + produto.getNome() + ": "
        + produto.getEstoque());

        System.out.println("Preço do(a) " + produto.getNome() + ": "
        + produto.getPreco());
    }
}