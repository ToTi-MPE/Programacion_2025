package sesion803;

import java.io.*;
import java.util.*;

public class VehiculoGuardar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Vehiculo>vehiculos= new ArrayList<>();
		
		vehiculos.add(new Coche("fiat","uno",4));
		vehiculos.add(new Coche("Ferrari","rojo",2));
		vehiculos.add(new Moto("honda","CBR",300));
		vehiculos.add(new Moto("Yamaha","R1",250));
		
		try {
			FileOutputStream datos = new FileOutputStream("VehiculosGuardados.dat");
			ObjectOutputStream salida = new ObjectOutputStream(datos);
			
			salida.writeObject(vehiculos);
			salida.close();
			
			System.out.println("Guardado con exito");
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			FileInputStream datos = new FileInputStream("VehiculosGuardados.dat");
			ObjectInputStream entrada= new ObjectInputStream(datos);
			
			ArrayList<Vehiculo>vehiculos1 = (ArrayList<Vehiculo>) entrada.readObject();
			entrada.close();
			for (Vehiculo v:vehiculos1) {
				System.out.println(v.Descripcion());	
			}
		
		}catch(IOException | ClassNotFoundException e){
		e.printStackTrace();
		}
		
	}

}
