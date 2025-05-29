package ProyectoIndividualGAFG;

import java.util.*;
import java.io.*;

public class CrearMisiones {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		Scanner scan = new Scanner(System.in);
		ArrayList<Mision> misiones = new ArrayList<>();

		// Crear misiones y añadirlas al arraylist

		while (true) {
			System.out.println("------- MISIONES  -------");
			System.out.println("1. Crear mision");
			System.out.println("2. Guardar misiones en fichero de texto");
			System.out.println("3. Ver misiones del fichero de texto");
			System.out.println("4. Guardar misiones en formato binario");
			System.out.println("5. Ver misiones del fichero binario");
			System.out.println("6. Crear Informe de misiones");
			System.out.println("7. Leer Informe de misiones");
			System.out.println("8. Salir");
			System.out.print("Elige una opcion: ");
			int opcion = scan.nextInt();
			scan.nextLine();
			switch (opcion) {
			case 1:
				System.out.println("Dime el nombre de tu mision: ");
				String nombre = scan.next();
				System.out.println("Tu mision tiene tripulacion? true/false: ");
				Boolean tripulacion = scan.nextBoolean();
				System.out.println("Dime la duracion de tu mision en meses: ");
				int duracion = scan.nextInt();
				System.out.println("Dime el destino de tu mision: ");
				String destino = scan.next();
				misiones.add(new Mision(nombre, tripulacion, duracion, destino));
				break;
			case 2: 
				try {
					FileWriter f1 = new FileWriter("misiones.txt", true);
					for (int i = 0; i < misiones.size(); i++) {
						f1.write(misiones.get(i).nombre+ ";");
						f1.write(misiones.get(i).tripulacion + ";");
						f1.write(misiones.get(i).DuracionEnMeses + ";");
						f1.write(misiones.get(i).destino);
						f1.write("\n");
					}
					f1.close();
				} catch (IOException e) {
					System.out.println("Error");
				}
				break;
			case 3:
				try {
					FileReader fr = new FileReader("misiones.txt");
					int c;
					while ((c = fr.read()) != -1) {
						System.out.print((char) c);
					}
					fr.close();
				} catch (IOException e) {
					System.out.println("Error");
				}
				break;
			case 4:
			}

		}
	}

}
