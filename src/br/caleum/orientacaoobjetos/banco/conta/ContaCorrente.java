package br.caleum.orientacaoobjetos.banco.conta;


public class ContaCorrente extends Conta implements Tributavel{
	public ContaCorrente(double saldo) {
		super(saldo);
	}

	public void atualiza(double taxa){
		this.saldo += this.saldo*taxa*2;
	}

	@Override
	public double calculaTributaveis() {
		return this.getSaldo()*0.01;
	}
	
	

}
