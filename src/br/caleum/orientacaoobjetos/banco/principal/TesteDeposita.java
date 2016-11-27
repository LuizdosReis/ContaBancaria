package br.caleum.orientacaoobjetos.banco.principal;
import br.caleum.orientacaoobjetos.banco.conta.Conta;
import br.caleum.orientacaoobjetos.banco.conta.ContaCorrente;
import br.caleum.orientacaoobjetos.banco.excecao.ValorInvalidoException;


/**
 * testa o metodo deposita da conta
 * @author luizhenrique
 * 
 */

public class TesteDeposita {
	public static void main(String[] args) {
		Conta cp = new ContaCorrente();
		try {
			cp.deposita(-100);
		} catch (ValorInvalidoException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(cp.getSaldo());
	}
}
