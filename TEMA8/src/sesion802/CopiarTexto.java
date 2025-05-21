package sesion802;

import java.io.*;

public class CopiarTexto {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		try(
			BufferedReader br=new BufferedReader(new FileReader("lineas.txt"));
			PrintWriter pw=new PrintWriter("lineas2.txt");
			)
			{
			String linea;
			while((linea=br.readLine())!=null) {
				pw.println(linea);
			}
			
		 
		} catch (IOException e) {
			e.printStackTrace();
		}
			

	}

}
