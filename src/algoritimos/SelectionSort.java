package algoritimos;

import util.Util;

public class SelectionSort<T extends Comparable<T>> {
	
	/**
	 * PT-BR
	 * --------------------------------------------------------
	 * A ideia é implementar um algoritmo que consigar ordenar 
	 * qualquer tipo de array, usando a logica do Selection
	 * sort.
	 * 
	 * - tempo de execucao no pior caso Θ(n²);
	 * - Melhor que o bubbleSort por ter menos interacoes;
	 * --------------------------------------------------------
	 */
	/**
	 * EN- US
	 * --------------------------------------------------------
	 * The idea is to implement an algorithm that can order any 
	 * type of array, using selectionSort logic.
	 * 
	 * - algorithm time in the worst case Θ(n²);
	 * - better than bubbleSort because it contains less interactions;
	 * --------------------------------------------------------
	 */
	
	/**
	 * Algoritimo baseado na logica do selection sort, usando como 
	 * base o menor elemento da lista.
	 * 
	 * @param array - passa uma lista de qualquer tipo
	 * @param leftIndex - passa o indice inicial da lista
	 * @param rightIndex  - passa o indice final da lista
	 */
	public void sort(T[] array, int leftIndex, int rightIndex) {
		int aux = 0;
		for (int i = leftIndex; i <= rightIndex; i++) {
			int min = i;
			for (int j = i+1; j <= rightIndex; j++) {
				if (array[min].compareTo(array[j])> 0) {
					min = j;
				}
			}
			Util.swap(array, min, aux);
			aux ++;
		}
	}
}
