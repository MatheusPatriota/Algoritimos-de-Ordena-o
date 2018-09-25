package algoritimos;

public class Main {

	public static void main(String[] args) {
		Integer[] teste = {5,7,2,1,6};
		String[] teste1 = {"Matheus","Alan","Shirley","Elen"};
		SelectionSort<String> a = new SelectionSort<>();
		a.sort(teste1, 0, teste1.length-1);
		System.out.println(teste);

	}

}
