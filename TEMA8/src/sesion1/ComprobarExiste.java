package sesion1;
import java.io.*;
import java.util.*;
public class ComprobarExiste {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
//		File archivo = new File("Nombres.txt");
//		if (archivo.exists()) {
//			System.out.println("El archivo existe\n");
//			System.out.println("Ruta del Archivo:" + archivo.getAbsolutePath());
//			System.out.println("Ruta: " + archivo.getPath());
//			System.out.println("Escribible: " + archivo.canWrite());
//			System.out.println("Tamaño: " + archivo.length()+"Bytes");
//		}else {
//			System.out.println("El archivo no ha nacido");
//		}
		
		try {
			FileWriter f1 = new FileWriter("saludo.txt");
			f1.write("Hola");
			f1.close();
			
		} catch (Exception e) {
			System.out.println("Error");
		}
		
		try {
			
			FileWriter f1 = new FileWriter("saludo.txt",true); // añade info
			f1.write("Goodbye");
			f1.close();
			
		} catch (IOException e) {System.out.println("Error");}
		
		try {
			FileWriter f1 = new FileWriter("saludo.txt",false); // sobre escribe 
			f1.write("baby como tu ya no hay");
			f1.close();
		} catch (IOException e) {
			System.out.println("Error");
		}
		
//		Crear un archivo llamado tareas.txt 
//		escribe una lista de tareas sobreescribe lo anterior (si existe)
//		Añade nuevas tareas sin borrar las anteriores
//		lee y muestra las tareas
//		Comprueba si el archivo existe antes de escribir
		
		
	}

}
