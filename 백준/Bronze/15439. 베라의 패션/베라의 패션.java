import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
	
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int answer = n * n - n;
		
		System.out.println(answer);
		
	
	}

}