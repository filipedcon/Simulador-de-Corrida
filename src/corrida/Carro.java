package corrida;
import java.util.Random;

public class Carro {
    protected int velocidade;
    protected String nome_carro;
    protected int distanciaAtual;
    
    public Carro(String nome_carro) {
        this.nome_carro = nome_carro;
    }

    public int novaVelocidade() {
        Random rd = new Random();
        this.velocidade = rd.nextInt(3) + 1;
        return this.velocidade;
 
    }
    
    public String getNome() {
    	return this.nome_carro;
    }
    
    public int getDistancia() {
    	return this.distanciaAtual;
    }
  
} 