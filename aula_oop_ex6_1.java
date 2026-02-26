public class LojaMegaVale {
    
    static class Shampoo {
        String marca;
        String tipo;
        String tipoEmbalagem;
        double volume;
        
        public Shampoo(String marca, String tipo, String tipoEmbalagem, double volume) {
            this.marca = marca;
            this.tipo = tipo;
            this.tipoEmbalagem = tipoEmbalagem;
            this.volume = volume;
        }
        
        public void abrir() {
            System.out.println("Abriu");
        }
        
        public void apertar(double qtdApertada) {
            this.volume -= qtdApertada;
        }
    }

    static class Secador {
        String marca;
        String cor;
        double potenciaEmWatts;
        
        public Secador(String marca, String cor, double potenciaEmWatts) {
            this.marca = marca;
            this.cor = cor;
            this.potenciaEmWatts = potenciaEmWatts;
        } 
       
        public void ligar() {
            System.out.println("VUUUUUUUUUUUUM");
        } 
    }
    
    public static void main(String[] args) {
        Shampoo shampoo = new Shampoo("TRESemmé", "Antiresíduo", "Válvula Pump", 1000.0);
        shampoo.abrir();
        
        Secador secador = new Secador("Tourmaline", "preto", 2100.0);
        secador.ligar();
    }
}
