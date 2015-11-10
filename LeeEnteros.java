/**
*Define la clase LeeEnteros. Lee 10 enteros e indica al final si se ha introducido algún cero.
*
*@author Roberto Carlos Flores Gomez
*@version 1.0
*/
public class LeeEnteros{
	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		int n, ceros=0;

		for (int i=0; i<10; i++) {
			System.out.println("Dime un numero entero: ");
			n=scanner.nextInt();
			if(n==0)
				ceros++;
		}

		System.out.println("Has introducido "+ceros+" ceros");
	}
}