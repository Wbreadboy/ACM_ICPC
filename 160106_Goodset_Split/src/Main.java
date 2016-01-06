import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws IOException {
		int solNumArr[] = new int[500];
		boolean solArr[];

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T;
		int N, M;

		boolean flag;

		T = Integer.parseInt(br.readLine());

		for(int i = 0; i < T; i++) {
			flag = true;

			String split[] = br.readLine().split(" ");

			N = Integer.parseInt(split[0]);
			M = Integer.parseInt(split[1]);

			solArr = new boolean[M];

			for(int k = 0; k < M; k++) {
				solArr[k] = false;
			}

			for(int j = 0; j < N; j++) {
				split = br.readLine().split(" ");

				for(int a = 0; a < split.length; a++) {
					solNumArr[a] = Integer.parseInt(split[a]);
				}

				if(solNumArr[0] < 0 || solNumArr[0] == M) {
					flag = false;
				}

				for(int l = 1; l <= solNumArr[0]; l++) {
					solArr[solNumArr[l] - 1] = true;
				}
			}

			for(int m = 1; m < M; m++) {
				if(solArr[m] == false) {
					flag = false;
				}
			}

			if(flag == true) {
				System.out.println("YES");
			}

			else {
				System.out.println("NO");
			}
		}
	}
}