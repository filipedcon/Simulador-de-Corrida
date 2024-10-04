package corrida;
import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um caractere para o carro 1: ");
		String carro1 = scan.nextLine();
		Carro c1 = new Carro(carro1);
		System.out.println("Digite um caractere para o carro 2: ");
		String carro2 = scan.nextLine();
		Carro c2 = new Carro(carro2);
		Pista p = new Pista();
		System.out.println("Qual será o tamanho da pista? ");
		p.qntDistancia = scan.nextInt();
												
		while (c1.distanciaAtual<p.qntDistancia && c2.distanciaAtual<p.qntDistancia) {
			c1.distanciaAtual += c1.novaVelocidade();
			c2.distanciaAtual += c2.novaVelocidade();
			scan.nextLine();
			p.PistaConst(c1, c2);
			System.out.println("Aperte enter para continuar");
		}
		System.out.println();
		if (c1.distanciaAtual>c2.distanciaAtual) {
			System.out.println("Parabéns Carro "+ c1.getNome()+"! Você venceu. ");
		} else if(c2.distanciaAtual<c1.distanciaAtual){
			System.out.println("Parabéns Carro "+ c2.getNome()+"! Você venceu. ");
		}else {
			System.out.println("Parabéns aos dois pilotos, os carros empataram!!");
		}
		
	}

}
