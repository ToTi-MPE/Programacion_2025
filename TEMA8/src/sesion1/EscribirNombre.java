package sesion1;

import java.io.*;
import java.util.*;

public class EscribirNombre {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente

		Scanner scan = new Scanner(System.in);

		try {
			FileWriter f1 = new FileWriter("Nombres.txt");
			for (int i = 0; i < 3; i++) {
				System.out.println("Dime tu nombre: ");
				String nombre = scan.next();
				f1.write("- " + nombre + "\n");
			}
			f1.close();
		} catch (IOException e) {
			System.out.println("Error");
		}
		scan.close();

		try {
			FileReader fr = new FileReader("Nombres.txt");
			int c;
			int contador=1;
			while ((c = fr.read()) != -1) {
				if (c == '\n') {
					System.out.println(contador + " - " + (char) c);
					contador++;
				}
			}
			fr.close();
		} catch (IOException e) {
			System.out.println("Error");
		}
	}

}
