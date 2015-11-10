/**
*Define la clase IgualesDeTres que lea tres números de teclado y determine si la suma
*de cualquier pareja de ellos es igual al tercer número. Si se cumple esta condición,
*escribir "Iguales" y en caso contrario escribir "Distintos".
*
*@author Roberto Carlos Flores Gomez
*@version 1.0
*/
public class IgualesDeTres{
	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		int x, y, z;

		System.out.println("Dime 3 numeros.\nEl primero: ");
		x=scanner.nextInt();
		System.out.println("El segundo: ");
		y=scanner.nextInt();
		System.out.println("El tercero: ");
		z=scanner.nextInt();

		if (x+y==z || x+z==y || z+y==x)
			System.out.println("Iguales");
		else
			System.out.println("Distintos");

	}
}