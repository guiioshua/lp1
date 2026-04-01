public class Main {
    public static void main(String[] args) {
        Farmacia farmacia = new Farmacia();
        Atendente atendente = new Atendente();
        ProdutoFarmaceutico produto = new ProdutoFarmaceutico();

        System.out.println("Sistema da Farmácia inicializado.");
    }
}

class Farmacia {
    private String cnpj;
    private String razaoSocial;
    private boolean emFuncionamento;

    public void pagarAluguel(Double aluguel) {
    }

    public void pagarFuncionario(Double salario) {
    }

    public void comprarProdutos(Object pedido) {
    }
}

class Atendente {
    private double salario;
    private int guicheResponsavel;
    private String turno;

    public void atenderCliente(Object cliente) {
    }

    public void consultarPreco(Object produto) {
    }

    public void processarPagamento() {
    }
}

class ProdutoFarmaceutico {
    private String codigoBarras;
    private double precoUnitario;
    private String categoria;

    public void verificarValidade() {
    }

    public void aplicarDesconto(double percentual) {
    }

    public void reservarUnidade(int quantidade) {
    }
}
