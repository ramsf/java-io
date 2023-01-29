package br.com.alura.java.io.teste;

import java.io.IOException;
import java.io.PrintWriter;

public class TesteEscritaPrintStreamPrintWriter {

	public static void main(String[] args) throws IOException {
		// Fluxo de entrada com arquivo
		
		//Fluxo de Entrada com Arquivo
        //OutputStream fos = new FileOutputStream("lorem4.txt");
        //Writer osw = new OutputStreamWriter(fos);
        //Buff3eredWriter bw = new BufferedWriter(osw);
		
		//BufferedWriter bw = new BufferedWriter(new FileWriter("lorem4.txt"));

		//PrintStream ps = new PrintStream("lorem4.txt");
		PrintWriter ps = new PrintWriter("lorem4.txt");
		
		ps.println("Incluido para escrita no arquivo");
		ps.println();
		
		ps.println(" lfhdsajfndjsifn vohjn lkmfwnfownf");
		ps.close();	
	}

}
