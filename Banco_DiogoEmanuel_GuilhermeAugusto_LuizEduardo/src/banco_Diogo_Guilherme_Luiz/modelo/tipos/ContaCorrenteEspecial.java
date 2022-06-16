package banco_Diogo_Guilherme_Luiz.modelo.tipos;

import banco_Diogo_Guilherme_Luiz.modelo.abstrato.ContaBancaria;

public class ContaCorrenteEspecial extends ContaBancaria {
    private double limiteCreditoEspecial;

    public ContaCorrenteEspecial(double saldo, double limiteCreditoEspecial) {
        super(saldo);
        this.limiteCreditoEspecial = limiteCreditoEspecial;
    }

    public double getLimiteCreditoEspecial() {
        return limiteCreditoEspecial;
    }

    public void setLimiteCreditoEspecial(double limiteCreditoEspecial) {
        this.limiteCreditoEspecial = limiteCreditoEspecial;
    }

    @Override
    public void sacar(double valor) {
        if (saldo < valor) {
            System.out.println("Saldo insuficiente na conta! Tentaremos usar o limite de crédito especial.");

            if (saldo + limiteCreditoEspecial < valor) {
                System.out.println("Saldo insuficiente na conta! Não é possível sacar o valor solicitado.");
            } else {
                double valorExtraNecessario = valor - saldo;
                saldo = 0;
                limiteCreditoEspecial -= valorExtraNecessario;
            }
        } else {
            // O cliente tem saldo suficiente
            super.sacar(valor);
        }

        System.out.println("Saldo atual: " + this.saldo);
        System.out.println("Limite de crédito especial: " + this.limiteCreditoEspecial);
    }
}