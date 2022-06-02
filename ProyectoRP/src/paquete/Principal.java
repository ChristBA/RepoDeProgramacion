package paquete;

import java.io.*;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		File f = new File("ejemplo.txt");
		
		int opc, contador=0, cedula;
		boolean salir=false;
		
		while (salir != true) {
			System.out.println("1)Ingresar clientes");
			System.out.println("2)Agendar servicios");
			System.out.println("3)Lista de clientes");
			System.out.println("4)Lista de servicios");
			System.out.println("5)Cálculo de gastos");
			System.out.println("6)Ver Historial");
			System.out.println("7)Salir");
			System.out.println("Ingrese opcion");
			opc = entrada.nextInt();
			int variable
			switch (opc) {
			case 1:
				try {
					FileReader fr = new FileReader (f);
					BufferedReader br = new BufferedReader (fr);
					String linea = br.readLine();
					do {
						contador += 1;
						if (linea.equals(variable)) {
							
						}
						linea = br.readLine();
					} while (linea != null);
					br.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
				if (contador < 20) {
					try {
						FileWriter fichero = new FileWriter("clientes.txt");
						PrintWriter pw = new PrintWriter(fichero);
						System.out.println("Ingrese cedula");
						cedula = entrada.nextInt();
						pw.println((contador + 1) + ":" + cedula);
						pw.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				} else {
					System.out.println("Error. Exceede 20 clientes");
				}
				break;
			case 2:
				break;
			case 3:
				try {
					FileReader fr = new FileReader (f);
					BufferedReader br = new BufferedReader (fr);
					String linea = br.readLine();
					do {
						System.out.println(linea);
						linea = br.readLine();
					} while (linea != null);
					br.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
			case 4:
				break;
			case 5:
				break;
			case 6: //Ver Historial
				try {
					FileReader fr = new FileReader (f);
					BufferedReader br = new BufferedReader (fr);
					String linea = br.readLine();
					do {
						System.out.println(linea);
						linea = br.readLine();
					} while (linea != null);
					br.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
		
				/*if (!f.exists()) {
					try {
						f.createNewFile();
					}catch(Exception e){
						e.printStackTrace();
					}
					System.out.println("Ahora existe");
				}else {
					System.out.println("Ya existia");
				}*/
				break;
			case 7: //Salir
				salir = true;
				break;
			default: System.out.println("Opcion erronea");
			}
		}
		System.out.println("Fin del programa");

	}

}