package br.caleum.orientacaoobjetos.banco.excecao;

public class ValorInvalidoException extends Exception{
	public ValorInvalidoException(Double valor){
		super("Valor invalida: "+valor);	
	}
	

}
