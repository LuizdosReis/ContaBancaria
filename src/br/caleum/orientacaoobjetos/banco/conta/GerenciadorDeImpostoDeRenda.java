package br.caleum.orientacaoobjetos.banco.conta;
public class GerenciadorDeImpostoDeRenda {
	private double total;

	public void adiciona(Tributavel t){
		this.total += t.calculaTributaveis();
	}

	public double getTotal() {
		return total;
	}
	
}
