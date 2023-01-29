package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEscritaFileWriter {

	public static void main(String[] args) throws IOException {
		// Fluxo de entrada com arquivo
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("lorem4.txt"));

		bw.write("Incluido para escrita no arquivo");
		bw.newLine();
		bw.newLine();
		bw.newLine();
		bw.write(" lfhdsajfndjsifn vohjn lkmfwnfownf");
		bw.flush();
		bw.close();	
	}

}
