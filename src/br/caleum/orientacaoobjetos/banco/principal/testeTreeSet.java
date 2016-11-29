package br.caleum.orientacaoobjetos.banco.principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class testeTreeSet {
	public static void main(String[] args) {
		TreeSet<Integer> c = new TreeSet<Integer>();
		List<Integer> list = new ArrayList<>();
		
		for (int i = 1; i <= 1000; i++) {
			c.add(i);
			list.add(i);
		}
		
		Collections.reverse(list);
		
		for (Integer integer : list) {
			System.out.println(integer);
			
		}
		
		
		
		for (Integer integer : c.descendingSet()) {
			System.out.println(integer);
		}
		
		
	}

}
