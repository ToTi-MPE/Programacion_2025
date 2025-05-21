package sesion1;
import java.io.*;
public class Escribirfichero {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		try {
			FileWriter f1 = new FileWriter("Saludos.txt");
			f1.write("hola mundo");
			f1.close();
		} catch (IOException e) {
			System.out.println("Error");
		}
		
		try {
			FileReader fr = new FileReader("Saludos.txt");
			int c;
			while ((c=fr.read())!= -1) {
				System.out.print((char) c);
			}
			fr.close();
		} catch (IOException e) {
			System.out.println("Error");
		}
		
	}

}
