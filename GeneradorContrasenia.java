package generadorContrasenia;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GeneradorContrasenia {

	public static void main(String[] args) {

		Scanner Teclado = new Scanner(System.in);
		int contrasenia, contraseniaLongMax, contraseniaLongMin, ubicacionElementoLetras, contadorCiclosWhile = 0;

		String[] letras = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R",
				"S", "T", "U", "V", "W", "X", "Y", "Z", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m",
				"n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "!", "?", "#", "$", "&", "/", "(", ")",
				"=", "@", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

		System.out.println("Ingrese la longitud mínima de caracteres para su contraseña: ");
		contraseniaLongMin = Teclado.nextInt();
		System.out.println("Ingrese la longitud máxima de caracteres para su contraseña: ");
		contraseniaLongMax = Teclado.nextInt();

		do {
			contrasenia = (int)(Math.random()*contraseniaLongMax);
		} while (contrasenia < contraseniaLongMin);

		System.out.println("\nLa contraseña es:");
		do {
			contadorCiclosWhile++;
			ubicacionElementoLetras = (int)(Math.random()*letras.length);
			System.out.print(letras[ubicacionElementoLetras]);
		} while (contrasenia > contadorCiclosWhile);

		System.out.println("\n");
//		System.out.println(contadorCiclosWhile);
		Teclado.close();
	}
}