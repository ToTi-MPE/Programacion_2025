package sesion803;
import java.io.Serializable;
public class Empleado implements Serializable{

	String nombre;
	double salario;
												
	public Empleado(String nombre, double salario) {
		this.nombre = nombre;
		this.salario = salario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public String toString() {
		return "nombre= "+ nombre + "||  Salario = "+salario;
	}
	
}
