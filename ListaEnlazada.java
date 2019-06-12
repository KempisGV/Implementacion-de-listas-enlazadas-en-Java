
public class ListaEnlazada { 

	private Nodo cabeza;
	
	public ListaEnlazada insertar(ListaEnlazada lista, int dato) { 
		
		Nodo nuevo_nodo = new Nodo(dato); 
		nuevo_nodo.siguiente = null; 

		if (lista.cabeza == null) { 
			lista.cabeza = nuevo_nodo; 
		} 
		else {
			Nodo ultimo = lista.cabeza; 
			while (ultimo.siguiente != null) { 
				ultimo = ultimo.siguiente; 
			} 

			ultimo.siguiente = nuevo_nodo; 
		} 
		return lista; 
	} 
	
	public void mostrarLista(ListaEnlazada list) {
		
		Nodo nodo = list.cabeza; 

		System.out.print("LinkedList: "); 

		while (nodo != null) { 
			System.out.print(nodo.dato + " "); 
			nodo = nodo.siguiente; 
		} 
	}
} 
