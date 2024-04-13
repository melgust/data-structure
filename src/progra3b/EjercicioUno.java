package progra3b;

import java.util.Scanner;

public class EjercicioUno {

	public static void main(String[] args) {
		Lista lista = new Lista();
		System.out.println("Ingrese lista de numeros separados por coma: ");
		try (Scanner scanner = new Scanner(System.in)) {
			String strNumeros = scanner.nextLine();
			String[] arregloNumeros = strNumeros.split(",");
			for (String strNumero : arregloNumeros) {
				int numero = Integer.parseInt(strNumero.trim());
				lista.agregar(numero);
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		lista.mostrar();
	}

}
