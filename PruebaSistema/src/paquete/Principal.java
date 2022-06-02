package paquete;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Principal {
	public static void main(String []args) {
		Runtime r = Runtime.getRuntime();
		Process p;
		try {
			p = r.exec("bash /home/ceibal/pepe.sh");
			p.waitFor();
			BufferedReader b = new BufferedReader(new InputStreamReader(p.getInputStream()));
			String line = "";

			while ((line = b.readLine()) != null) {
			  System.out.println(line);
			}

			b.close();
		} catch (Exception e) {
			// TODO Bloque catch generado automáticamente
			e.printStackTrace();
		}
		

	}
}
