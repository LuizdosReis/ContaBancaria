
public class GerenciadorDeImpostoDeRenda {
	private double total;

	void adiciona(Tributavel t){
		this.total += t.calculaTributaveis();
	}

	public double getTotal() {
		return total;
	}
	
}
