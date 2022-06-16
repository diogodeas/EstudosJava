package principal_Diogo_Guilherme_Luiz;

/**
 * Classe responsavel pela logica da hospedagem. Inclui um objeto Imovel, que é
 * o imovel que o cliente deseja hospedar. Inclui uma String nomeCliente para
 * guardar a informaçao do contratante E por fim, um inteiro para armazenar a
 * quantidade de dias que o imovel será alugado
 */
public class Hospedagem {
  private Imovel imovel;
  private String nomeCliente;
  private int diarias;

  public Hospedagem() {

  }

  public Hospedagem(Imovel imovel, String nomeCliente, int diarias) {
    this.imovel = imovel;
    this.nomeCliente = nomeCliente;
    this.diarias = diarias;
  }

  public Imovel getImovel() {
    return imovel;
  }

  public void setImovel(Imovel imovel) {
    this.imovel = imovel;
  }

  public String getNomeCliente() {
    return nomeCliente;
  }

  public void setNomeCliente(String nomeCliente) {
    this.nomeCliente = nomeCliente;
  }

  public int getDiarias() {
    return diarias;
  }

  public void setDiarias(int diarias) {
    this.diarias = diarias;
  }

  // Metodo criado pois será necessário descobrir o valor total em outras duas
  // ocasioes
  public double valorTotal() {
    return imovel.getValorDiaria() * diarias;
  }

  // Metodo criado para retornar o valor que será repassado ao proprietario do imovel
  public double valorCobradoProprietario() {
    double valorProprietario = valorTotal() * 0.7;

    return valorProprietario;
  }
    //Metodo criado para retornar o valor que sera repassado a Cefet-Airbnb
  public double valorCobradoAirbnb() {
    double valorAirbnb = valorTotal() * 0.3;

    return valorAirbnb;
  }

}
