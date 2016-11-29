package br.caleum.orientacaoobjetos.banco.conta;
import br.caleum.orientacaoobjetos.banco.excecao.ValorInvalidoException;

public class ContaPoupanca extends Conta implements Comparable<ContaPoupanca>{
	
	public ContaPoupanca(double saldo) {
		super(saldo);
	}

	public void deposita(double valor) throws ValorInvalidoException{
		valor -= 0.10;
		super.deposita(valor);
	}

	@Override
	public void atualiza(double taxa) {
		this.saldo += this.saldo*taxa*3;
		
	}

	@Override
	public int compareTo(ContaPoupanca o) {
		return this.getNome().compareTo(o.getNome());
	}
	

}
