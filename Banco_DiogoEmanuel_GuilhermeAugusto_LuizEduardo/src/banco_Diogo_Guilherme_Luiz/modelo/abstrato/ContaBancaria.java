package banco_Diogo_Guilherme_Luiz.modelo.abstrato;

public abstract class ContaBancaria {
  protected double saldo;

  public ContaBancaria(double saldo) {
    this.saldo = saldo;
  }

  // Verificar saldo
  public double getSaldo() {
    return saldo;
  }

  public void sacar(double valor) {
    if (valor <= saldo) {
      saldo = saldo - valor;
    } else {
      System.out.println("Saldo insuficiente na conta");
    }
  }

  public void depositar(double valor) {
    saldo += valor;
  }
}