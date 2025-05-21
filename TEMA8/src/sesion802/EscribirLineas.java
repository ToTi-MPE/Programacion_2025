package sesion802;
import java.io.*;
public class EscribirLineas {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		try(PrintWriter pw1=new PrintWriter("lineas.txt")){
			pw1.println("Linea 1");
			pw1.println("Linea 2");
			pw1.println("Linea 3");
			pw1.println("Linea 4");
		}catch(IOException e){
			System.out.println("Error");
		}

	}

}
