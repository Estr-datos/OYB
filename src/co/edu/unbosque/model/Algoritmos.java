package co.edu.unbosque.model;

import java.util.Arrays;

public class Algoritmos {

	// private int[] arr;

	public Algoritmos() {
		// super();
		// this.arr = arr;
	}

	// Seleccion

	public int[] seleccion(int[] arr) {

		displayInitialArr(arr);
		int run = 0;
		int n = arr.length;

		for (int i = 0; i < n - 1; i++) {
			int minIndex = i;

			// Busca el elemento más pequeño en el resto de la matriz
			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}

			// Intercambia el elemento más pequeño con el actual elemento en la posición i
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
			run++;
			displayProcess(arr, run);
		}
		return arr;
	}

	public void busquedaSecuencial(String[] arr, String target) {
		System.out.println("Vector>" + Arrays.toString(arr));
		boolean found = false;
		int targetPos = 0;
		int run = 0;

		while (run < arr.length && !found) {
			if (arr[run].compareTo(target) == 0) {
				// Found
				found = true;
				targetPos = run;
			}
			run++;
		}

		if (found) {
			System.out.println("El elemento \"" + arr[targetPos] + "\" fue encontrado en la posición " + targetPos
					+ " del vector");
		} else {
			System.out.println("El elemento " + target + " no fue encontrado");
		}
	}

	public void displayProcess(int[] arr, int run) {
		System.out.print("Iteracion " + run + ">");
		for (int i : arr) {
			System.out.print("[" + i + "] ");
		}
		System.out.println();
	}

	public void displayInitialArr(int[] arr) {
		System.out.print("Array inicial> ");
		for (int i : arr) {
			System.out.print("[" + i + "] ");
		}
		System.out.println();
	}
	
	public int busquedaBinaria(int arr[], int n) {
		int center, first = 0, last = arr.length-1, centerValue;
		while(first <= last) {
			center = (first + last)/2;
			centerValue = arr[center];
			if(n == centerValue) {
				return center;
			}
			else if(n < centerValue) {
				last = center-1;
			}else {
				first = center+1; 
			}
		}
		return -1;
	}

}

/*
 * // Ordenamiento Secuencial
 * 
 * public void ordenamientoSecuencial(int[] arr) { int n = arr.length;
 * 
 * // Recorre todos los elementos de la matriz for (int i = 0; i < n - 1; i++) {
 * int minIndex = i;
 * 
 * // Compara cada elemento con los demás elementos de la matriz for (int j = i
 * + 1; j < n; j++) { if (arr[j] < arr[minIndex]) { minIndex = j; } }
 * 
 * // Intercambia el elemento actual con el más pequeño encontrado int temp =
 * arr[minIndex]; arr[minIndex] = arr[i]; arr[i] = temp; } }
 * 
 */