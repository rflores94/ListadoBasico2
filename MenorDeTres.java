/**
*Define la clase MenorDeTres que lea tres números y calcule cuál de ellos es el menor. Suponemos que los tres números son distintos.
*
*@author Roberto Carlos Flores Gomez
*@version 1.0
*/
public class MenorDeTres{
	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		int x, y, z;

		System.out.println("Dime tres numeros y te digo cual es el menor.\nDime el primer numero: ");
		x=scanner.nextInt();
		System.out.println("Dime el segundo numero");
		y=scanner.nextInt();
		System.out.println("Dime el tercer numero");
		z=scanner.nextInt();

		if (x<=y && x<=z)
			System.out.println("El menos es "+x);
		else if (y<=x && y<=z)
			System.out.println("El menos es "+y);
		else if (z<=y && z<=x)
			System.out.println("El menos es "+z);
	}
}