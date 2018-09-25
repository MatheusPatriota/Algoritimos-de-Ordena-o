package util;

public class Util {
	
	public static void swap(Object[] array, int x, int y) {
		
		if (array == null) {
			throw new NullPointerException();
		}
		
		Object temp = array[x];
		array[x] = array[y];
		array[y] = temp;
	}
}
