package co.edu.unbosque.view;

import java.util.Scanner;

public class ConsoleView {
	private Scanner sc;

	public ConsoleView() {
		sc = new Scanner(System.in);
	}

	public String readString(String message) {
		System.out.print(message);
		return sc.nextLine();
	}

	public int readInt(String message) {
		System.out.print(message);
		return sc.nextInt();
	}

	public void washLine() {
		sc.nextLine();
	}
}
