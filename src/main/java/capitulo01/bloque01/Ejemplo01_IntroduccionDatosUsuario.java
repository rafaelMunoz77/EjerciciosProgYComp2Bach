package capitulo01.bloque01;

import java.util.Scanner;

public class Ejemplo01_IntroduccionDatosUsuario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Por favor, introduzca un número: ");
		int num = sc.nextInt();
		System.out.println("El número introducido es: " + num);

		System.out.println("Por favor, introduzca un flotante: ");
		float flotante = sc.nextFloat();
		System.out.println("El flotante introducido es: " + flotante);
		
		System.out.println("Por favor, introduzca un String: ");
		String str = sc.next();
		System.out.println("El String introducido es: " + str);
	}

}
