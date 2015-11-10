/**
*Define la clase TablaDeMultiplicar. Muestra la tabla de multiplicar. Para ello, solicita el
*factor al usuario. Sólo se admiten la tabla de multiplicar de los número 1, 2... 12
*(solicitud repetitiva)
*
*@author Roberto Carlos Flores Gomez
*@version 1.0
*/
public class TablaDeMultiplicar{
	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		int x;

		do{
			System.out.println("Dime el numero a multiplicar(entre 1 y 12): ");
			x=scanner.nextInt();
			if(x>0&&x<13){
				for (int i=1; i<13; i++) {
					System.out.println(x+"x"+i+"= "+x*i);
				}
			}
			else
				System.out.println("El numero introducido no esta entre 1 y 12");
		}while(x>0&&x<13);
	}
}