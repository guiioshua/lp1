public class Main {
    public static void main(String[] args) {
        Cabeleireiro cabeleireiro = new Cabeleireiro();
        Espelho espelho = new Espelho();
        Secador secador = new Secador();

        System.out.println("Sistema do Salão inicializado.");
    }
}

class Cabeleireiro {
    private String nome;
    private String especialidade;
    private boolean disponivel;

    public void cortarCabelo(Object cliente) {
    }
    public void lavarCabelo(Object cliente) {
    }
    public void secarCabelo(Object cliente) {
    }
}

class Espelho {
    private double altura;
    private double largura;
    private String tipoMoldura;

    public void refletirImagem() {
    }
    public void ajustarAngulo(double angulo) {
    }
    public void limparSuperficie() {
    }
}

class Secador {
    private String marca;
    private int potenciaWatts;
    private int temperaturaAtual;

    public void ligar() {
    }
    public void ajustarVelocidade(int nivel) {
    }
    public void ligarArQuente() {
    }
}
