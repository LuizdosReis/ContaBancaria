package br.caleum.orientacaoobjetos.banco.principal;

public class TesteString {
	public static void main(String[] args) {
		String s = "fj11";
        s = s.replaceAll("1", "2");
        System.out.println(s);
        System.out.println(s.contains("tj"));
        s = "fj 11";
        System.out.println(s);
        s = s.replace(" ","");
        System.out.println(s);
        System.out.println(s.isEmpty());
        System.out.println(s.length());
        
        imprimeLetrasPorLinha("alura");
        imprimefraseDeTrasParaFrente("anotaram a data da maratona");
        transformaStringEmNumero("762");
        
        
   }
	
	
	static void imprimeLetrasPorLinha(String palavra){
		for (int i = 0; i < palavra.length(); i++) {
			System.out.println(palavra.charAt(i));
			
		}
	}
	
	static void imprimefraseDeTrasParaFrente(String palavra){
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.insert(0,palavra);
		stringBuffer.reverse();
		System.out.println(stringBuffer);
	}
	
	static void transformaStringEmNumero(String numero){
		int numeroInt = 0;
		for (int i = 0; i < numero.length(); i++) {
			numeroInt *= 10;
			numeroInt += numero.charAt(i) - '0';
		}
		System.out.println(numeroInt);
		
		
	}

}
