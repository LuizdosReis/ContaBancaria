package br.caleum.orientacaoobjetos.banco.principal;

import java.util.HashMap;
import java.util.Map;

import br.caleum.orientacaoobjetos.banco.conta.Conta;
import br.caleum.orientacaoobjetos.banco.conta.ContaCorrente;
import br.caleum.orientacaoobjetos.banco.excecao.ValorInvalidoException;

public class TestaMapa {

	public static void main(String[] args) throws ValorInvalidoException {
		Conta contaCorrente = new ContaCorrente(0);
		contaCorrente.deposita(50.00);
		Conta contaCorrente2 = new ContaCorrente(0);
		contaCorrente2.deposita(30);
		
		Map<String, Conta> mapaDeContas = new HashMap<String, Conta>();
		
		mapaDeContas.put("diretor", contaCorrente);
		mapaDeContas.put("gerente",contaCorrente2);
		
		Conta c = mapaDeContas.get("diretor");
		System.out.println(c.getSaldo());
		
		
		
		
	}

}
