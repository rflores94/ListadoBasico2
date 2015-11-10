/**
*Define la clase SumaMientrasNoSeaNegativo que sume todos aquellos números leídos mientras no sean negativos.
*
*@author Roberto Carlos Flores Gomez
*@version 1.0
*/
public class SumaMientrasNoSeaNegativo{
	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		int x,suma=0;

		System.out.println("Dime los numeros que quieres sumar. Introduce un numero negativo para mostrar la suma: ");
		x=scanner.nextInt();
		while(x>=0){
			suma+=x;
			System.out.println("Otro numero: ");
			x=scanner.nextInt();
		}
		System.out.println("La suma es "+suma);
	}
}