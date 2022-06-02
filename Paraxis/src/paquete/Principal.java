package paquete;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int opc;
		boolean salir = false;
		System.out.println("Bienvenido al sistema");
		while (salir != true) {
			System.out.println("1)Ver Historial");
			System.out.println("2)Salir");
			System.out.println("Ingrese una opción:");
			opc = entrada.nextInt();
			switch (opc) {
			case 1: // Ver Historial
				break;
			case 2: // Salir
				salir = true;
				break;
			default:
				System.out.println("Opcion errónea");

			}
			System.out.println("Fin del programa");

		}

	}
}