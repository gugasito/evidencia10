package caso2;
import java.util.ArrayList;

public class Empresa {
	private String nombre;
	private ArrayList<Departamento> departamentos = new ArrayList<Departamento>();

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void agregarEmpleado(Empleado empleado, Grupo grupo){
		grupo.getEmpleados().add(empleado);
	}
	public void borrarEmpleado(Empleado empleado,Grupo grupo){
		grupo.getEmpleados().remove(empleado);
	}
	public void editarEmpleado(Empleado empleado, Casa casa, Vehiculo vehiculo){
		empleado.setUnnamed_Casa_(casa);
		empleado.setUnnamed_Vehiculo_(vehiculo);
	}
}