package algoritimos;

import util.Util;

public class SimultaniusSelectionSort<T extends Comparable<T>> {
	
	/**
	 * PT-BR
	 * --------------------------------------------------------
	 * A ideia é implementar um algoritmo que consigar ordenar 
	 * qualquer tipo de array, usando a logica do SelectionSort
	 * simultaneo ou seja seleciona o maior e menor ao mesmo 
	 * tempo.
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
	
	public void sort(T[] array, int leftIndex, int rightIndex) {
		int fim = rightIndex;
		for (int i = leftIndex; i <= fim; i++) {
			int min = i;
			int max = i;
			for (int j = i; j <= fim; j++) {
				if (array[j].compareTo(array[min]) < 0) {
					min = j;
				}
			}
			Util.swap(array, i, min);
			for (int k = i; k <= fim; k++) {
				if (array[k].compareTo(array[max]) > 0) {
					max = k;
				}
			}
			Util.swap(array, fim, max);
			
			
			fim --;
		}
	}
}
