package es.iesjandula.coches;

public class App {

	public static void main(String[] args) {
	
	Motor m1 = new Motor(100,"fas");
	Coche c1 = new Coche("dqw","dwqdwq",m1,200);
	
	m1.getTipo();
	c1.getMotor();
	
	}
}
