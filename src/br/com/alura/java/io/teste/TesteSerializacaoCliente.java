package br.com.alura.java.io.teste;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TesteSerializacaoCliente {

	public static void main(String[] args)throws  IOException, ClassNotFoundException {
		
		//Cliente cliente = new Cliente();
		//cliente.setNome("Rômulo");
		//cliente.setProfissao("Desenvolvedor");
		//cliente.setCpf("05505505500");
		
		
		
		// String nome = "Romulo eu";
		
		// ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("objeto.bin"));
		// oos.writeObject(cliente);
		// oos.close();
		
		
		  ObjectInputStream ois = new ObjectInputStream(new
		  FileInputStream("objeto.bin")); 
		  Cliente cliente = (Cliente) ois.readObject();
		  ois.close();
		 
		
		System.out.println(cliente);
		
	}
}
