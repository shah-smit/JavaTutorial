public class Backtracking{
public static void main(String args[]) {

		int[][] arr = { 
				{ 1, 2, 3, 4 }, 
				{ 8, 7, 6, 5 }, 
				{ 9, 10, 11, 12 },
				{ 16, 15, 14, 13 }
		};

		int[][] backtrack = new int[4][4];
		for (int i = 0; i < 4; i++)
			for (int j = 0; j < 4; j++) {
                int curr = arr[i][j];
				if (i - 1 >= 0 && j - 1 >= 0) {
					int above = backtrack[i - 1][j];
					int left = backtrack[i][j - 1];
					
					if (curr + (above / 2) < curr + (left / 2)) {

						backtrack[i][j] = curr + above / 2;
					} else {
						backtrack[i][j] = curr + left / 2;
					}
				}
				if (i - 1 >= 0 && j - 1 < 0) {
					int left = backtrack[i - 1][j];
				// 	int curr = arr[i][j];
					backtrack[i][j] = (left / 2) + curr;
				}

				if (i - 1 < 0 && j - 1 >= 0) {
					int above = backtrack[i][j - 1];
				// 	int curr = arr[i][j];
					backtrack[i][j] = (above / 2) + curr;
				}
			}

		for (int i = 0; i < 4; i++){
			for (int j = 0; j < 4; j++)
				System.out.print(backtrack[i][j]+" ");
			System.out.println();
		}		
	}
}
