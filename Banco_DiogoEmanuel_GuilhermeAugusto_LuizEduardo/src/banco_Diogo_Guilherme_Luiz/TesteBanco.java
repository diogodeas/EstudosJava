package banco_Diogo_Guilherme_Luiz;

import java.util.Scanner;

import banco_Diogo_Guilherme_Luiz.modelo.abstrato.ContaBancaria;
import banco_Diogo_Guilherme_Luiz.modelo.tipos.ContaCorrente;
import banco_Diogo_Guilherme_Luiz.modelo.tipos.ContaCorrenteEspecial;
import banco_Diogo_Guilherme_Luiz.modelo.tipos.ContaPoupanca;

/**
 * Nomes: Diogo Emanuel, Guilherme Augusto, Luiz Eduardo
 * Data: 16/12/2021
 */
public class TesteBanco {
    /**
     * Classe para teste das funcionalidades desenvolvidas.
     * O sistema inicia com as três contas bancárias já criadas e permite
     * ao usuário escolher qual conta deseja realizar operações.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcaoContas = 0;
        int opcaoOperacao = 0;

        Banco banco = new Banco();
        banco.adicionarConta(new ContaPoupanca(2000));
        banco.adicionarConta(new ContaCorrente(1500));
        banco.adicionarConta(new ContaCorrenteEspecial(100, 2000));

        do {
            mostrarMenuContas();
            opcaoContas = input.nextInt();

            ContaBancaria contaAtual = banco.getConta(opcaoContas - 1);

            mostrarMenuOpcoes();
            opcaoOperacao = input.nextInt();

            switch (opcaoOperacao) {
                case 1: {
                    System.out.println("Qual o valor a ser depositado?");
                    double valorDeposito = input.nextDouble();
                    contaAtual.depositar(valorDeposito);
                    System.out.println("Valor depositado com sucesso!");
                }
                    break;

                case 2: {
                    System.out.println("Qual o valor a ser sacado?");
                    double valorSaque = input.nextDouble();
                    contaAtual.sacar(valorSaque);
                }
                    break;

                case 3: {
                    System.out.println("O saldo da sua conta eh: " + contaAtual.getSaldo());
                }
                    break;

                case 4: {
                    if (contaAtual instanceof ContaPoupanca) {
                        ContaPoupanca cp = (ContaPoupanca) contaAtual;
                        cp.calcularRendimentoMensal();
                    }
                }
                    break;

                case 5: {
                    double saldoTotal = banco.somar();
                    System.out.println("O saldo total do banco eh: " + saldoTotal);
                }
                    break;

                default:
                    System.out.println("Opcao invalida!");
                    break;
            }
        } while (opcaoContas != 4);
    }

    public static void mostrarMenuContas() {
        System.out.println("------------------------------------------------------");
        System.out.println("[1] - Conta poupança");
        System.out.println("[2] - Conta corrente simples");
        System.out.println("[3] - Conta corrente especial");
        System.out.println("[4] - Sair");
        System.out.println("------------------------------------------------------");
    }

    public static void mostrarMenuOpcoes() {
        System.out.println("------------------------------------------------------");
        System.out.println("[1] - Depositar");
        System.out.println("[2] - Sacar");
        System.out.println("[3] - Verificar Saldo");
        System.out.println("[4] - Calcular rendimento Mensal da Poupança");
        System.out.println("[5] - Somar todos os saldos");
        System.out.println("------------------------------------------------------");
    }
}