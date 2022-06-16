import java.util.Scanner;

public class Mesa {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int quantidade;
		
		Baralho copag = new Baralho();
		
		copag.embaralhar();
		
		Jogador jogadorA = new Jogador();
		
		Jogador jogadorB = new Jogador();
		
		System.out.println("Quantas cartas você quer distribuir para o jogador?");
		
		quantidade = input.nextInt();
		
		Carta[] cartas = copag.distribuirCartas(quantidade);
		
		//jogadorA.setMao(cartas);
		
		//jogadorB.setMao(copag.distribuirCartas(quantidade));
		
		
		
	}

}
