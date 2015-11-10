/**
*Define la clase SonIguales que lea dos valores numéricos, y determine si son iguales y,
*en caso de no serlo, indique cuál de ellos es el mayor.
*
*@author Roberto Carlos Flores Gomez
*@version 1.0
*/
public class SonIguales{
	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		int x, y;

		System.out.println("Dime dos numeros y te dire si son iguales.\nDime el primer numero: ");
		x=scanner.nextInt();
		System.out.println("Dime el segundo numero: ");
		y=scanner.nextInt();

		if(x==y)
			System.out.println("Ambos numeros son iguales!!!");
		else if(x>y)
			System.out.println(x+" es mayor que "+y);
		else
			System.out.println(y+" es mayor que "+x);
	}
}