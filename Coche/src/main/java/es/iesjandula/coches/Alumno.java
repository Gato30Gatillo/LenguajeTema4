package es.iesjandula.coches;

public class Alumno {

	private String nombre;
	private int edad;
	private double calificacion;
	private boolean AsignaturasPendientes;
	public Alumno(String nombre, int edad, double calificacion, boolean asignaturasPendientes) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.calificacion = calificacion;
		AsignaturasPendientes = asignaturasPendientes;
	}
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
	public double getCalificacion() {
		return calificacion;
	}
	public void setCalificacion(double calificacion) {
		this.calificacion = calificacion;
	}
	public boolean isAsignaturasPendientes() {
		return AsignaturasPendientes;
	}
	public void setAsignaturasPendientes(boolean asignaturasPendientes) {
		AsignaturasPendientes = asignaturasPendientes;
	}
}
