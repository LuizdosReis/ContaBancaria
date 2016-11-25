
public class Principal {
	public static void main(String[] args) {
		Conta conta = new ContaPoupanca();
		conta.deposita(100.0);
		System.out.println(conta.getSaldo());
	}

}
