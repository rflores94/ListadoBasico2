/**
*Define la clase EsPositivoNegativoCero que pide un entero por teclado e indica si es
*positivo, negativo o cero.
*
*@author Roberto Carlos Flores Gomez
*@version 1.0
*/
public class EsPositivoNegativoCero{
	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		int x;

		System.out.println("Dime un entero, yo te digo si es positivo, negativo o 0: ");
		x = scanner.nextInt();

		if(x>0)
			System.out.println(x+" es un numero positivo");
		else if(x<0)
			System.out.println(x+" es un numero negativo");
		else
			System.out.println("Has introducido un "+x);
	}
}