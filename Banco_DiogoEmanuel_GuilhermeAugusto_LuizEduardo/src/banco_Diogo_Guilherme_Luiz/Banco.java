package banco_Diogo_Guilherme_Luiz;

import java.util.ArrayList;

import banco_Diogo_Guilherme_Luiz.modelo.abstrato.ContaBancaria;

public class Banco {
	private ArrayList<ContaBancaria> contas;

	public Banco() {
		contas = new ArrayList<>();
	}

	public double somar() {
		double saldoTotal = 0;

		for (ContaBancaria conta : contas) {
			saldoTotal += conta.getSaldo();
		}

		return saldoTotal;
	}

	public void adicionarConta(ContaBancaria conta) {
		contas.add(conta);
	}

	public ContaBancaria getConta(int i) {
		return contas.get(i);
	}
}