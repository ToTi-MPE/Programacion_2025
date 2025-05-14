package ejercicio2;
import java.util.*;

import ejercicio2.coche.LicenciaN;
import ejercicio2.coche.Tcoche;
public class cliente {
	
	enum Licencia{
		a,
		b,
		c
	}
	
	String nombre;
	int edad;
	Licencia licencia;
	// enum a string
	
	
	
	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public int getEdad() {
		return edad;
	}



	public void setEdad(int edad) {
		this.edad = edad;
	}



	public Licencia getLicencia() {
		return licencia;
	}



	public void setLicencia(Licencia licencia) {
		this.licencia = licencia;
	}



	public cliente(String nombre, int edad, Licencia licencia) {
		this.nombre = nombre;
		this.edad = edad;
		this.licencia = licencia;
	}
	
	public void prueba(coche coche) {
		
		if (coche.tipo.equals(Tcoche.deportivo)) {
			if (coche.modelo.equals("Porsche 911")) {
				if ((this.getLicencia().equals(Licencia.b)) ) {
					System.out.println("Puedes probar este coche.");
					ruido(coche);
				} else {
					System.out.println("No puedes probar este coche.");
					System.out.println("cuentas con una licencia "+this.getLicencia() +" y necesitas una tipo " + coche.getLicenciac());
				}
			} else { 
				if (coche.getLicenciac().equals(this.getLicencia())) {
					System.out.println("Puedes probar este coche.");
					ruido(coche);
				} else {
					System.out.println("No puedes probar este coche.");
					System.out.println("cuentas con una licencia "+this.getLicencia() +" y necesitas una "+ coche.getLicenciac());
				}
			}
		} else if (coche.tipo.equals(Tcoche.todoterreno)) {
			if (this.getLicencia().equals(Licencia.c)) {
				System.out.println("Puedes probar este coche.");
			} else {
				System.out.println("No puedes probar este coche.");
				System.out.println("cuentas con una licencia "+this.getLicencia() +" y necesitas una tipo " + coche.getLicenciac());
			}
		} else if (coche.tipo.equals(Tcoche.familiar)) {
			if (coche.getLicenciac().equals(this.getLicencia())) {
				System.out.println("Puedes probar este coche.");
			} else {
				System.out.println("No puedes probar este coche.");
				System.out.println("cuentas con una licencia "+this.getLicencia() +" y necesitas una "+ coche.getLicenciac());
			}
		}
		
	}

	public void ruido(coche coche) {
		if (coche.tipo==Tcoche.deportivo) {
			System.out.println("Ruido de motor deportivo...");
		}
	}
	
	// metodo para imprimir atributos
	public void infopersona() {
		System.out.println("------------------------------");
		System.out.println("Nombre: "+nombre);
		System.out.println("Edad: "+edad);
		System.out.println("Licencia: "+licencia);
		System.out.println("------------------------------");
	}

	
	
	
}
