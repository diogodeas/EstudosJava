package principal_Diogo_Guilherme_Luiz;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Diogo Emanuel
 * @author Guilherme Augusto
 * @author Luiz Eduardo
 * 
 * @version 1.0
 * 
 * Classe para realizar os testes do projeto
 */
public class App {
    public static void main(String[] args) throws Exception {

        // Criando dois imóveis
        Imovel copacabana = new Imovel("Guilherme", "Copacabana", 2250.66);
        Imovel florianopolis = new Imovel("Luiz", "Floripa", 1222.22);

        // Criando um objeto List para armazenar as três hospedagens
        List<Hospedagem> hospedagens = new ArrayList<Hospedagem>();

        // Criando três hospedagens
        Hospedagem hospedagem1 = new Hospedagem(copacabana, "Maycon Andre", 5);
        Hospedagem hospedagem2 = new Hospedagem(florianopolis, "Jose Antonio", 7);
        Hospedagem hospedagem3 = new Hospedagem(copacabana, "Marcos Paulo", 3);

        // Adicionando as hospedagens na lista
        hospedagens.add(hospedagem1);
        hospedagens.add(hospedagem2);
        hospedagens.add(hospedagem3);

        // For para percorrer a lista de hospedagens
        for (Hospedagem hospedagem : hospedagens) {
            // Exibindo os dados das tres hospedagens, com os respectivos repasses para as
            // partes

            System.out.println("-----------------------------------------------------------------------");

            System.out.println("Dados da hospedagem: ");
            System.out.println("Nome do cliente: " + hospedagem.getNomeCliente());
            System.out.println("Nome do imovel alugado: " + hospedagem.getImovel().getNome());
            System.out.println("Nome do proprietario: " + hospedagem.getImovel().getProprietario());
            System.out.printf("Valor da diaria: %.2f \n", hospedagem.getImovel().getValorDiaria());
            System.out.println("Quantidade de diarias: " + hospedagem.getDiarias());
            System.out.printf("Valor total da hospedagem: %.2f\n", hospedagem.valorTotal());
            System.out.printf("Quantia repassada para o proprietario: %.2f \n", hospedagem.valorCobradoProprietario());
            System.out.printf("Quantia repassada ao Cefet-Airbnb: %.2f\n", hospedagem.valorCobradoAirbnb());

            System.out.println("-----------------------------------------------------------------------");

        }
    }
}
