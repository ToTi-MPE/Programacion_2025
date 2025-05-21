package sesion802;
import java.io.*;
import java.util.*;
public class CrearAgenda {

	public static void main(String[] args) {
		
		// TODO Esbozo de método generado automáticamente
		
		Scanner scan = new Scanner(System.in);
		File archivo = new File("agenda.txt");
		
		try(FileWriter f1 = new FileWriter("agenda.txt",true)) 
		{
			
			String continuar="s";
			while(continuar.equals("s")) {
				System.out.println("Dime tu nombre: ");
				String nombre = scan.next();
				System.out.println("Dime tu apellido: ");
				String apellido = scan.next();
				System.out.println("Dime tu telefono: ");
				String telefono = scan.next();
				
				
				f1.write("\nNombre: " + nombre);
				f1.write("\nApellido: " + apellido);
				f1.write("\nTelefono: " + telefono);
				f1.write("\n-------------------------------");
				
				System.out.println("Quieres continuar? s/n");
				continuar = scan.next();
			}
		} catch (IOException e) {
			System.out.println("Error");
		}
		
		try (BufferedReader br=new BufferedReader(new FileReader("agenda.txt"))){
			String linea;
			while((linea=br.readLine())!=null) {
				System.out.println(linea);
			}
		} catch (IOException e) {
			System.out.println("Error");
		}
		
		scan.close();
				
		
	}

}
