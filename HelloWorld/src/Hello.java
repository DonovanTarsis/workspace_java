import java.util.Scanner;

public class Hello {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("hello world!!!!");

		int valor = teclado.nextInt();
		System.out.println("Voce digitou " + valor);
		teclado.close();
	}
}
