
public class Main {

	public static void main(String[] args) {
		
		ListaEnlazada lista = new ListaEnlazada(); 

		lista.insertar(lista, 1);
		lista.insertar(lista, 2);
		lista.insertar(lista, 3);
		lista.insertar(lista, 4);
		lista.insertar(lista, 5);
		lista.insertar(lista, 6);
		lista.insertar(lista, 7);
		lista.insertar(lista, 8);
		lista.insertar(lista, 9);

		lista.mostrarLista(lista); 

	}

}
