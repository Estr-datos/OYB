package co.edu.unbosque.controller;

import java.util.Arrays;

import co.edu.unbosque.model.Algoritmos;
import co.edu.unbosque.view.ConsoleView;

public class Controller {

	Algoritmos alg;
	Algoritmos alg2;

	ConsoleView CV;

	public Controller() {

		// initComponents
		CV = new ConsoleView();
		alg = new Algoritmos();

		// Búsqueda secuencial
		String[] ciudades = { "Bogota", "Roma", "Sevilla", "Estocolmo", "Moscu" };
		String targetCiudad = "Sevilla";
		// alg.busquedaSecuencial(ciudades, targetCiudad);

		String response = "";
		do {
			System.out.println("Bienvenido al software de algoritmos");
			System.out.println("A continuación, ingrese una opción");
			System.out.println("1. Algoritmo de ordenamiento (Seleccion)");
			System.out.println("2. Algoritmo de búsqueda secuencial");
			System.out.println("3. Algoritmo de búsqueda binaria");
			response = CV.readString("> ");

			switch (response) {
			case "1":
				// Algoritmo de ordenamiento
				int arraySize = CV.readInt("Ingrese el tamaño del array> ");
				// CV.washLine();
				int[] arr = new int[arraySize];
				int value = 0;
				for (int i = 0; i < arr.length; i++) {
					value = CV.readInt("Ingrese el valor para la posicion " + i + "> ");
					arr[i] = value;
				}
				System.out.println("Array a ordenar> " + Arrays.toString(arr));
				System.out.println("Array ordenado> " + Arrays.toString(alg.seleccion(arr)));
				System.out.println();
				break;
			case "2":
				// Algoritmo de búsqueda secuencial
				int arraySizeSec = CV.readInt("Ingrese el tamaño del array> ");
				CV.washLine();
				// CV.washLine();
				String[] SecArr = new String[arraySizeSec];
				String SecValue = "";
				for (int i = 0; i < SecArr.length; i++) {
					SecValue = CV.readString("Ingrese el valor para la posicion " + i + "> ");
					SecArr[i] = SecValue;
				}
				String target = CV.readString("Ingrese el elemento a buscar> ");
				System.out.println("Objetivo> " + target);
				alg.busquedaSecuencial(SecArr, target);
				break;
			case "3":
				// Algoritmo de búsqueda binaria
				break;
			}

		} while (!response.equals("3"));

	}

}
