/**
*Semejante al anterior, entrega un programa que muestre:
*A la de 3... 
*A la de 2... 
*A la de 1....
*Utilizando el bucle while, el do..while y el for
*
*@author Roberto Carlos Flores Gomez
*@version 1.0
*/
public class ALaDeTres{
	public static void main(String[] args) {
		int i=3;

		System.out.println("\tCon While");
		while (i>0)
			System.out.print("A la de "+ i-- +"... ");

		i=3;
		System.out.println("\n\tCon Do... while");
		do{
			System.out.print("A la de "+ i-- +"... ");
		}while (i>0);

		System.out.println("\n\tCon For");
		for (i=3;i>0 ;i-- ) {
			System.out.print("A la de "+ i +"... ");
		}
	}
}