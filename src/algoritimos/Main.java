package algoritimos;

public class Main {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Integer[] teste = { 4, 9, 3, 4, 0, 5, 1, 4 };
		String[] teste1 = {"Matheus","Alan","Shirley","Elen"};
		SimultaniusSelectionSort<Integer> a = new SimultaniusSelectionSort<>();
		a.sort(teste, 0, teste.length-1);
		System.out.println(teste);

	}

}
