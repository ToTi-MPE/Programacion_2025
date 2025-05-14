package ejercicio1;

import java.util.Scanner;

public class huesped {
	
	String nombre;
	int dni;
	int edad;
	boolean memvip;

	public huesped(String nombre, int dni, int edad, boolean memvip) {
		this.nombre = nombre;
		this.dni = dni;
		this.edad = edad;
		this.memvip = memvip;
	}
	
	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public boolean isMemvip() {
		return memvip;
	}

	public void setMemvip(boolean memvip) {
		this.memvip = memvip;
	}
	
	public void alquilar() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Dime que habitacion quieres alquilar:"
				+ "\n[estandar] - [suite] - [Lujo]");
		String opcion=scan.nextLine();
		switch (opcion) {
		case "estandar":
			System.out.println("Habitacion estandar alquilada");
			break;
		case "suite":
			if (memvip==true) {
				System.out.println("Habitacion suite alquilada");
			}else {
				System.out.println("Habitacion suite no alquilada");
			}
			break;
		case "Lujo":
			if (memvip==true) {
				System.out.println("Habitacion suite alquilada");
			}else {
				System.out.println("Habitacion suite no alquilada");
			}
			break;
		default:
			System.out.println("Opcion no valida");
			break;
		
		}
		
	}
	
}
