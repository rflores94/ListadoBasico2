/**
*Las direcciones MAC son números de 6 bytes que identifican a las tarjetas de red.
*Cuando contienen el valor máximo (FFFFFFFFFFFF) se considera que el mensaje quiere
*enviarse no a una tarjeta de red, sino a todas las de la red. A esa dirección especial
*se le denomina dirección broadcast. Crea la clase AlmacenaMac que almacene y muestre
*la dirección de broadcast.
*
* @author: Roberto Carlos Flores Gomez
* @version: 1.7
*/
public class AlmacenaMac {
	public static void main(String[] args) {
		long mac=0xFFFFFFFFFFFFl;
		
		System.out.println("La direccion broadcast es "+ mac);
	}
}