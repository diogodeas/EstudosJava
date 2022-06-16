import java.util.Scanner;

public class Familia {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int quantidadedepessoas;
		System.out.println("Quantos familiares vc vai inserir na árvore?");
		quantidadedepessoas = input.nextInt();
		Pessoa[] pessoa;
		pessoa = new Pessoa[quantidadedepessoas];
		for(i=0; i<quantidadedepessoas; i++) {
			System.out.println("Você vai registar pai e mãe? (digite 1)");
			int sim = input.nextInt();
			if(sim == 1){
				System.out.println("Escreva o seu nome do seu pai e da sua mãe");
				input.nextLine();
				pessoa[i] = new Pessoa(input.nextLine(), input.nextLine(), input.nextLine());
			}else {
				System.out.println("Escreva o seu nome");
				pessoa[i] = new Pessoa(input.nextLine());
			}
			
		}
		for(i=0; i<quantidadedepessoas; i++){
			for(j=0; j<quantidadedepessoas; j++){
				if(pessoa[i].comparastring(pessoa[j]))
				if(pessoa[i].comparairmandade(pessoa[j]))
				if(pessoa[i].comparapaternidade(pessoa[j])){
					System.out.println("this.pai.nome+ "e" this.mae.nome+ "são pais de" +pessoa.nome");
				}
			}
		}
	}
}
