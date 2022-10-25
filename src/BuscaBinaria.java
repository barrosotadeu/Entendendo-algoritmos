import java.util.ArrayList;

public class BuscaBinaria {
	
	public static int pesquisaBinaria(ArrayList<Integer> lista, int item) {
		int baixo = 0;
		int alto = lista.size() -1;
		int quantidadeDeBuscas = 1;
		
		while(baixo <= alto) {
			System.out.println(quantidadeDeBuscas);
			int meio = (baixo + alto) / 2;
			int chute = lista.get(meio);
			if(chute == item) {
				return meio;
			}
			if(chute > item) {
				alto = chute - 1;
				
			}else {
				baixo = chute + 1;
			}
			quantidadeDeBuscas++;
			
			
		}
		return 0;
	}
	
	
	public static void main(String[] args) {
		
		ArrayList<Integer> lista = new ArrayList<Integer>();
		
		for(int i = 0; i <= 100; i++) {
			lista.add(i);
		}
		
		System.out.println(BuscaBinaria.pesquisaBinaria(lista, 51));
		
		
	}

}
