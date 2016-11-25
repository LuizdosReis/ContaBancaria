
public class Principal {
	public static void main(String[] args) {
		Conta conta = new ContaPoupanca();
		try {
			conta.deposita(100.0);
		} catch (ValorInvalidoException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(conta.getSaldo());
		
		GerenciadorDeImpostoDeRenda g = new GerenciadorDeImpostoDeRenda();
		
		SeguroDeVida seguroDeVida = new SeguroDeVida();
		g.adiciona(seguroDeVida);

		ContaCorrente contaCorrente = new ContaCorrente();
		try {
			contaCorrente.deposita(1000);
		} catch (ValorInvalidoException e) {
			System.out.println(e.getMessage());
		}
		g.adiciona(contaCorrente);
		
		System.out.printf("O saldo é: %.2f",g.getTotal());
		
		
	}

}
