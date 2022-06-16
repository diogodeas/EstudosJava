
public class Carta {
	private int valor;
	private String naipe;
	
	public Carta() {
		this.valor = 0;
		this.naipe = new String("");
	}
	
	public Carta(int valor, String naipe) {
		
		this.valor = valor;
		this.naipe = naipe;
		
	}
	
	public int comparaValorCarta(Carta carta) {
		if (this.valor > carta.getValor()) {
			return 1;//quando a carta atual é maior que a carta recebida
		} else {
			if (this.valor == carta.getValor()) {
				return 0; // quando a carta tem valor igual ao da carta recebida
			} else {
				return -1;
			}
		}
	}

	public String getNaipe() {
		return naipe;
	}

	public void setNaipe(String naipe) {
		this.naipe = naipe;
	}

	public int getValor() {
		return valor;
	}
	
	public void setValor(int v) {
		valor = v;
	}

}
