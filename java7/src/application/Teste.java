package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Teste {



	public static void main(String[] args) throws IOException {
	String[] lines = new String[] {"texto 1" , "texto2", "texto3"};
	
	String path = "c:\\temp\\out.txt";
	
	try (BufferedWriter bw  = new BufferedWriter(new FileWriter(path , true))){
		for(String line : lines) {
			bw.write(line);
			bw.newLine();
		}
	}
	catch (IOException e ){
		e.printStackTrace();
	}
	}

}
