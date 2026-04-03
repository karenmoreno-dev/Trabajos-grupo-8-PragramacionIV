package ejercicio1;

import java.time.LocalDate;

public class Empleado extends Persona{
	
	private int legajo;
	private String puesto;
	private static int cont = 0;
	
	//--metodo que pertenece a la clase -------
	public static int devuelveProximoLegajo() {
		return cont+1; 
	}
	
	
	
	//Constructor vacio llamando al constructor de "Persona"
	public Empleado () {
		super();
		cont++;
		this.legajo = cont;
		this.puesto = "Sin puesto" ;
	}
	
	
	public Empleado (String dni, String nombre, String apellido, LocalDate fechaNacimiento, 
			Genero genero, String direccion, String telefono, String email, String puesto) {
		
		super(dni, nombre, apellido, fechaNacimiento, genero, direccion, telefono, email);
	    this.legajo = cont++;
	    this.puesto = puesto;
	}

	public int getLegajo() {
		return legajo;
	}
	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}
	public String getPuesto() {
		return puesto;
	}
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}


	@Override
	public String toString() {
		return "Empleado con LEGAJO= " + legajo +
                          ", PUESTO= " + puesto ;
	}

}
