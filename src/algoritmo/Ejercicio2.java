package algoritmo;

import java.util.Scanner;

/**
 * HANANE ARRAZOUKI
 */

public class Ejercicio2 {

	public static void main(String[] args) {

		try (Scanner leerPersonas = new Scanner(System.in)) {
			Persona[] personas = new Persona[50];

			for (int i = 0; i < 50; i++) {
				System.out.println("Persona " + (i + 1) + ":");
				System.out.print("Sexo M o F (Masculino/Femenino): ");
				char sexo = leerPersonas.nextLine().charAt(0);
				if (sexo != 'f' || sexo != 'm') {
					System.out.print("Por favor introduce M o F(Masculino/Femenino): ");
					sexo = leerPersonas.nextLine().charAt(0);
				}

				System.out.print("Edad: ");
				int edad = leerPersonas.nextInt();
				if (edad > 120 || edad <= 0) {
					System.out.print("Por favor introduce Edad válido: ");
					edad = leerPersonas.nextInt();
				}
				leerPersonas.nextLine();
				personas[i] = new Persona(sexo, edad);
			}

			int mayoresDeEdad = 0;
			int menoresDeEdad = 0;
			int masculinosMayoresDeEdad = 0;
			int femeninosMenoresDeEdad = 0;

			for (int i = 0; i < 50; i++) {
				Persona persona = personas[i];
				if (persona.edad >= 18) {
					mayoresDeEdad++;
					if (persona.sexo == 'M') {
						masculinosMayoresDeEdad++;
					}
				} else {
					menoresDeEdad++;
					if (persona.sexo == 'F') {
						femeninosMenoresDeEdad++;
					}
				}
			}

			double porcentajeMayoresDeEdad = (mayoresDeEdad / 50.0) * 100;
			double porcentajeMujeres = ((femeninosMenoresDeEdad + (50 - menoresDeEdad)) / 50.0) * 100;

			System.out.println("Cantidad de personas mayores de edad: " + mayoresDeEdad);
			System.out.println("Cantidad de personas menores de edad: " + menoresDeEdad);
			System.out.println("Cantidad de personas masculinas mayores de edad: " + masculinosMayoresDeEdad);
			System.out.println("Cantidad de personas femeninas menores de edad: " + femeninosMenoresDeEdad);
			System.out.println("Porcentaje de personas mayores de edad: " + porcentajeMayoresDeEdad + "%");
			System.out.println("Porcentaje de mujeres respecto al total de personas: " + porcentajeMujeres + "%");
		}
	}
}
