package br.caleum.orientacaoobjetos.banco.principal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;

public class TestePerformace {
	public static void main(String[] args) {
		Collection<Integer> c = new HashSet<Integer>();
		
		long inicio = System.currentTimeMillis();
		
		for(int i=0;i<30000;i++){
			c.add(i);
		}
		
		long fim = System.currentTimeMillis();
		
		
		for (int i = 0; i < 30000; i++) {
			c.contains(i);
		}
		
		
		long tempo = fim - inicio;
		
		System.out.println(tempo);
		
	}

}
