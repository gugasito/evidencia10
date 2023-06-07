package caso1;
import java.util.Vector;

public class Persona {
	private String nombre;
	private int edad;
	private Vector<Mascota> mascotas = new Vector<Mascota>();

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return this.edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
}