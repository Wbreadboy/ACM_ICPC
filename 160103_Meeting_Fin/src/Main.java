import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		int T = 0;
		int N = 0;
		int result;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		T = Integer.parseInt(br.readLine());

		ArrayList<Integer> intMen = new ArrayList<Integer>();
		ArrayList<Integer> intWom = new ArrayList<Integer>();

		for(int j = 0; j < T; j++) {
			result = 0;

			N = Integer.parseInt(br.readLine());

			intMen = inputInteger(intMen, N);
			intWom = inputInteger(intWom, N);

			Collections.sort(intMen);
			Collections.sort(intWom);

			for(int k = 0; k < N; k++) {
				result = result + Math.abs(intMen.get(k) - intWom.get(k));
			}
			
			intMen.clear();
			intWom.clear();
			
			System.out.println(result);
		}
	}

	public static ArrayList<Integer> inputInteger(ArrayList<Integer> inputArr, int memNum) throws IOException {
		BufferedReader bri = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token = null;
		token = new StringTokenizer(bri.readLine());

		while(token.hasMoreTokens()) {
			inputArr.add(Integer.parseInt(token.nextToken()));
		}

		return inputArr;
	}
}
