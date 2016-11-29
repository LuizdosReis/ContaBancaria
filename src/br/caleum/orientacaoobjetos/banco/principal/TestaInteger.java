package br.caleum.orientacaoobjetos.banco.principal;

import java.io.PrintStream;

public class TestaInteger {
	public static void main(String[] args) {
		Integer x1 = new Integer(10);
	    Integer x2 = new Integer(10);

	    if (x1.equals(x2)) {
	        System.out.println("igual");
	    } else {
	        System.out.println("diferente");
	    }
	    
	    x1 = Integer.parseInt("123");
	    x2 = Integer.parseInt("abc");
	    
	    x2.toString();
	    
	    
	    PrintStream saida = System.out;
	    saida.println("ola");
	    
	}
	

}
