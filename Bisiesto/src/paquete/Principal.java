package paquete;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int sumador=0;
		int num;
		for(int contador=0;contador<4;contador++) {
			System.out.println("Ingrese un numero");
			num=entrada.nextInt();
			sumador=num+sumador;
		}
		System.out.println("La suma de los numeros es " + sumador);

	}

}
