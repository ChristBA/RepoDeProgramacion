package paquete;

import java.util.Scanner;

public class Ejemplito {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc = new Scanner(System.in);
		if (true) {
			System.out.println("hola");
		}
		System.out.println("Ingrese un numero");
		try{
			num = sc.nextInt();
			System.out.println("El numero es "+num);
		}catch(Exception e) {
			System.out.println("No ingreso un numero");
		}
		

	}

}
