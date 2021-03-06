import java.util.ArrayList;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
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

			for(int l = 0; l < N; l++) {
				maxMen = findMax(intMen);
				maxWom = findMax(intWom);
				
				result = result + Math.abs(maxMen - maxWom);
			}
			
			System.out.println(result);
		}
	}

	public static int findMax(ArrayList<Integer> srcArr) {
		int current = -1001;
		int maxIndex = 0;

		for(int i = 0; i < srcArr.size(); i++) {
			if(current < srcArr.get(i)) {
				current = srcArr.get(i);
				maxIndex = i;
			}
		}
		srcArr.remove(maxIndex);

		return current;
	}

	public static ArrayList<Integer> inputInteger(ArrayList<Integer> inputArr, int memNum) {
		Scanner tci = new Scanner(System.in);
		
		for(int k = 0; k < memNum; k++) {
			inputArr.add(tci.nextInt());
		}

		return inputArr;
	}
}
