package sesion803;
import java.io.*;
import java.util.*;
public class EmpleadoLeer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			FileInputStream datos = new FileInputStream("DatosEmpleado.dat");
			ObjectInputStream entrada= new ObjectInputStream(datos);
			

			ArrayList<Empleado>empleados = (ArrayList<Empleado>) entrada.readObject();
			
//			Empleado e1Leido=(Empleado) entrada.readObject();
//			
//			entrada.close();
//			
//			System.out.println(e1Leido);
//			
			entrada.close();
			for(Empleado e:empleados) {
				System.out.println(e);
			}
			
		} catch (IOException  | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
