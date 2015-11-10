/**
*Define la clase EsPositivo que pide un entero por teclado e indica si es positivo.
*
*@author Roberto Carlos Flores Gomez
*@version 1.0
*/
public class EsPositivo{
	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		int x;

		System.out.println("Dime un entero, yo te digo si es positivo o negativo: ");
		x = scanner.nextInt();

		if(x>=0)
			System.out.println(x+" es un numero positivo");
		else
			System.out.println(x+" es un numero negativo");
	}
}