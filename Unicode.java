/**
*Muestra la tabla de caracteres Unicode. Utiliza el carácter tabulador.
*
* @author Roberto Carlos Flores Gomez
* @version 1.0
*/
public class Unicode {
	public static void main (String[] args) {
		
		for (char i=0; i<256; i++) {
			System.out.print(i + "\t" );
		}
	}
}	