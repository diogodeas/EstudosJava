package classesCardapio;
//Luiz Eduardo Leroy e Diogo Emanuel Antunes
//Engenharia de Computação
public class Refeicao {
	private String descricao;
	private double valorCalorico;
	
	public Refeicao() {
		this.descricao=" ";
		this.valorCalorico=0;
	}
	public Refeicao(String descricao,int valor) {
		this.valorCalorico=valor;
		this.descricao=descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao=descricao;
	}
	public String getDescricao() {
		return this.descricao;
	}
	public void setValorCalorico(double valor) {
		this.valorCalorico=valor;
	}
	public double getValorCalorico() {
		return this.valorCalorico;
	}
}
