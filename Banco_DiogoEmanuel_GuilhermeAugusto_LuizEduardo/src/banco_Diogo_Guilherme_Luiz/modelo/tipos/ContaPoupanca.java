package banco_Diogo_Guilherme_Luiz.modelo.tipos;

import banco_Diogo_Guilherme_Luiz.modelo.abstrato.ContaBancaria;

public class ContaPoupanca extends ContaBancaria {
  private double rendimentoMensal;

  public ContaPoupanca(double saldo) {
    super(saldo);
    this.rendimentoMensal = 0.05;
  }

  public void calcularRendimentoMensal() {
    this.saldo = this.saldo + (this.rendimentoMensal * this.saldo);
  }

  public double getRendimentoMensal() {
    return this.rendimentoMensal;
  }

  public void setRendimentoMensal(double rendimento) {
    this.rendimentoMensal = rendimento;
  }
}