package sesion802;
import java.io.*;
public class CopiarArchivo {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente

		try (
			FileInputStream in = new FileInputStream("Goku.jpg");
			FileOutputStream out = new FileOutputStream("Goku2.jpg");
			){
			
			byte[] buffer = new byte[1024];
			int bytesLeidos;
			
			while ((bytesLeidos = in.read(buffer)) != -1) {
				out.write(buffer, 0, bytesLeidos); // de que, en cual empieza, cuantos bytes
			}
			
			
		} catch (IOException e) {
			System.out.println("Error");
			e.printStackTrace(); // muestara el error
		}
		
		
	}

}
