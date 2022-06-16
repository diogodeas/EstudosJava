public class Pessoa {
	
	private String nome;
	private Pessoa pai; 
	private Pessoa mae;
	
	public Pessoa(String nome) {
		this.nome = nome;
		this.pai = null;
		this.mae = null;
	}
	
	public Pessoa(String nome, String pai, String mae) {
		this.nome = nome;
		this.pai = new Pessoa(pai);
		this.mae = new Pessoa(mae);
	}
	
	public void comparastring(Pessoa pessoa) {
		if(this.nome  == pessoa.nome) {
			if(this.mae.nome == pessoa.mae.nome) {
				System.out.println("this.nome+ "é a mesma pessoa que" +pessoa.nome");
			}
		}
	}
	
	public void comparairmandade(Pessoa pessoa) {
		if(this.nome != pessoa.nome) {
			if(this.mae.nome == Nomedospais || this.pai.nome == Nomedospais) {
				System.out.println("this.nome+ "e" +pessoa.nome+ "são irmãos"");
			}
		}
	}
	
	
	public comparapaternidade(Pessoa pessoa) {
		if(this.pai.nome != pessoa.nome && this.mae.nome != pessoa.nome) {
			if(this.pai.nome == pessoa.pai.nome && this.mae.nome == pessoa.mae.nome) {
				return this.pai.nome, this.mae.nome, pessoa.nome;
			}
		}
	}
}