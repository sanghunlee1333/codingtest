import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[][] complexA = new int[n][m];
		int[][] complexB = new int[n][m];
		int[][] result = new int[n][m];
		
		for(int i = 0; i < complexA.length; i++) {
			for(int j = 0; j < complexA[i].length; j++) {
				complexA[i][j] = sc.nextInt();
			}
		}
		
		for(int i = 0; i < complexB.length; i++) {
			for(int j = 0; j < complexB[i].length; j++) {
				complexB[i][j] = sc.nextInt();
			}
		}
		
		for(int i = 0; i < complexA.length; i++) {
			for(int j = 0; j < complexA[i].length; j++) {
				result[i][j] = complexA[i][j] + complexB[i][j];
				if(j < complexA[i].length - 1) {
					System.out.print(result[i][j] + " ");
				}
				else System.out.print(result[i][j]);
			}
			System.out.println();
		}
	
		sc.close();
		
	}
}