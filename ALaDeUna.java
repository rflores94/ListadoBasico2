/**
*Entrega un programa ALaDeUna que muestre:
*A la de 1... 
*A la de 2... 
*A la de 3....
*Utilizando el bucle while, el do..while y el for
*
*@author Roberto Carlos Flores Gomez
*@version 1.0
*/
public class ALaDeUna{
	public static void main(String[] args) {
		int i=1;

		System.out.println("\tCon While");
		while (i<4)
			System.out.print("A la de "+ i++ +"... ");

		i=1;
		System.out.println("\n\tCon Do... while");
		do{
			System.out.print("A la de "+ i++ +"... ");
		}while (i<4);

		System.out.println("\n\tCon For");
		for (i=1;i<4 ;i++ ) {
			System.out.print("A la de "+ i +"... ");
		}
	}
}