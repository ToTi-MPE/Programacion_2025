package sesion803;
import java.io.*;
import java.io.ObjectInputStream;
import java.util.*;
public class EmpleadoGuardar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Empleado e1 = new Empleado ("juanmi", 1500);
		
		ArrayList<Empleado> empleados = new ArrayList<>();
		empleados.add(new Empleado("Ale", 2000));
		empleados.add(new Empleado("ToTi", 1500));
		empleados.add(new Empleado("Juanmi", 1400));
		
		
		try {
			FileOutputStream datos = new FileOutputStream("DatosEmpleado.dat");
			ObjectOutputStream salida = new ObjectOutputStream(datos);
			
			salida.writeObject(empleados);
			salida.close();
			
			System.out.println("Guardado con exito");
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
