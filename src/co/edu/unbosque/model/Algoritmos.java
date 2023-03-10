package co.edu.unbosque.model;

public class Algoritmos {
	
	int[] arr;
	
	public Algoritmos(int[] arr) {
		super();
		this.arr = arr;
	}

	//Seleccion
	
	public static void seleccion(int[] arr) {
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
	    }
	}
	
	//Ordenamiento Secuencial
	
	public static void ordenamientoSecuencial(int[] arr) {
	    int n = arr.length;

	    // Recorre todos los elementos de la matriz
	    for (int i = 0; i < n - 1; i++) {
	        int minIndex = i;

	        // Compara cada elemento con los demás elementos de la matriz
	        for (int j = i + 1; j < n; j++) {
	            if (arr[j] < arr[minIndex]) {
	                minIndex = j;
	            }
	        }

	        // Intercambia el elemento actual con el más pequeño encontrado
	        int temp = arr[minIndex];
	        arr[minIndex] = arr[i];
	        arr[i] = temp;
	    }
	}
}