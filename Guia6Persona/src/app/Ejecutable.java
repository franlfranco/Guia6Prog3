package app;

import java.util.Scanner;

public class Ejecutable {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Ingrese su nombre: ");
		String nombre = scan.nextLine();
		
		System.out.print("\nIngrese su edad: ");
		int edad = scan.nextInt();
		
		System.out.print("\nIngrese su sexo: ");
		char sexo = scan.next().charAt(0);
		
		double peso = 0;
		try {
			System.out.print("\nIngrese su peso: ");
			peso = scan.nextDouble();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			System.out.println("Peso erróneo");
		}
		// HACER EXCEPCION PARA EL ERROR ESPECIFICO
		
		double altura = 0;
		try {
			System.out.print("\nIngrese su altura: ");
			altura = scan.nextDouble();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Mete bien los numberos NENEEEEE");
		}
		// HACER EXCEPCION PARA EL ERROR ESPECIFICO

		Persona persona1 = new Persona(nombre, edad, sexo, peso, altura);
		Persona persona2 = new Persona(nombre, edad, sexo);
		Persona persona3 = new Persona();
		
		mensajePeso(persona1.calcularIMC(), persona1.getNombre());
		mensajePeso(persona2.calcularIMC(), persona2.getNombre());
		mensajePeso(persona3.calcularIMC(), persona3.getNombre());
		
		mensajeMayorDeEdad(persona1.esMayorDeEdad(), persona1.getNombre());
		mensajeMayorDeEdad(persona2.esMayorDeEdad(), persona2.getNombre());
		mensajeMayorDeEdad(persona3.esMayorDeEdad(), persona3.getNombre());
		
		System.out.println();
		System.out.println(persona1.toString());
		System.out.println(persona2.toString());
		System.out.println(persona3.toString());
	
		scan.close();
	}

	public static void mensajePeso(int peso, String nombre) {
		if(peso < 0) {
			System.out.printf("\n%s está por debajo del peso recomendado", nombre);
		} else if (peso > 0) {
			System.out.printf("\n%s está por encima del peso recomendado", nombre);
		} else {
			System.out.printf("\n%s está dentro del peso recomendado", nombre);
		}
	}
	
	public static void mensajeMayorDeEdad(boolean esMayor, String nombre) {
		if(esMayor) {
			System.out.printf("\n%s es mayor de edad", nombre);
		} else {
			System.out.printf("\n%s es menor de edad", nombre);
		}
	}
}
