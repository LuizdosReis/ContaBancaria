package br.caleum.orientacaoobjetos.banco.conta;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class Banco {
	private List<Conta> contas = new ArrayList<>();
	private Map<String,Conta> mapaContas = new HashMap<String,Conta>();
	
	public void adiciona(Conta c){
		this.contas.add(c);
		this.mapaContas.put(c.getNome(), c);
	}
	
	public Conta pega(int indice){
		return contas.get(indice);
	}
	
	public int pegaQuantidadeDeContas(){
		return contas.size();
	}
	
	public Conta buscaPorNome(String nome){
		return mapaContas.get(nome);
	}
	

}
