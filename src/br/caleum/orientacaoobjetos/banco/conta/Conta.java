package br.caleum.orientacaoobjetos.banco.conta;
import br.caleum.orientacaoobjetos.banco.excecao.ValorInvalidoException;

public abstract class Conta {
	protected double saldo;
	private int numero;
	private String nome;

	public double getSaldo(){
		return this.saldo;
	}

	public void deposita(double valor) throws ValorInvalidoException{
		if(valor < 0) 
			throw new ValorInvalidoException(valor);
		else
			this.saldo += valor;
	}

	public void saca(double valor){
		this.saldo -= valor;
	}
	

	public abstract void atualiza(double taxa);
	
	@Override
	public String toString() {
		return "esse objeto é uma conta com saldo R$" + this.saldo;
	}
	
	@Override
	public boolean equals(Object obj) {
		Conta c = (Conta) obj;
		return this.numero == c.numero && this.nome.equals(c.nome);
	}
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	

}
