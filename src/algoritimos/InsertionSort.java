package algoritimos;

public class InsertionSort<T extends Comparable<T>> {
	
	/**
	 * PT-BR
	 * --------------------------------------------------------
	 * A ideia é implementar um algoritmo que consigar ordenar 
	 * qualquer tipo de array, usando a logica do InsertionSort.
	 * 
	 * - tempo de execucao no pior caso Θ(n²);
	 * - Melhor que o bubbleSort e SelectSort por ter menos 
	 *   interacoes;
	 * --------------------------------------------------------
	 */
	
	/**
	 * EN- US
	 * --------------------------------------------------------
	 * The idea is to implement an algorithm that can order any 
	 * type of array, using InsertionSort logic.
	 * 
	 * - algorithm time in the worst case Θ(n²);
	 * - better than bubbleSort and SelectionSort because
	 *   it contains less interactions;
	 * --------------------------------------------------------
	 */
	
	/**
	 * Insere em uma lista ordenada pegando o elemento e 
	 * inserindo em sua posicao correta; 
	 * 
	 * @param array - uma lista de quaquer tipo
	 * @param leftIndex - o indice inicial 
	 * @param rightIndex - o indice final 
	 */
	public void sort(T[] array, int leftIndex, int rightIndex) {
		
		for (int i = leftIndex+1; i <= rightIndex; i++) {
			
			T chave = array[i];
			int j = i-1;
			
			while (j >= 0 && array[j].compareTo(chave)> 0) {
				array[j+1] = array[j];
				j --;
			}
			array[j+1] = chave;
		}
	}
	
}
