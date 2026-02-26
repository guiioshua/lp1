public class ConcessionariaVale {
    
    static class Carro {
        String modelo;
        String marca;
        String cor;
        double nivelCombustivel; // em litros
        
        public Carro(String modelo, String marca, String cor, double nivelCombustivel) {
            this.modelo = modelo;
            this.marca = marca;
            this.cor = cor;
            this.nivelCombustivel = nivelCombustivel;
        }
        
        public void darPartida() {
            System.out.println("VRUUUUM");
        }
        
        public void acelerar(double consumo) {
            this.nivelCombustivel -= consumo;
            System.out.println("Acelerando... Combustível restante: " + this.nivelCombustivel + "L");
        }
    }

    static class Motocicleta {
        String marca;
        String cilindrada;
        boolean possuiPartidaEletrica;
        
        public Motocicleta(String marca, String cilindrada, boolean possuiPartidaEletrica) {
            this.marca = marca;
            this.cilindrada = cilindrada;
            this.possuiPartidaEletrica = possuiPartidaEletrica;
        } 
       
        public void empinar() {
            System.out.println("RAN DAN DAN DAN");
        } 
    }
    
    public static void main(String[] args) {
        Carro meuCarro = new Carro("Mustang", "Ford", "Vermelho", 60.0);
        meuCarro.darPartida();
        meuCarro.acelerar(5.5);
        
        Motocicleta minhaMoto = new Motocicleta("Honda", "600cc", true);
        minhaMoto.empinar();
    }
}
