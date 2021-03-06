package br.caleum.orientacaoobjetos.banco.sistema;

import br.caleum.orientacaoobjetos.banco.conta.Conta;

public class AtualizadorDeContas {
	private double saldoTotal = 0;
	private double selic;

	public AtualizadorDeContas(double selic) {
		this.selic = selic;
	}

	public void roda(Conta c) {
		System.out.println("Saldo Anterior " + c.getSaldo());
		c.atualiza(this.selic);
		System.out.println("Saldo Final " + c.getSaldo());
		saldoTotal += c.getSaldo();

	}

	public double getSaldoTotal() {
		return this.saldoTotal;
	}

}
