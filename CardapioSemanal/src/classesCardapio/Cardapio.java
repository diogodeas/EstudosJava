package classesCardapio;
//Luiz Eduardo Leroy e Diogo Emanuel Antunes
//Engenharia de Computação
import java.util.Scanner;

public class Cardapio {
	private String diasSemana[]= {"Domingo","Segunda-feira","Terca-feira","Quarta-feira","Quinta-feira",
	"Sexta-feira","Sabado"};
	private String periodoRefeicao[]= {"Cafe da manha","Lanche da manha","Almoco","Lanche da tarde",
	"Jantar","Ceia"};
	//vetor que vai salvar as refeições diárias por dias da semana
	private Refeicao refeicoes[][]=new Refeicao[6][7];
	private Refeicao r;//duvida
	private Scanner leitura= new Scanner(System.in);
	private String descricao;
	private int periodoRef,diaRef;
	private double valorCal;
	
	public Cardapio() {
		for(int i=0;i<6;i++) {
			for(int j=0;j<7;j++) {
				Refeicao r = new Refeicao();
				refeicoes[i][j]=r;
			}
		}
	}
	public void incluirRefeicao(String periodo,String diaSemana) {
		
		System.out.println("Digite a descricao da refeição");
		descricao=leitura.nextLine();
		System.out.println("Digite o valor calorico da refeicao");
		valorCal=leitura.nextDouble();
		if (leitura.hasNextLine()) {
            leitura.nextLine();
        }
		for(int i=0;i<6;i++) {
			if(this.periodoRefeicao[i].compareTo(periodo)==0) {
				periodoRef=i;
			}
		}
		for(int i=0;i<7;i++) {
			if(this.diasSemana[i].compareTo(diaSemana)==0) {
				diaRef=i;
			}
		}
		if(this.refeicoes[periodoRef][diaRef].getDescricao()==" ") {
			this.refeicoes[periodoRef][diaRef].setDescricao(descricao);
			this.refeicoes[periodoRef][diaRef].setValorCalorico(valorCal);
			System.out.println("Refeicao incluida com sucesso");
			System.out.printf("\n");
		}else {
			String resposta;
			System.out.println("Deseja substituir "+this.refeicoes[periodoRef][diaRef].getDescricao()+" por "+this.descricao);
			resposta=leitura.nextLine();
			
			if(resposta.compareTo("Sim")==0) {
				this.refeicoes[periodoRef][diaRef].setDescricao(descricao);
				this.refeicoes[periodoRef][diaRef].setValorCalorico(valorCal);
				System.out.println("Refeicao substituida com sucesso");
				System.out.printf("\n");
			}
		}
		
	}
	public void excluirRefeicao(String periodo,String diaSemana) {
		for(int i=0;i<6;i++) {
			if(this.periodoRefeicao[i].compareTo(periodo)==0) {
				periodoRef=i;
			}
		}
		for(int i=0;i<7;i++) {
			if(this.diasSemana[i].compareTo(diaSemana)==0) {
				diaRef=i;
			}
		}
		this.refeicoes[periodoRef][diaRef].setDescricao(" ");
		this.refeicoes[periodoRef][diaRef].setValorCalorico(0);
		System.out.println("Refeicao excluida com sucesso");
		System.out.printf("\n");
	}
	public void listarRefeicao() {
		for(int i=0;i<6;i++) {
			System.out.println(this.periodoRefeicao[i]);
			System.out.printf("\n");
			for(int j=0;j<7;j++) {
				System.out.println(this.diasSemana[j]);
				System.out.println("Descricao: "+this.refeicoes[i][j].getDescricao());
				System.out.println("Valor calorico: "+this.refeicoes[i][j].getValorCalorico());
				System.out.printf("\n");
			}
			System.out.printf("\n\n");
		}
	}
	public void listarRefeicoesDia(String diaSemana) {
		int indice=0;
		for(int i=0;i<7;i++) {
			if(this.diasSemana[i].compareTo(diaSemana)==0) {
				indice=i;
			}
		}
		System.out.println("Refeicoes de "+diaSemana);
		for(int i=0;i<6;i++) {
			System.out.println(this.periodoRefeicao[i]);
			for(int j=0;j<7;j++) {
				if(j==indice) {
					System.out.println("Descricao: "+this.refeicoes[i][j].getDescricao());
					System.out.println("Valor calorico: "+this.refeicoes[i][j].getValorCalorico());
					System.out.printf("\n");
				}
				
			}
		}
		
	}
	public double calcularCaloriaSemana() {
		double total=0;
		for(int i=0;i<6;i++) {
			for(int j=0;j<7;j++) {
				total+=this.refeicoes[i][j].getValorCalorico();
			}
		}
		return total;
	}
	public void setCardapio(int linha,int coluna) {
		this.refeicoes=new Refeicao[linha][coluna];
	}
	public Refeicao[][] getCardapio() {
		return this.refeicoes;
	}
}
