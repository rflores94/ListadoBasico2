/**
*Define la clase SumaYProducto que obtenga la suma y el producto de los números del 1 al 100.
*
*@author Roberto Carlos Flores Gomez
*@version 1.0
*/
public class SumaYProducto{
	public static void main(String[] args) {
		int suma=0, i=1;
		double producto=1;

		while(i<=100){
			suma+=i;
			producto*=i;
			i++;
		}
		System.out.println("La suma es "+suma+
			"\nEl producto es "+producto);
	}
}