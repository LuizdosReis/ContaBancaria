package br.caleum.orientacaoobjetos.banco.principal;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.util.Scanner;

public class TestandoIO {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("Entrada.txt")));		
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("Saida.txt")));
		
		
		InputStream fileInputStream = new FileInputStream("Entrada.txt");
		Scanner scanner = new Scanner(System.in);
		
		PrintStream printStream = new PrintStream("Saida2.txt");
		
		while(scanner.hasNextLine()){
			printStream.print(scanner.nextLine()+"\n");
		}
		
		scanner.close();
		
		do{
			
			bufferedWriter.write(bufferedReader.readLine());
			bufferedWriter.newLine();
		}while(bufferedReader.ready() != false);
		
		bufferedWriter.close();
		bufferedReader.close();
	}

}
