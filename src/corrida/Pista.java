package corrida;

public class Pista {
	public int qntDistancia;
	public String Pista;
	
	public void PistaConst(Carro carro1, Carro carro2){
		int[] distancia_carro_1 = new int[carro1.getDistancia()];
		int[] distancia_carro_2 = new int[carro2.getDistancia()];		
		this.Pista = "_".repeat(this.qntDistancia);
		
		System.out.println(this.Pista);
		System.out.println();
		for(int i=0; i < distancia_carro_1.length;i++) {
            System.out.print(" ");
        }
		System.out.print(carro1.getNome());
		System.out.println();		
		for(int i=0; i < distancia_carro_2.length;i++) {
            System.out.print(" ");
        }
		System.out.print(carro2.getNome());
		System.out.println();
		System.out.println(this.Pista);
		
		System.out.println("Carro "+carro1.getNome()+" andou: " + carro1.distanciaAtual + "blocos");
		System.out.println("Carro "+carro2.getNome()+" andou: " + carro2.distanciaAtual + "blocos");
	}
	
}
