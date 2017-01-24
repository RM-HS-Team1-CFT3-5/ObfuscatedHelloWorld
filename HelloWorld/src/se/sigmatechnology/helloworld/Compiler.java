package se.sigmatechnology.helloworld;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import java.lang.ProcessBuilder;

public class Compiler {

	public static void main(String[] args) {
		File inFile = new File("HelloWorld.ap");
		File outFile = new File("HelloWorld.java");
		
		
		String line = "";
		StringBuilder sb = new StringBuilder();
		
		try{
			
			FileReader fr = new FileReader(inFile);
			FileWriter fw = new FileWriter(outFile);
			
			BufferedReader br = new BufferedReader(fr);
			BufferedWriter bw = new BufferedWriter(fw);
			
			while ( (line = br.readLine()) != null ){
				line = line.replace('G', 'H');
				line = line.replace('F', 'e');
				line = line.replace('K', 'l');
				line = line.replace('N', 'o');
				line = line.replace('V', 'w');
				line = line.replace('Q', 'r');
				line = line.replace('C', 'd');
				line = line.replace('@', '0');
				line = line.replace('#', '1');
				sb.append("\n");
				sb.append(line);
			}
			
			bw.write(sb.toString());
			bw.flush();
			

			if(br!=null)
				br.close();
			
			if (bw != null)
				bw.close();
			
			
			Process pr = Runtime.getRuntime().exec("javac HelloWorld.java");
			pr.waitFor();
			//Process prr = Runtime.getRuntime().exec("java HelloWorld");
			//prr.waitFor();
			//System.out.println(prr.getInputStream());
			
			//Process prr = new ProcessBuilder("java HelloWorld").start();
			HelloWorld.main(null);
			
			File fJava = new File("HelloWorld.java");
			File fClass = new File("HelloWorld.class");
			
			if(fJava.exists())
				fJava.delete();
			
			if(fClass.exists())
				fClass.delete();
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
