package algoritimos;
import util.Util;

public class BubbleSort<T extends Comparable<T>> {

	/**
	 * PT-BR
	 * --------------------------------------------------------
	 * A ideia é implementar um algoritmo que consigar ordenar 
	 * qualquer tipo de array, usando a logica do bubbleSort.
	 * 
	 * - tempo de execucao no pior caso Θ(n²);
	 * - Nao recomendado por fazer varias interações e trocas;
	 * --------------------------------------------------------
	 */
	/**
	 * EN- US
	 * --------------------------------------------------------
	 * The idea is to implement an algorithm that can order any 
	 * type of array, using bubbleSort logic.
	 * 
	 * - algorithm time in the worst case Θ(n²);
	 * - Not recommended for making many interactions 
	 * and exchanges;
	 * --------------------------------------------------------
	 */
	
	/**
	 * Algoritimo baseado na logica do bubble sorte 
	 * 
	 * @param array - passa um array de qulquer tipo
	 * @param leftIndex - passa o indice inicial do array
	 * @param rightIndex  - passa o indice final do array
	 */
	public void sort(T[] array, int leftIndex, int rightIndex) {
		for (int i = leftIndex; i < rightIndex; i++) {
			for (int j = i+1; j <= rightIndex; j++) {
				if (array[i].compareTo(array[j])> 0) {
					Util.swap(array, i, j);;
				}
			}
		}
	}
}
