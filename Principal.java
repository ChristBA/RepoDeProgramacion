package paquete;

import java.util.Scanner;

public class Principal {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int opc;
		try {
			do {

				System.out.println("1) Stock");
				System.out.println("2) Servicios");
				System.out.println("3) Salir");
				System.out.println("Ingrese una opción:");
				opc = sc.nextInt();
				switch (opc) {
				case 1:
					menuStock();
					break;
				case 2:

					break;
				case 3:
					System.out.println("Adiós");
					break;
				default:
					System.out.println("Opción incorrecta");
				}
			} while (opc != 3);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void menuStock() {
		System.out.println("1) Alta");
		System.out.println("2) Baja");
		System.out.println("3) Modificacion");
		System.out.println("4) Listado");
		System.out.println("5) Consulta");
		System.out.println("6) Salir");

	}

}
