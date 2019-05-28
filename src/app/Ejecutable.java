package app;

public class Ejecutable {

	public static void main(String[] args) {

		Persona prueba = new Persona();
		prueba.generarDNI();
		System.out.println(prueba.getDni());
	}

}
