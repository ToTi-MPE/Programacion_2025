package sesion801;

import java.util.*;
import java.io.*;

public class Ej_tareas {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente

//		Crear un archivo llamado tareas.txt 
//		escribe una lista de tareas sobreescribe lo anterior (si existe)
//		Añade nuevas tareas sin borrar las anteriores
//		lee y muestra las tareas
//		Comprueba si el archivo existe antes de escribir
		Scanner scan = new Scanner(System.in);

		File archivo = new File("tareas.txt");

		if (archivo.exists()) {
			System.out.println("El archivo existe\n");
		} else {
			System.out.println("El archivo no ha nacido");
		}

		try {
			FileWriter f1 = new FileWriter("tareas.txt",false);
			f1.write("Tarea: Comprar pan\n");
			f1.write("Tarea: Comprar leche\n");
			f1.write("Tarea: hacer ejercicio\n");
			f1.close();
		} catch (IOException e) {
			System.out.println("Error");
		}

		try {
			FileReader fr = new FileReader("tareas.txt");
			int c;
			while ((c = fr.read()) != -1) {
				System.out.print((char) c);
			}
			fr.close();
		} catch (IOException e) {
			System.out.println("Error");
		}

		try {
			FileWriter f1 = new FileWriter("tareas.txt", true);
			System.out.println("Dime la tarea que quieres añadir:");
			String tarea = scan.nextLine();
			f1.write("Tarea: " + tarea + "\n");
			f1.close();
		} catch (IOException e) {
			System.out.println("Error");
		}

		try {
			FileReader fr = new FileReader("tareas.txt");
			int c;
			while ((c = fr.read()) != -1) {
				System.out.print((char) c);
			}
			fr.close();
		} catch (IOException e) {
			System.out.println("Error");
		}
		scan.close();

	}

}
