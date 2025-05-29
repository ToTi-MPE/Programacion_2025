package sesion804;
import java.io.*;
import java.nio.*;
import java.nio.file.*;
import java.util.*;
public class LeerArchivo {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		Path ruta=Paths.get("TEMA8.pdf");
		try {
			List<String> leerlineas = Files.readAllLines(ruta);
			for (String l : leerlineas) {
				System.out.println(l);
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
