import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int T = 0;
		int N;
		int maxMen, maxWom;
		int result;
		
		Scanner tc = new Scanner(System.in);
		
		T = tc.nextInt();

		ArrayList<Integer> intMen = new ArrayList<Integer>();
		ArrayList<Integer> intWom = new ArrayList<Integer>();

		for(int j = 0; j < T; j++) {
			result = 0;
			
			N = tc.nextInt();

			intMen = inputInteger(intMen, N);
			intWom = inputInteger(intWom, N);

			quickSort(intMen, 0, intMen.size() - 1);
			quickSort(intWom, 0, intWom.size() - 1);
			
			for(int k = 0; k < N; k++) {
				result = result + Math.abs(intMen.get(k) - intWom.get(k));
			}
			
			System.out.println(result);
		}
	}

	public static void quickSort(ArrayList<Integer> a, int leftmost, int rightmost) {
		if(rightmost - leftmost <= 0) {
			return;
		}
		else {
			int pivot = a.get(rightmost);
			
			int i = leftmost - 1;
			int j = rightmost;
			
			while(true) {
				while(a.get(++i) < pivot);
				
				while(j > leftmost && a.get(--j) > pivot);
				
				if(i >= j)
					break;
				else
					swap(a, i, j);
			}
			swap(a, i, rightmost);
			
			quickSort(a, leftmost, i - 1);
			
			quickSort(a, leftmost + 1, rightmost);
		}
	}
	
	public static void swap(ArrayList<Integer> a, int i, int j) {
		int temp;
		temp = a.get(i);
		a.set(i, a.get(j));
		a.set(j, temp);
	}
	
	public static ArrayList<Integer> inputInteger(ArrayList<Integer> inputArr, int memNum) {
		Scanner tci = new Scanner(System.in);
		
		for(int k = 0; k < memNum; k++) {
			inputArr.add(tci.nextInt());
		}

		return inputArr;
	}
}
