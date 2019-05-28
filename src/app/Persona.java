package app;

import java.lang.Math;

public class Persona {

	// Attributes
	private String nombre;
	private int edad;
	private int dni;
	private char sexo;
	private double peso;
	private double altura;
	
	// Constructores
	public Persona() {
		super();
		setNombre("");
		setEdad(0);
		setSexo('M');
		setPeso(0);
		setAltura(0);
	}
	
	public Persona(String nombre, char sexo) {
		super();
		setNombre(nombre);
		setEdad(0);
		setSexo(sexo);
		setPeso(0);
		setAltura(0);
	}
	
	public Persona(String nombre, int edad, int dni, char sexo, double peso, double altura) {
		super();
		setNombre(nombre);
		setEdad(edad);
		this.dni = dni;
		setSexo(sexo);
		setPeso(peso);
		setAltura(altura);
	}

	// Métodos
	public int calcularIMC() {
		double imc = peso/Math.pow(altura, 2);
		if(imc < 20) {
			return -1;
		} else if(imc > 25) {
			return 1;
		} else {
			return 0;
		}
	}
	
	public boolean esMayorDeEdad() {
		return edad >= 18;
	}
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", dni=" + dni + ", sexo=" + sexo + ", peso=" + peso
				+ ", altura=" + altura + "]";
	}
	
	public void generarDNI() {
		int dni = 0;
		for(int i = 0; i < 8; i++) {
			dni += (int) Math.floor(Math.random() * 10);
			dni *= 10;
		}
		this.dni = dni / 10;
	}
	
	// Getters & Setters
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

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public int getDni() {
		return dni;
	}
	
	
	
}
