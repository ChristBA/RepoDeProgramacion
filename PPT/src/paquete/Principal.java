package paquete;
import java.util.Scanner;
import java.util.Random;

public class Principal {
	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);
		Random azar = new Random();
		int opcionUsuario, opcionMaquina;
		System.out.println("Bienvenido a piedra, papel o tijera");
		System.out.println("Ingrese una opcion");
		System.out.println("1) Piedra");
		System.out.println("2) Papel");
		System.out.println("3) Tijera");
		opcionUsuario = entrada.nextInt();
		opcionMaquina = azar.nextInt(3)+1;
		System.out.println("El usuario ha elegido la opcion "+opcionUsuario+" y la maquina la opcion "+opcionMaquina);
		if(opcionUsuario == opcionMaquina) {
			System.out.println("Es un empate");
		}else {
			if((opcionUsuario==1 && opcionMaquina==2) || (opcionUsuario==2 && opcionMaquina==3) || (opcionUsuario==3 && opcionMaquina==1)) {
				System.out.println("Ha ganado la máquina");
			}else {
				System.out.println("Ha ganado el usuario");
			}
		}
		entrada.close();
	}
}
