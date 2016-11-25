
public class ContaPoupanca extends Conta{
	
	public void deposita(double valor){
		valor -= 0.10;
		super.deposita(valor);
	}

	@Override
	public void atualiza(double taxa) {
		this.saldo += this.saldo*taxa*3;
		
	}
	

}
