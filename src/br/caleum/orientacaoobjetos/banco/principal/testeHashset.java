package br.caleum.orientacaoobjetos.banco.principal;

import java.util.Collection;
import java.util.HashSet;

import br.caleum.orientacaoobjetos.banco.conta.Conta;
import br.caleum.orientacaoobjetos.banco.conta.ContaCorrente;

public class testeHashset {
	public static void main(String[] args) {
		Collection<Conta> c = new HashSet<Conta>();
		Conta contaCorrente = new ContaCorrente(0);
		contaCorrente.setNumero(123);
		Conta contaCorrente2 = new ContaCorrente(0);
		contaCorrente2.setNumero(123);
		c.add(contaCorrente);
		c.add(contaCorrente2);
		
		
		for (Conta conta : c) {
			System.out.println(conta.getNumero());
		}
		
		
		
	}
	
	
	
	
	
	
	

}
