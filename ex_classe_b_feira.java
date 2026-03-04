public class Main {
    public static void main(String[] args) {
        Fruta fruta = new Fruta();
        Barraca barraca = new Barraca();
        Pessoa pessoa = new Pessoa();

        System.out.println("Sistema da Feira inicializado.");
    }
}

class Fruta {
    private String especie;
    private double precoPorQuilo;
    private boolean madura;

    public void crescer() {
    }
    public void estragar() {
    }
    public void germinar() {
    }
}

class Barraca {
    private String nomeFeirante;
    private String localizacao;
    private String categoriaProdutos;

    public void abrirBarraca() {
    }
    public void realizarVenda(Fruta fruta, double peso) {
    }
    public void fecharBarraca() {
    }
}

class Pessoa {
    private String nome;
    private double saldoDisponivel;
    private boolean possuiSacola;

    public void escolherProduto(Fruta fruta) {
    }
    public void efetuarPagamento(double valor) {
    }
    public void comerFruta(Fruta fruta) {
    }
}
