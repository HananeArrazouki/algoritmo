package algoritmo;

import java.util.Scanner;

/**
 * HANANE ARRAZOUKI
 */

public class Ejercicio1 {

	public static void main(String[] args) {

		try (var leerNumero = new Scanner(System.in)) {
			System.out.print("Ingrese un número entero: ");
			int numero = leerNumero.nextInt();
			leerNumero(numero);
		}
	}

	private static void leerNumero(int numero) {
		if (numero % 2 == 0) {
			System.out.println("El número es par.");
			for (int i = numero; i >= 0; i -= 2) {
				System.out.println(i);
			}
		} else {
			System.out.println("El número es impar.");
			for (int i = numero; i >= 1; i -= 2) {
				System.out.println(i);
			}
		}
	}

}
