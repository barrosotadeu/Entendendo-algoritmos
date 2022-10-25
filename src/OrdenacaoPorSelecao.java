import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public  class OrdenacaoPorSelecao {
	
	public static int buscaMenorIndice(ArrayList<Integer> lista) {
		int menor = lista.get(0);
		int menorIndice = 0;
		
		for(int i = 1; i < lista.size(); i++) {
			if(lista.get(i) < menor) {
				menor = lista.get(i);
				menorIndice = i;
			}
			
		}
		return menorIndice;
	}
	
	public static ArrayList<Integer> ordenacaoPorSelecao(ArrayList<Integer> lista){
		ArrayList<Integer> novaLista = new ArrayList<Integer>();
		int repeticoes = lista.size();
		
		
		
		for(int i = 0; i < repeticoes; i++) {
			int menor = OrdenacaoPorSelecao.buscaMenorIndice(lista);
			novaLista.add(lista.get(menor));
			lista.remove(menor);
		}
		
		return novaLista;
		
	}

	public static void main(String[] args) {
		ArrayList<Integer> lista = new ArrayList<Integer>(Arrays.asList(5, 3, 6, 18, 7, 2, 10, 1));
		
		lista = ordenacaoPorSelecao(lista);
		
		lista.forEach(item -> System.out.println(item));
		
		

	}

}
