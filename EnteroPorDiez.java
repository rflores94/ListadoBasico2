/**
*Define la clase EnteroPorDiez que pide un entero por teclado y lo multiplica por 10
*
*@author Roberto Carlos Flores Gomez
*@version 1.0
*/
public class EnteroPorDiez{
	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		int x;

		System.out.println("Dime un entero y te lo devuelvo multiplicado por 10:");
		x = scanner.nextInt();
		System.out.println(x+" por 10 es: "+x*10);
	}
}