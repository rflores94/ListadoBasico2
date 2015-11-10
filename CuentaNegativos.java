/**
*Define la clase CuentaNegativos. Lee 10 enteros y visualiza cuántos son negativos.
*
*@author Roberto Carlos Flores Gomez
*@version 1.0
*/
public class CuentaNegativos{
	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		int n, negativos=0;

		for (int i=0; i<10; i++) {
			System.out.println("Dime un numero entero: ");
			n=scanner.nextInt();
			if(n<0)
				negativos++;
		}

		System.out.println("Has introducido "+negativos+" numeros negativos");
	}
}