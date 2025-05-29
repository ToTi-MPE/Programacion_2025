package sesion804;
import java.io.*;
import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ComprobarExistencia {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente

		/*
		File archivo=new File("nombres.txt");
		
		if (archivo.exists()) {
			System.out.println("El archivo existe\n");
		}else {
			System.out.println("El archivo no ha nacido");
		}
		*/
		
		Path ruta=Paths.get("nombres.txt");
		
		if (Files.exists(ruta)) {
			System.out.println("El archivo existe\n");
		}else {
			System.out.println("El archivo no ha nacido");
		}
		
		
	}

}
