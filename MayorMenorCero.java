/**
*Define la clase MayorMenorCero que permita saber si un número leído por teclado es mayor, menor o igual a cero,
*mostrando en pantalla las diferentes salidas.
*Ha de mostrar 10 resultados.
*
*@author Roberto Carlos Flores Gomez
*@version 1.0
*/
public class MayorMenorCero{
	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		int x;

		for (int i=0; i<10; i++) {
			System.out.println("Dime un numero y te digo si es mayor, menor o igual a cero");
			x=scanner.nextInt();

			if(x>0)
				System.out.println(x+" es mayor que cero");
			else if(x<0)
				System.out.println(x+" es menor que cero");
			else
				System.out.println("Es cero");
		}
	}
}