package br.caleum.orientacaoobjetos.banco.principal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestaPerformanceDeAdicionarNaPrimeiraPosicao {
	public static void main(String[] args) {
		
		
		List<Integer> list = new ArrayList<>();
		
		for (int i = 0; i < 30000; i++) {
			list.add(0,i);
		}
		
		long inicio = System.currentTimeMillis();
		
		for (Integer integer : list) {
			System.out.println(integer);
		}
		
		long fim = System.currentTimeMillis();
		
		double tempo = (fim - inicio);
		System.out.println(tempo);
	}

}
