package bubblesort;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		String resp = null;
		int temp = 0;
		do {
			System.out.printf("\nNumero: ");
			list.add(read.nextInt());
			System.out.printf("\nadicionar mais um número?");
			resp = read.next().toLowerCase();
		} while(resp.equals("sim"));
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		for (int i = 0; i < list.size(); i++) {
			for (int y = 0; y < list.size() - i - 1; y++) {
				if (list.get(y).compareTo(list.get(y+1)) > 0) {
					temp = list.get(y);
					list.set(y, list.get(y + 1));
					list.set(y + 1, temp);
				}
			}
		}
		System.out.println("\n\n");
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
	
}
