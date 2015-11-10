/**
*Define la clase EligeOpcion que permita visualizar los siguientes mensajes,
*dependiendo del número que pulsamos. Ha de mostrar 10 resultados.
*a. (1) Procesador de textos
*b. (2) Hoja de cálculo
*c. (3) Base de datos
*d. otro número, la tecla pulsada es errónea.
*
*@author Roberto Carlos Flores Gomez
*@version 1.0
*/
public class EligeOpcion{
	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		int x;

		for (int i=0; i<10; i++) {
			System.out.println("Dime un numero: ");
			x=scanner.nextInt();

			switch(x){
				case 1:
					System.out.println("(1) Procesador de textos");
					break;
				case 2:
					System.out.println("(2) Hoja de calculo");
					break;
				case 3:
					System.out.println("(3) Base de datos");
					break;
				default:
					System.out.println("La tecla pulsada es erronea");
			}
		}
	}
}