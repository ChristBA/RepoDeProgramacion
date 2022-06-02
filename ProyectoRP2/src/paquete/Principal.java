package paquete;

import java.io.*;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		File f = new File("Clientes.txt");
		File g = new File("Historial.txt");

		int opc, cedula = 0;
		boolean salir = false;

		String[] servicio = new String[8];
		int[] precios = new int[8];
		precios[0] = 615;
		precios[1] = 560;
		precios[2] = 690;
		precios[3] = 480;
		precios[4] = 700;
		precios[5] = 450;
		precios[6] = 510;
		precios[7] = 350;
		servicio[0] = "Masaje tradicional completo $615";
		servicio[1] = "Masaje tradicional descontractura $560";
		servicio[2] = "Masaje oriental con geoterapia $690";
		servicio[3] = "Masaje con aromaterapia $480";
		servicio[4] = "Piscina (2 horas) $700";
		servicio[5] = "Sauna (30 min) $450";
		servicio[6] = "Baño de relajación con hidromasaje (1 hora) $510";
		servicio[7] = "Meditación (30 min) $350";

		System.out.println("Bienvenido al sistema");

		while (salir != true) {

			System.out.println(" ");
			System.out.println("1) Ingresar clientes");
			System.out.println("2) Agendar servicios");
			System.out.println("3) Lista de clientes");
			System.out.println("4) Lista de servicios agendados");
			System.out.println("5) Cálculo de gastos de servicios agendados");
			System.out.println("6) Ver Historial");
			System.out.println("7) Salir");
			System.out.println("Ingrese una opción entre 1 y 7:");
			opc = entrada.nextInt();

			switch (opc) {

			case 1: // Ingresar clientes
				System.out.println("Ingrese una cedula (sin puntos ni guiones. Ej: 12345678):");
				cedula = entrada.nextInt();
				while (cedula > 99999999 || cedula < 10000000) {
					System.out.println("Cedula errónea. Ingrese nuevamente: ");
					cedula = entrada.nextInt();
				}
				boolean registrada = true;
				int contador = 0;
				String scedula1 = cedula + "";
				String[] cedulas1 = scedula1.split("\\s+");

				try { // Verifico si el cliente está registrado y si se pasa de 20 clientes
					FileReader fr = new FileReader(f);
					BufferedReader br = new BufferedReader(fr);
					String linea = br.readLine();
					;
					while (linea != null) {
						contador++;
						for (String numero : cedulas1) {
							if (linea.equals(scedula1)) {
								registrada = false;
							}
						}
linea = br.readLine();
					}
					br.close();
				} catch (Exception e) {
					e.printStackTrace();
				}

				if (registrada != false) {
					if (contador < 20) {
						try { // Escribo la cedula en Clientes.txt
							FileWriter fichero = new FileWriter("Clientes.txt", true);
							PrintWriter pw = new PrintWriter(fichero);
							pw.println(cedula);
							System.out.println("Cliente registrado correctamente");
							pw.close();
						} catch (IOException e) {
							e.printStackTrace();
						}
					} else {
						System.out.println("Error. Excede los 20 clientes registrados");
					}
				} else {
					System.out.println("Cliente ya registrado");
				}
				break;

			case 2: // Agendar servicios
				System.out.println("Ingrese una cedula (sin puntos ni guiones. Ej: 12345678):");
				cedula = entrada.nextInt();
				while (cedula > 99999999 || cedula < 10000000) {
					System.out.println("Cedula errónea. Ingrese nuevamente: ");
					cedula = entrada.nextInt();
				}
				boolean Registrado = false, otroservicio = true;
				String nombre, otro;
				int servicios, dia, mes, anio, contar = 0;
				String scedula2 = cedula + "";
				String[] cedulas2 = scedula2.split("\\s+");

				try { // Verifico que cliente esté en Clientes.txt
					FileReader fr = new FileReader(f);
					BufferedReader br = new BufferedReader(fr);
					String linea = br.readLine();
					while (linea != null && Registrado != true) {
						for (String numero : cedulas2) {
							if (linea.equals(scedula2)) {
								Registrado = true;
							} else {
								linea = br.readLine();
							}
						}
					}
					br.close();
				} catch (Exception e) {
					e.printStackTrace();
				}

				if (Registrado != false) {
					System.out.println("Cliente registrado");
					System.out.println(" ");

					try { // Verifico si el cliente se pasa de 30 contrataciones en Historial.txt
						FileReader fr = new FileReader(g);
						BufferedReader br = new BufferedReader(fr);
						String linea = br.readLine();
						while (linea != null) {
							for (String numero : cedulas2) {
								if (linea.contains(scedula2)) {
									contar++;
								}
							}
							linea = br.readLine();
						}
						br.close();
					} catch (Exception e) {
						e.printStackTrace();
					}

					// Ingresar servicio, fecha y nombre
					while (otroservicio != false && contar < 30) {
						System.out.println("Ingrese un servicio a contratar entre 1 y 8: ");
						System.out.println(" ");
						System.out.println("1-Masaje tradicional completo $615");
						System.out.println("2-Masaje tradicional descontractura $560");
						System.out.println("3-Masaje oriental con geoterapia $690");
						System.out.println("4-Masaje con aromaterapia $480");
						System.out.println("5-Piscina (2 horas) $700");
						System.out.println("6-Sauna (30 min) $450");
						System.out.println("7-Baño de relajación con hidromasaje (1 hora) $510");
						System.out.println("8-Meditación (30 min) $350");
						servicios = entrada.nextInt();
						while (servicios > 8 || servicios < 1) {
							System.out.println("Servicio debe ser entre 1 y 8. Ingrese nuevamente: ");
							servicios = entrada.nextInt();
						}

						System.out.println(" ");
						System.out.println("Ingrese fecha del servicio (Día, mes y año):");
						System.out.println("Ingrese año posterior a 2021: ");
						anio = entrada.nextInt();
						while (anio < 2021) {
							System.out.println("Año debe ser posterior a 2021. Ingrese nuevamente: ");
							anio = entrada.nextInt();
						}

						System.out.println("Ingrese mes entre 1 y 12: ");
						mes = entrada.nextInt();
						while (mes > 12 || mes < 1) {
							System.out.println("Mes debe ser entre 1 y 12. Ingrese nuevamente: ");
							mes = entrada.nextInt();
						}

						System.out.println("Ingrese día entre 1 y 31: ");
						dia = entrada.nextInt();
						while (dia > 31 || dia < 1) {
							System.out.println("Día debe ser entre 1 y 31. Ingrese nuevamente: ");
							dia = entrada.nextInt();
						}

						System.out.println("Ingrese un nombre: ");
						nombre = entrada.next();

						try { // Escribo los datos ingresados en Historial.txt
							FileWriter fichero = new FileWriter("Historial.txt", true);
							PrintWriter pw = new PrintWriter(fichero);
							pw.println(cedula + ":" + servicios + ":" + dia + ":" + mes + ":" + anio + ":" + nombre);
							pw.close();
						} catch (IOException e) {
							e.printStackTrace();
						}
						contar++;

						System.out.println("Ingresar otro servicio? (si/no)");
						otro = entrada.next();
						while (!otro.equals("no") && !otro.equals("si")) {
							System.out.println("Respuesta errónea. Ingrese nuevamente: ");
							otro = entrada.next();
						}
						if (otro.equals("no")) {
							otroservicio = false;
						}

					}
					if (contar >= 30) {
						System.out.println("Error. Excede las 30 contrataciones");
					}
				} else {
					System.out.println("Cliente no registrado");
				}

				break;

			case 3: // Lista de clientes
				try { // Muestro Clientes.txt
					FileReader fr = new FileReader(f);
					BufferedReader br = new BufferedReader(fr);
					String linea = br.readLine();
					while (linea != null) {
						System.out.println(linea);
						linea = br.readLine();
					}
					br.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;

			case 4: // Lista de servicios agendados
				System.out.println("Ingrese una cedula (sin puntos ni guiones. Ej: 12345678):");
				cedula = entrada.nextInt();
				while (cedula > 99999999 || cedula < 10000000) {
					System.out.println("Cedula errónea. Ingrese nuevamente: ");
					cedula = entrada.nextInt();
				}
				String scedula3 = cedula + "";
				String[] cedulas3 = scedula3.split("\\s+");
				boolean registro = false;

				try { // Busco una cedula en Historial.txt y los muestro
					FileReader fr = new FileReader(g);
					BufferedReader br = new BufferedReader(fr);
					String linea = br.readLine();
					while (linea != null) {
						for (String numero : cedulas3) {
							if (linea.contains(scedula3)) {
								System.out.println(linea);
								registro = true;
							}
						}
						linea = br.readLine();
					}
					br.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
				if (registro != true) {
					System.out.println("No hay registros");
				}
				break;

			case 5: // Cálculo de gastos de servicios agendados
				System.out.println("Ingrese una cedula (sin puntos ni guiones. Ej: 12345678):");
				cedula = entrada.nextInt();
				while (cedula > 99999999 || cedula < 10000000) {
					System.out.println("Cedula errónea. Ingrese nuevamente: ");
					cedula = entrada.nextInt();
				}

				String scedula4 = cedula + "";
				String[] cedulas4 = scedula4.split("\\s+");
				boolean registrado = false, subtotal = false, descuento = false;
				int cont = 0, total = 0;

				try { // Verifico que cliente esté en Clientes.txt
					FileReader fr = new FileReader(f);
					BufferedReader br = new BufferedReader(fr);
					String linea = br.readLine();
					while (linea != null && registrado != true) {
						for (String numero : cedulas4) {
							if (linea.equals(scedula4)) {
								registrado = true;
							} else {
								linea = br.readLine();
							}
						}
					}
					br.close();
				} catch (Exception e) {
					e.printStackTrace();
				}

				if (registrado != false) {
					System.out.println("Cliente registrado");
					System.out.println(" ");
					System.out.println("Servicios contratados: ");

					try { // Busco los servicios registrados en Historial.txt y guardo el Subtotal
						FileReader fr = new FileReader(g);
						BufferedReader br = new BufferedReader(fr);
						String linea = br.readLine();
						while (linea != null) {
							for (int i = 0; i < 8; i++) {
								for (String numero : cedulas4) {
									if (linea.contains(scedula4 + ":" + (i + 1))) {
										System.out.println(servicio[i]);
										total += precios[i];
										subtotal = true;
										if (i < 4) {
											cont++;
										}
									}
								}
							}
							linea = br.readLine();
						}
						br.close();
					} catch (Exception e) {
						e.printStackTrace();
					}

					if (subtotal = true) {
						System.out.println(" ");
						System.out.println("Subtotal: " + total);

						// Descuento del 13%
						if (cont >= 3) {
							total = total - ((total * 13) / 100);
							System.out.println("Aplica el descuento del 13%");
						}

						// Descuento del 10%
						if (cont > 0) {
							try {
								FileReader fr = new FileReader(g);
								BufferedReader br = new BufferedReader(fr);
								String linea = br.readLine();
								while (linea != null) {
									int i = 4;
									while (i < 8 && descuento != true) {
										for (String numero : cedulas4) {
											if (linea.contains(scedula4 + ":" + (i + 1))) {
												total = total - (total / 10);
												System.out.println("Aplica el descuento del 10%");
												descuento = true;
											}
										}
										i++;
									}
									linea = br.readLine();
								}
								br.close();
							} catch (Exception e) {
								e.printStackTrace();
							}

						}
						System.out.println("Costo total: " + total);
					} else {
						System.out.println("No hay registros con esta cedula");
					}

				} else {
					System.out.println("Cliente no registrado");
				}
				break;

			case 6: // Ver Historial
				try { // Muestro Historial.txt
					FileReader fr = new FileReader(g);
					BufferedReader br = new BufferedReader(fr);
					String linea = br.readLine();
					while (linea != null) {
						System.out.println(linea);
						linea = br.readLine();
					}
					br.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;

			case 7: // Salir
				salir = true;
				break;

			default:
				System.out.println("Opción erronea. Opción debe ser entre 1 y 7");
			}
		}

		System.out.println("Fin del programa");

	}

}