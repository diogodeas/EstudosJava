import java.util.Random;

public class Baralho {
	
	private Carta[] baralho;
	private String[] naipe = {"Copas","Ouros","Espada", "Paus"};
	
	private Random gerador;
	
	public Baralho() {
		int cont = 0;
		this.baralho = new Carta[52];
		for(int j=0;j<13;j++) {
			for (int i=0; i<4; i++) {
				baralho[cont] = new Carta((j+1), naipe[i]);	
				cont++;
			}
		}
		embaralhar();
	}
	
	public Baralho(boolean baralhoTruco) {
		
	}
	
	public void embaralhar() {
		gerador = new Random();
		
		int posicao = gerador.nextInt(52);
		
		for(int i = 0;i<52;i++) {
			Carta aux = baralho[i];
			baralho [i] = baralho[posicao];
			baralho[posicao] = aux;
			posicao = gerador.nextInt(52);
			
		}
		
	}
	
	public Carta[] distribuirCartas(int quantidade) {
		Carta[] retorno = new Carta[quantidade];
		for(int i=0;i<quantidade;i++) {
			if (baralho[i] != null) {
				retorno[i] = baralho[i];
				baralho[i] = null;
			}
		}
		return retorno;
		
	}

	public Carta[] getBaralho() {
		return baralho;
	}

	public void setBaralho(Carta[] baralho) {
		this.baralho = baralho;
	}
	
	

}
