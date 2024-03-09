
package ejemplo2.examen1;


public class ListasSimpleEnlazada {
    
    
    Nodo cabeza; //Referencia al primer nodo de la lista
    
    //constructor para inicializar la lista como vacia
    public ListasSimpleEnlazada(){
        
        this.cabeza=null;  //Inicializamos la lista vacia

    }
    
    //Metodo para insertar un nuevo nodo al inicio de la lista
    public void insertarAlInicio(String dato){
        Nodo nuevoNodo = new Nodo(dato);  // Crea un nuevo nodo con el valor proporcionado
        nuevoNodo.siguiente = cabeza; // Establece el siguiente del nuevo nodo como la cabeza actual
        cabeza = nuevoNodo; //Actualiza la cabeza para que apunte al nuevo nodo
    }
  
        public boolean buscar(String dato) {
	Nodo temp = cabeza;
	while (temp != null) {//Recorre la lista
		if (temp.dato == dato) {//Compara el valor del nodo con el dato buscado
			return true;//Retorna true si lo encuentra
		}
		temp = temp.siguiente;
	}
	return false;//retorna false si no lo encuentra
}

        //Metodo para imprimir los elementos de la lista
        public void imprimirLista() {
	Nodo temp = cabeza;
	System.out.print("Lista: ");
	while (temp != null) {//Recorre la lista
		System.out.print(temp.dato + " ");//Imprime el valor del nodo actual
		temp = temp.siguiente;//Avanza al siguiente nodo
	}
	System.out.println();
}
}
    