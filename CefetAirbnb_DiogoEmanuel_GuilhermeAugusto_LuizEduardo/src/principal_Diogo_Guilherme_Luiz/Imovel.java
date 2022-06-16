package principal_Diogo_Guilherme_Luiz;

/**
 * Inclui uma String proprietario para armazenar os dados do proprietario do imóvel
 * Inclui uma String nome para armazenar uma especie de nome do estabelecimento
 * Alem do valor cobrado por dia
 */
public class Imovel {
  private String proprietario;
  private String nome;
  private double valorDiaria;

  public Imovel() {

  }

  public Imovel(String proprietario, String nome, double valorDiaria) {
    this.proprietario = proprietario;
    this.nome = nome;
    this.valorDiaria = valorDiaria;
  }

  public String getProprietario() {
    return proprietario;
  }

  public void setProprietario(String proprietario) {
    this.proprietario = proprietario;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public double getValorDiaria() {
    return valorDiaria;
  }

  public void setValorDiaria(double valorDiaria) {
    this.valorDiaria = valorDiaria;
  }

}
