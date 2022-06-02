package paquete;

import java.io.*;
import java.util.Scanner;

public class Principal {
	public static void main(String args[]) {
		
		File f = new File("ejemplo.txt");

		try {
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);

			String linea=br.readLine();

			do {
				System.out.println(linea);
				linea = br.readLine();
			} while (linea != null);

			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		/*
		Scanner entrada = new Scanner(System.in);
		int numPersonas = 5;

		int[] edad = new int[numPersonas];
		String[] nombre = new String[numPersonas];
		String[] apellido = new String[numPersonas];

		try {
		  FileWriter fichero = new FileWriter("ejercicio1.txt");
		  PrintWriter pw = new PrintWriter(fichero);

		  for(int i = 0; i < numPersonas; i++) {
		    System.out.print("Nombre del usuario " + (i + 1) + ": ");
		    nombre[i] = entrada.next();

		    System.out.print("Apellido del usuario " + (i + 1) + ": ");
		    apellido[i] = entrada.next();

		    System.out.print("Edad del usuario " + (i + 1) + ": ");
		    edad[i] = entrada.nextInt();

		    pw.println((i + 1) + ":" + nombre[i] + ":" + apellido[i] + ":" + edad[i]);
		  }

		  pw.close();
		} catch(IOException e) {
		  e.printStackTrace();
		}*/
	}
}
