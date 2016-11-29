package br.caleum.orientacaoobjetos.banco.principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import br.caleum.orientacaoobjetos.banco.conta.ContaPoupanca;

public class TestaOrdenacaoDeContas {
	public static void main(String[] args) {
		ContaPoupanca contaPoupanca = new ContaPoupanca(320);
		contaPoupanca.setNome("Luiz");
		contaPoupanca.setNumero(123);
		ContaPoupanca contaPoupanca2 = new ContaPoupanca(321);
		contaPoupanca2.setNome("Anderson");
		contaPoupanca2.setNumero(012);
		ContaPoupanca contaPoupanca3 = new ContaPoupanca(150);
		contaPoupanca3.setNome("Beatriz");
		contaPoupanca3.setNumero(001);		
		List<ContaPoupanca> arrayList = new LinkedList<>();
		arrayList.add(contaPoupanca);
		arrayList.add(contaPoupanca2);
		arrayList.add(contaPoupanca3);
		
		Random gerador = new Random();
		
		for(int i = 0;i <=300000;i++){
			ContaPoupanca c = new ContaPoupanca(gerador.nextDouble());
			c.setNumero(gerador.nextInt(10)+1);
			c.setNome("C"+i);
			arrayList.add(c);
		}
		
		Collections.sort(arrayList);
		
		Collections.reverse(arrayList);
		
		Collections.shuffle(arrayList);
		
		Collections.rotate(arrayList, arrayList.size());
		for (ContaPoupanca contaPoupanca4 : arrayList) {
			System.out.println(contaPoupanca4);
		}
		
		
	}

}
