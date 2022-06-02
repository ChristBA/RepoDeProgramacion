package paquete;

import java.util.Scanner;

public class Juegos {
	public static int puntos = 0, puntero;
	public static int [] repetidas = new int[10];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		String palabras[] = new String[10];

		palabras[0] = "Starscream";
		palabras[1] = "Soundwave";
		palabras[2] = "Shockwave";
		palabras[3] = "Megatron";
		palabras[4] = "Matrix de liderazgo";
		palabras[5] = "Chispa suprema";
		palabras[6] = "Primus";
		palabras[7] = "Unicron";
		palabras[8] = "Tierra";
		palabras[9] = "Cybertron";

		String preguntas[] = new String[10];

		preguntas[0] = "¿Como se llama el segundo al mando de los Decepticons en la saga de Transformers?";
		preguntas[1] = "¿Como se llama el vijilante de los Decepticons en la saga de Transformers?";
		preguntas[2] = "¿Como se llama el cientifico de los Decepticons en la saga de Transformers?";
		preguntas[3] = "¿Como se llama el lider de los Decepticons en la saga de Transformers?";
		preguntas[4] = "¿Como se llama el artefacto que Optimus Prime lleva dentro de su pecho en la saga de Transformers?";
		preguntas[5] = "¿Como se llama el importante artefacto que da vida al planeta de los Transformers?";
		preguntas[6] = "¿Como se llama el creador de la vida de los Transformers?";
		preguntas[7] = "¿Como se llama el destructor de la vida de los Transformers?";
		preguntas[8] = "¿Como se llama uno de los planetas en el que luchan los Transformers?";
		preguntas[9] = "¿Como se llama el planeta de los Transformers?";
		char letra = ' ';
		
		
		

		Scanner teclado = new Scanner(System.in);

		int menuPrincipal = 0, menuAhorcado = 1, menuTrivia = 2;

		do {

			System.out.println("Menu principal");

			System.out.println("[1] Menu Ahorcado");

			System.out.println("[2] Menu Trivia");

			System.out.println("Ingrese numero de opcion: ");

			menuPrincipal = scan.nextInt();

			switch (menuPrincipal) {

			case 1:

				do {
					

					System.out.println("1 - Iniciar Juego");

					System.out.println("2 - Volver al menu principal");

					System.out.println("Ingrese numero de opcion: ");

					menuAhorcado = scan.nextInt();

					switch (menuAhorcado) {

					case 1:

						System.out.println("Se inicia el juego");
						scan.nextLine();
						char letras[] = new char[palabras[0].length()];

						int i = 0;
						int vidas = 6;
						while (letra != '0' && vidas != 0) {

							int fallos = 0;
							for (int a = 0; i < palabras[0].length(); i++) { // Esto se modifica
								if (letra == palabras[0].charAt(i)) { // Esto se modifica
									System.out.print(" " + palabras[0].charAt(i) + " "); // Esto se modifica.
									letras[i] = letra;
								} else if (letras[i] == palabras[0].charAt(i) && (letras[i] != letra)) { // Esto se
																											// modifica.
									System.out.print(" " + letras[i]);
								} else {
									System.out.print(" - ");
									fallos++;
									vidas--;
								}
							}
						}
						scan.nextLine();
						char letras1[] = new char[palabras[1].length()];

						int a = 0;
						while (letra != '0') {

							for (int aa = 0; i < palabras[1].length(); i++) { // Esto se modifica
								int fallos = 0;
								if (letra == palabras[1].charAt(i)) { // Esto se modifica
									System.out.print(" " + palabras[1].charAt(i) + " "); // Esto se modifica.
									letras[i] = letra;
								} else if (letras[i] == palabras[1].charAt(i) && (letras[i] != letra)) { // Esto se
																											// modifica.
									System.out.print(" " + letras[i]);
									fallos++;
								} else {
									System.out.print(" - ");
									fallos++;
									vidas--;
								}
							}
						}
						scan.nextLine();
						char letras2[] = new char[palabras[2].length()];

						int b = 0;
						while (letra != '0') {

							for (int bb = 0; i < palabras[2].length(); i++) { // Esto se modifica
								int fallos = 0;
								if (letra == palabras[2].charAt(i)) { // Esto se modifica
									System.out.print(" " + palabras[2].charAt(i) + " "); // Esto se modifica.
									letras[i] = letra;
								} else if (letras[i] == palabras[2].charAt(i) && (letras[i] != letra)) { // Esto se
																											// modifica.
									System.out.print(" " + letras[i]);
									fallos++;
								} else {
									System.out.print(" - ");
									fallos++;
									vidas--;
								}
							}
						}
						scan.nextLine();
						char letras3[] = new char[palabras[3].length()];

						int cc = 0;
						while (letra != '0') {

							for (int c = 0; i < palabras[3].length(); i++) { // Esto se modifica
								int fallos = 0;
								if (letra == palabras[3].charAt(i)) { // Esto se modifica
									System.out.print(" " + palabras[3].charAt(i) + " "); // Esto se modifica.
									letras[i] = letra;
								} else if (letras[i] == palabras[3].charAt(i) && (letras[i] != letra)) { // Esto se
																											// modifica.
									System.out.print(" " + letras[i]);
									fallos++;
								} else {
									System.out.print(" - ");
									fallos++;
									vidas--;
								}
							}
						}
						scan.nextLine();
						char letras4[] = new char[palabras[4].length()];

						int dd = 0;
						while (letra != '0') {

							for (int d = 0; i < palabras[4].length(); i++) { // Esto se modifica
								int fallos = 0;
								if (letra == palabras[4].charAt(i)) { // Esto se modifica
									System.out.print(" " + palabras[4].charAt(i) + " "); // Esto se modifica.
									letras[i] = letra;
								} else if (letras[i] == palabras[4].charAt(i) && (letras[i] != letra)) { // Esto se
																											// modifica.
									System.out.print(" " + letras[i]);
									fallos++;
								} else {
									System.out.print(" - ");
									fallos++;
									vidas--;
								}
							}
						}
						scan.nextLine();
						char letras5[] = new char[palabras[5].length()];

						int ee = 0;
						while (letra != '0') {

							for (int e = 0; i < palabras[5].length(); i++) { // Esto se modifica
								int fallos = 0;
								if (letra == palabras[5].charAt(i)) { // Esto se modifica
									System.out.print(" " + palabras[5].charAt(i) + " "); // Esto se modifica.
									letras[i] = letra;
								} else if (letras[i] == palabras[5].charAt(i) && (letras[i] != letra)) { // Esto se
																											// modifica.
									System.out.print(" " + letras[i]);
									fallos++;
								} else {
									System.out.print(" - ");
									fallos++;
									vidas--;
								}
							}
						}
						scan.nextLine();
						char letras6[] = new char[palabras[6].length()];

						int ff = 0;
						while (letra != '0') {

							for (int f = 0; i < palabras[6].length(); i++) { // Esto se modifica
								int fallos = 0;
								if (letra == palabras[6].charAt(i)) { // Esto se modifica
									System.out.print(" " + palabras[6].charAt(i) + " "); // Esto se modifica.
									letras[i] = letra;
								} else if (letras[i] == palabras[6].charAt(i) && (letras[i] != letra)) { // Esto se
																											// modifica.
									System.out.print(" " + letras[i]);
									fallos++;
								} else {
									System.out.print(" - ");
									fallos++;
									vidas--;
								}
							}
						}
						scan.nextLine();
						char letras7[] = new char[palabras[7].length()];

						int g = 0;
						while (letra != '0') {

							for (int gg = 0; i < palabras[7].length(); i++) { // Esto se modifica
								int fallos = 0;
								if (letra == palabras[7].charAt(i)) { // Esto se modifica
									System.out.print(" " + palabras[7].charAt(i) + " "); // Esto se modifica.
									letras[i] = letra;
								} else if (letras[i] == palabras[7].charAt(i) && (letras[i] != letra)) { // Esto se
																											// modifica.
									System.out.print(" " + letras[i]);
									fallos++;
								} else {
									System.out.print(" - ");
									fallos++;
									vidas--;
								}
							}
						}
						scan.nextLine();
						char letras8[] = new char[palabras[8].length()];

						int h = 0;
						while (letra != '0') {

							for (int hh = 0; i < palabras[8].length(); i++) { // Esto se modifica
								int fallos = 0;
								if (letra == palabras[8].charAt(i)) { // Esto se modifica
									System.out.print(" " + palabras[8].charAt(i) + " "); // Esto se modifica.
									letras[i] = letra;
								} else if (letras[i] == palabras[8].charAt(i) && (letras[i] != letra)) { // Esto se
																											// modifica.
									System.out.print(" " + letras[i]);
									fallos++;
								} else {
									System.out.print(" - ");
									fallos++;
									vidas--;
								}
							}
						}
						scan.nextLine();
						char letras9[] = new char[palabras[9].length()];

						int j = 0;
						while (letra != '0') {

							for (int jj = 0; i < palabras[9].length(); i++) { // Esto se modifica
								int fallos = 0;
								if (letra == palabras[9].charAt(i)) { // Esto se modifica
									System.out.print(" " + palabras[9].charAt(i) + " "); // Esto se modifica.
									letras[i] = letra;
								} else if (letras[i] == palabras[9].charAt(i) && (letras[i] != letra)) { // Esto se
																											// modifica.
									System.out.print(" " + letras[i]);
									fallos++;
								} else {
									System.out.print(" - ");
									fallos++;
									vidas--;
								}
							}
						}

						break;

					case 2:

						System.out.println("Volviendo al menu principal");

						break;

					}

				} while (menuAhorcado != 3);

				break;

			case 2:

				do {
					for(int i = 0; i<10; i++) {
						repetidas[i]=1;
					}

					System.out.println("1 - Iniciar Juego");

					System.out.println("2 - Volver al menu principal");

					System.out.println("Ingrese numero de opcion: ");

					menuTrivia = scan.nextInt();

					switch (menuTrivia) {

					case 1:

						System.out.println("Se inicia el juego");
						System.out.println(pregunta_aleatoria(preguntas));

						String var0;
						scan.nextLine();
						var0 = scan.nextLine();

						if (respuesta_correcta(var0, palabras)) {
							System.out.println("Respuesta correcta");
						} else {
							System.out.println("Respuesta incorrecta");
						}
								
						System.out.println(pregunta_aleatoria(preguntas));

						String var1;
						var1 = scan.nextLine();

						if (respuesta_correcta(var1, palabras)) {
							System.out.println("Respuesta correcta");
						} else {
							System.out.println("Respuesta incorrecta");
						}

						System.out.println(pregunta_aleatoria(preguntas));
						String var2;
						var2 = scan.nextLine();

						if (respuesta_correcta(var2, palabras)) {
							System.out.println("Respuesta correcta");
						} else {
							System.out.println("Respuesta incorrecta");
						}

						System.out.println(pregunta_aleatoria(preguntas));
						String var3;
						var3 = scan.nextLine();

						if (respuesta_correcta(var3, palabras)) {
							System.out.println("Respuesta correcta");
						} else {
							System.out.println("Respuesta incorrecta");
						}

						System.out.println(pregunta_aleatoria(preguntas));
						String var4;
						var4 = scan.nextLine();

						if (respuesta_correcta(var4, palabras)) {
							System.out.println("Respuesta correcta");
						} else {
							System.out.println("Respuesta incorrecta");
						}

						System.out.println(pregunta_aleatoria(preguntas));
						String var5;
						var5 = scan.nextLine();

						if (respuesta_correcta(var5, palabras)) {
							System.out.println("Respuesta correcta");
						} else {
							System.out.println("Respuesta incorrecta");
						}

						System.out.println(pregunta_aleatoria(preguntas));
						String var6;
						var6 = scan.nextLine();

						if (respuesta_correcta(var6, palabras)) {
							System.out.println("Respuesta correcta");
						} else {
							System.out.println("Respuesta incorrecta");
						}

						System.out.println(pregunta_aleatoria(preguntas));
						String var7;
						var7 = scan.nextLine();

						if (respuesta_correcta(var7, palabras)) {
							System.out.println("Respuesta correcta");
						} else {
							System.out.println("Respuesta incorrecta");
						}

						System.out.println(pregunta_aleatoria(preguntas));
						String var8;
						var8 = scan.nextLine();

						if (respuesta_correcta(var8, palabras)) {
							System.out.println("Respuesta correcta");
						} else {
							System.out.println("Respuesta incorrecta");
						}

						System.out.println(pregunta_aleatoria(preguntas));
						String var9;
						var9 = scan.nextLine();

						if (respuesta_correcta(var9, palabras)) {
							System.out.println("Respuesta correcta");
						} else {
							System.out.println("Respuesta incorrecta");
						}

						break;

					case 2:

						System.out.println("Volviendo al menu principal");

						break;

					}

				} while (menuTrivia != 2);

				break;

			case 3:

				System.out.println("Volviendo al menú principal");

				break;

			}

		} while (menuPrincipal != 3);

	}// Fin de la funcion principal

	public static boolean respuesta_correcta(String respuesta, String[] palabras) {
		boolean bandera=false;
		if (palabras[puntero].equals(respuesta)) {
			puntos += 25;	
			bandera=true;
		}
		System.out.println("Tienes "+puntos+" puntos");
		return bandera;

	}

	public static String pregunta_aleatoria(String[] preguntas) {
		int numero=0;
		String respuesta="";
		boolean bandera=false;
		
		while(!bandera) {
			numero =(int) (Math.random() * 10);
			if (repetidas[numero] == 1) {
				respuesta = preguntas[numero];
				repetidas[numero]=0;
				puntero=numero;
				bandera=true;
			}
		}		
		return respuesta;
	}

}