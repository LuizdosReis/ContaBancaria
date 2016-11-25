
public class Principal {
	public static void main(String[] args) {
		Conta conta = new ContaPoupanca();
		conta.deposita(100.0);
		System.out.println(conta.getSaldo());
		
		GerenciadorDeImpostoDeRenda g = new GerenciadorDeImpostoDeRenda();
		
		SeguroDeVida seguroDeVida = new SeguroDeVida();
		g.adiciona(seguroDeVida);

		ContaCorrente contaCorrente = new ContaCorrente();
		contaCorrente.deposita(1000);
		g.adiciona(contaCorrente);
		
		System.out.printf("O saldo é: %2f,2d",g.getTotal());
		
		
	}

}
