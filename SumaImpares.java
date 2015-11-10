/**
*Define la clase SumaImpares. Visualiza la suma de los números impares del 1 al 75,
*ambos inclusive.
*
*@author Roberto Carlos Flores Gomez
*@version 1.0
*/
public class SumaImpares{
	public static void main(String[] args) {
		int suma=0;
		for (int i=1; i<76; i+=2) {
			suma+=i;
		}
		System.out.println("La suma de los impares entre 1 y 75 es "+suma);
	}
}