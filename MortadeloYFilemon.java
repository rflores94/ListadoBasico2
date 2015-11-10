/**
*Define la clase MortadeloYFilemon que muestre 5 veces el mensaje "Mortadelo y Filemón".
*Realízalo usando el decremento y los tres bucles for, while y do..while.
*
*@author Roberto Carlos Flores Gomez
*@version 1.0
*/
public class MortadeloYFilemon{
	public static void main(String[] args) {
		int i=5;

		System.out.println("\tCon for");
		for (int j=5; j>0; j--) {
			System.out.println("Mortadelo Y Filemon");
		}

		System.out.println("\n\tCon While");
		while(i>0){
			System.out.println("Mortadelo Y Filemon");
			i--;
		}

		i=5;
		System.out.println("\n\tCon Do... While");
		do{
			System.out.println("Mortadelo Y Filemon");
			i--;
		}while(i>0);
	}
}