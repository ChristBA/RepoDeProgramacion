package paquete;

import java.io.File;

public class Principal {

	public static void main(String[] args) {
		File archivo = new File("archivo.txt");
		if (!archivo.exists()) {
			try {
				archivo.createNewFile();
			}catch(Exception e){
				e.printStackTrace();
			}
			System.out.println("Ahora existe");
		}else {
			System.out.println("Ya existia");
		}

	}

}
