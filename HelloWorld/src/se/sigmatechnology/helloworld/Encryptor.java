package se.sigmatechnology.helloworld;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Encryptor {

	public static void main(String[] args) {
		File inFile = new File("HelloWorld.java");
		File outFile = new File("HelloWorld.ap");
		
		String line = "";
		StringBuilder sb = new StringBuilder();
		
		try{
			
			FileReader fr = new FileReader(inFile);
			FileWriter fw = new FileWriter(outFile);
			
			BufferedReader br = new BufferedReader(fr);
			BufferedWriter bw = new BufferedWriter(fw);
			
			while ( (line = br.readLine()) != null ){
				line = line.replace('H', 'G');
				line = line.replace('e', 'F');
				line = line.replace('l', 'K');
				line = line.replace('o', 'N');
				line = line.replace('w', 'V');
				line = line.replace('r', 'Q');
				line = line.replace('d', 'C');
				line = line.replace('0', '@');
				line = line.replace('1', '#');
				sb.append("\n");
				sb.append(line);
			}
			
			bw.write(sb.toString());
			bw.flush();
			

			if(br!=null)
				br.close();
			
			if (bw != null)
				bw.close();
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}
