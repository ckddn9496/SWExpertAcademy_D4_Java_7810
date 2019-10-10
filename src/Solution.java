import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

class Solution
{
	private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String args[]) throws Exception
	{
		int T = Integer.parseInt(br.readLine());

		for (int test_case = 1; test_case <= T; test_case++)
		{
			int N = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());
			int[] arr = new int[N];
			int idx = 0;
			while (st.hasMoreTokens()) {
				arr[idx++] = Integer.parseInt(st.nextToken());
			}
			Arrays.sort(arr);
			int result = 0;
			for (int i = 1; i <= N; i++) {
				if (arr[N-i] >= i)
					result = i;
			}
			System.out.println("#"+test_case+" "+result);
		}
	}
}