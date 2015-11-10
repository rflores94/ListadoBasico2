/**
*Define la clase IndicaMesSwitch. Semejante al anterior, pero usando la estructura Switch.
*
*@author Roberto Carlos Flores Gomez
*@version 1.0
*/
public class IndicaMesSwitch{
	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		int mes;

		for (int i=0; i<10; i++) {
			System.out.println("Dime el numero del mes que quieres mostrar: ");
			mes=scanner.nextInt();

			switch(mes) {
				case 1:
					System.out.println("Enero");
					break;
				case 2:
					System.out.println("Febrero");
					break;
				case 3:
					System.out.println("Marzo");
					break;
				case 4:
					System.out.println("Abril");
					break;
				case 5:
					System.out.println("Mayo");
					break;
				case 6:
					System.out.println("Junio");
					break;
				case 7:
					System.out.println("Julio");
					break;
				case 8:
					System.out.println("Agosto");
					break;
				case 9:
					System.out.println("Septiembre");
					break;
				case 10:
					System.out.println("Octubre");
					break;
				case 11:
					System.out.println("Noviembre");
					break;
				case 12:
					System.out.println("Diciembre");
					break;
				default:
					System.out.println("No es un numero valido");
					break;
			}
		}
	}
}