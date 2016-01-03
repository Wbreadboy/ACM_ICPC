import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		int T = 0;
		int N = 0;
		int result;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			T = Integer.parseInt(br.readLine());
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		ArrayList<Integer> intMen = new ArrayList<Integer>();
		ArrayList<Integer> intWom = new ArrayList<Integer>();

		for(int j = 0; j < T; j++) {
			result = 0;
			
			try {
				N = Integer.parseInt(br.readLine());
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

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
		BufferedReader bri = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token = null;
		try {
			token = new StringTokenizer(bri.readLine());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		while(token.hasMoreTokens()) {
			inputArr.add(Integer.parseInt(token.nextToken()));
		}

		return inputArr;
	}
}
