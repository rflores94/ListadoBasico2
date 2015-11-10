/**
*Define la clase SumaPares que sume los números pares comprendidos entre 7 y 101.
*
*@author Roberto Carlos Flores Gomez
*@version 1.0
*/
public class SumaPares{
	public static void main(String[] args) {
		int suma=0;

		for (int i=8; i<101; i+=2) {
			suma+=i;
		}
		System.out.println("La suma es: "+suma);
	}
}