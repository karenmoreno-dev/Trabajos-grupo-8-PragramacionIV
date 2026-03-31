package ejercicio1;

public class Empleado extends Persona{
	
	private int legajo;
	private String puesto;
	private static int cont = 0;
	
	
	public Empleado () {
		
		cont++;
		this.legajo = cont;
		this.puesto = "Sin puesto" ;
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
