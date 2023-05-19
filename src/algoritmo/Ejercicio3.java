package algoritmo;

import java.util.Scanner;

/**
 * HANANE ARRAZOUKI
 */
public class Ejercicio3 {

	public static void main(String[] args) {

		try (Scanner horasTrabajadas = new Scanner(System.in)) {
			System.out.print("Ingrese las horas trabajadas: ");
			int horas = horasTrabajadas.nextInt();

			System.out.print("Ingrese la tarifa por hora: ");
			double tarifa = horasTrabajadas.nextDouble();

			calcularSueldo(horas, tarifa);
		}

	}

	private static void calcularSueldo(int horas, double tarifa) {
		double sueldo;

		if (horas > 40) {
			int horasNormales = 40;
			int horasExtras = horas - 40;
			double tarifaExtra = tarifa * 1.5;

			sueldo = (horasNormales * tarifa) + (horasExtras * tarifaExtra);
		} else {
			sueldo = horas * tarifa;
		}

		System.out.println("El sueldo del trabajador es: " + sueldo);
	}
}
