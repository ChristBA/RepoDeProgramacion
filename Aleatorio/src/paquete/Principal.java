package paquete;

import java.util.Random;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random azar = new Random();
		int dado;
		int cara1,cara2,cara3,cara4,cara5,cara6;
		cara1=cara2=cara3=cara4=cara5=cara6=0;
		for (int i=1; i<=6000; i++){
			dado=1+azar.nextInt(6);
			switch(dado) {
			case 1:
				cara1++;
				break;
			case 2:
				cara2++;
				break;
			case 3:
				cara3++;
				break;
			case 4:
				cara4++;
				break;
			case 5:
				cara5++;
				break;
			case 6:
				cara6++;
				break;
			
			}
			
		}
		System.out.println("La cantidad de caras 1 es " + cara1 );
		System.out.println("La cantidad de caras 2 es " + cara2 );
		System.out.println("La cantidad de caras 3 es " + cara3 );
		System.out.println("La cantidad de caras 4 es " + cara4 );
		System.out.println("La cantidad de caras 5 es " + cara5 );
		System.out.println("La cantidad de caras 6 es " + cara6 );




	}

}
