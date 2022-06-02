package paquete;

import java.util.Scanner;

// Crear un programa que muestre un menu repetitivo con las siguientes opciones
// 1) Ingresar números
// 2) Promedio total
// 3) Promedio de pares
// 4) Promedio de impares
// 0) Salir

public class Principal {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int opc, num, promtotal, acumtotal=0, conttotal=0;
		int contpares=0, acumpares=0, prompares;
		boolean salir=false;
		while(salir != true) {
			System.out.println("1) Ingresar numeros");
			System.out.println("2) Promedio total");
			System.out.println("3) Promedio de pares");
			System.out.println("4) Promedio de impares");
			System.out.println("Ingrese una opcion");
			opc = entrada.nextInt();
			switch(opc) {
			case 1:
				System.out.println("Ingrese un numero");
				num = entrada.nextInt();
				acumtotal += num;
				conttotal++;
				if (num % 2 == 0) {
					contpares++;
					acumpares+=num;
				}
				break;
			case 2: 
				promtotal = acumtotal /conttotal;
				System.out.println("El promedio total es " + promtotal);
				break;
			case 3:
				prompares = acumpares /contpares;
				System.out.println("El promedio total es " + prompares);
				break;
			case 0:
				salir=true;
				break;
			default:
				System.out.println("Error");
			
			}
		}
	}
}