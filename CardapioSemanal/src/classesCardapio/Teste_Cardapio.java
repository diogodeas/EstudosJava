package classesCardapio;
//Luiz Eduardo Leroy e Diogo Emanuel Antunes
//Engenharia de Computação
import java.util.Scanner;

public class Teste_Cardapio {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		boolean controle=true;
		int operacao;
		String periodo=null,diaSemana=null;
		double totalCalorias;
		Cardapio cardapio = new Cardapio();
		
		while(controle) {
			System.out.println("Digite 1 para incluir refeicoes no cardapio");
			System.out.println("Digite 2 para excluir refeicoes do cardapio");
			System.out.println("Digite 3 para listar as refeicoes do cardapio");
			System.out.println("Digite 4 para listar refeicoes de um dia especifico");
			System.out.println("Digite 5 para calcular o total de calorias da semana");
			System.out.println("Digite 6 para finalizar o sistema");
			operacao=leitura.nextInt();
			if (leitura.hasNextLine()) {
	            leitura.nextLine();
	        }
			if(operacao==1) {
				System.out.println("Digite o periodo da refeicao que deseja incluir ou substituir:ex.: Cafe da manha,Almoco");
				periodo=leitura.nextLine();
				System.out.println("Digite o dia da Semana da refeicao que deseja incluir ou substituir:ex.: Segunda-feira,Terca-feira");
				diaSemana=leitura.nextLine();
				cardapio.incluirRefeicao(periodo, diaSemana);
			}else if(operacao==2) {
				System.out.println("Digite o periodo da refeicao que deseja excluir:(ex.: Cafe da manha,Almoco");
				periodo=leitura.nextLine();
				System.out.println("Digite o dia da Semana da refeicao que deseja excluir:(ex.: Segunda-feira,Terca-feira");
				diaSemana=leitura.nextLine();
				cardapio.excluirRefeicao(periodo, diaSemana);
				
			}else if(operacao==3) {
				cardapio.listarRefeicao();
			}else if(operacao==4) {
				System.out.println("Digite o dia da semana que deseja listar as refeicoes");
				diaSemana=leitura.nextLine();
				cardapio.listarRefeicoesDia(diaSemana);
				
			}else if(operacao==5) {
				totalCalorias=cardapio.calcularCaloriaSemana();
				System.out.println("O total de calorias da semana é: "+totalCalorias);
				
			}else if(operacao==6) {
				controle=false;
				System.out.println("Sistema finalizado");
			}
		}
		

	}
	
}
