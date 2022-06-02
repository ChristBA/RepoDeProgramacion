package paquete;

import java.util.Scanner;

//Crear un programa que solicite numeros al usuario hasta que ingrese 0 o 
//hasta que ingrese 10 numeros. Al finalizar,  mostrar la suma de todos los numeros.
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int numero=1, suma=0, contador=1;
		while(numero != 0 && contador <= 10) {
			System.out.println("Ingrese un numero");
			numero = entrada.nextInt();
			contador++;
			suma+=numero;
		}
		System.out.println("La suma total es " + suma);
		
		/*if (numero == 0 ) {
			if (contador <= 10 ){
			}
		}*/

	}

}
