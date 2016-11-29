package br.caleum.orientacaoobjetos.banco.principal;

import br.caleum.orientacaoobjetos.banco.conta.Conta;
import br.caleum.orientacaoobjetos.banco.conta.ContaCorrente;
import br.caleum.orientacaoobjetos.banco.conta.ContaPoupanca;

public class TestaComparacaoDeContas {
	public static void main(String[] args) {
		ContaCorrente contaCorrente = new ContaCorrente();
		Conta contaPoupanca = new ContaPoupanca();
		
		contaCorrente.setNome("luiz");
		
		contaPoupanca.setNome("luiz");
		
		contaCorrente.setNumero(123);
		
		contaPoupanca.setNumero(123);
		
		System.out.println(contaCorrente==contaPoupanca);
		
		System.out.println(contaCorrente.equals(contaPoupanca));

		
		
	}

}
