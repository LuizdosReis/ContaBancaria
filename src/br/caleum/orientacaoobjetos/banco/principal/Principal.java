package br.caleum.orientacaoobjetos.banco.principal;

import br.caleum.orientacaoobjetos.banco.conta.Conta;
import br.caleum.orientacaoobjetos.banco.conta.ContaCorrente;
import br.caleum.orientacaoobjetos.banco.conta.ContaPoupanca;
import br.caleum.orientacaoobjetos.banco.conta.GerenciadorDeImpostoDeRenda;
import br.caleum.orientacaoobjetos.banco.conta.SeguroDeVida;
import br.caleum.orientacaoobjetos.banco.excecao.ValorInvalidoException;

public class Principal {
	public static void main(String[] args) {
		Conta conta = new ContaPoupanca(0);
		try {
			conta.deposita(100.0);
		} catch (ValorInvalidoException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(conta.getSaldo());
		
		GerenciadorDeImpostoDeRenda g = new GerenciadorDeImpostoDeRenda();
		
		SeguroDeVida seguroDeVida = new SeguroDeVida();
		g.adiciona(seguroDeVida);

		ContaCorrente contaCorrente = new ContaCorrente(0);
		try {
			contaCorrente.deposita(1000);
		} catch (ValorInvalidoException e) {
			System.out.println(e.getMessage());
		}
		g.adiciona(contaCorrente);
		
		System.out.printf("O saldo é: %.2f \n",g.getTotal());
		
		System.out.println(conta);
		
		
	}

}
