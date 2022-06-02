package lilolila;
import java.util.Scanner;

public class Lalala {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int numero;
		int maximo = 0;
		for(int contenedor =1; contenedor<=3;contenedor++) {
			System.out.print("ingrese un número: ");
			numero = entrada.nextInt();
			if(numero>maximo) {
				maximo=numero;
			}
		}
		System.out.println("El maximo fue" +maximo);
		
	
		}
			
		
							
						
			
}
	
	
		// TODO Esbozo de método generado automáticamente
	
	


