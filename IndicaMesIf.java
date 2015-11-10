/**
*Define la clase IndicaMesIf que muestre el nombre del mes en función del número
*obtenido por teclado (del 1 al 12). Utiliza la estructura condicional If. Ha de mostrar 10
*resultados.
*
*@author Roberto Carlos Flores Gomez
*@version 1.0
*/
public class IndicaMesIf{
	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		int mes;

		for (int i=0; i<10; i++) {
			
			System.out.println("Dime el numero del mes que quieres mostrar: ");
			mes=scanner.nextInt();
			if(mes==1)
				System.out.println("Enero");
			else if(mes==2)
				System.out.println("Febrero");
			else if(mes==3)
				System.out.println("Marzo");
			else if(mes==4)
				System.out.println("Abril");
			else if(mes==5)
				System.out.println("Mayo");
			else if(mes==6)
				System.out.println("Junio");
			else if(mes==7)
				System.out.println("Julio");
			else if(mes==8)
				System.out.println("Agosto");
			else if(mes==9)
				System.out.println("Septiembre");
			else if(mes==10)
				System.out.println("Octubre");
			else if(mes==11)
				System.out.println("Noviembre");
			else if(mes==12)
				System.out.println("Diciembre");
			else
				System.out.println("No es un numero valido");
		}	
	}
}