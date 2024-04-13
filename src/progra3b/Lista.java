package progra3b;

public class Lista {
	
	private Nodo inicio;
	
	public void agregar(int numero) {
		Nodo nodo = new Nodo();
		nodo.setNumero(numero);
		if (inicio == null) {
			inicio = nodo;
		} else {
			Nodo tmp = inicio;
			while (tmp.getApuntador() != null) {
				tmp = tmp.getApuntador();
			}
			tmp.setApuntador(nodo);
		}
	}
	
	public void mostrar() {
		if (inicio == null) {
			System.out.println("La lista esta vacia");
			return;
		}
		Nodo tmp = inicio;
		System.err.println(tmp.getNumero());
		while (tmp.getApuntador() != null) {
			tmp = tmp.getApuntador();
			System.err.println(tmp.getNumero());
		}
	}

}
