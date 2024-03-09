
package ejemplo2.examen1;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ListasSimpleEnlazada lista = new ListasSimpleEnlazada();
		
		while (true) {
			
			System.out.println("\nOpciones:");
			System.out.println("1. Insertar la palabra que desees ");
			System.out.println("2. Buscar una palabra");
			System.out.println("3. Imprimir lista");
			System.out.println("4. Salir");
			System.out.println("Seleccione una opcion");
			int opcion = scanner.nextInt();
			scanner.nextLine();
			switch (opcion) {
			case 1:
				System.out.print("Ingrese la palabra a insertar: ");
				String elementoInicio = scanner.nextLine();
				lista.insertarAlInicio(elementoInicio);
				break;

			case 2:
				System.out.print("Ingrese la palabra a buscar: ");
				String buscarElemento = scanner.nextLine();
				if (lista.buscar( buscarElemento)) {
					System.out.println("El elemento " + buscarElemento + " esta en la lista");
				}else {
					System.out.println("El elemento " + buscarElemento + " no esta en la lista");
				}
				break;


			case 3:
				lista.imprimirLista();
				break;
			case 4:
				System.out.println("Saliendo del programa...");
				scanner.close();
				System.exit(0);
			default:
				System.out.println("Opcion invalida. Por favor, selecciona una opcion valida");
			}
		}

	}

}

