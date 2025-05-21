package sesion802;
import java.io.*;
public class LeerLineas {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente

		
		
		
		try(BufferedReader br=new BufferedReader(new FileReader("lineas.txt"))){
			String linea;
			int contador=0;
			while((linea=br.readLine())!=null) {
				contador++;
				System.out.println(linea);
			}
			System.out.println("El archivo tiene "+contador+" lineas");
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
