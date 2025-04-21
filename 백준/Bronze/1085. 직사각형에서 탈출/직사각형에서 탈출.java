import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
	
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		int result1, result2, answer;
		
		if(w / 2 >= x) {
			result1 = x;
		}
		else {
			result1 = w - x;
		}
		
		if(h / 2 >= y) {
			result2 = y;
		}
		else {
			result2 = h - y;
		}
		
		answer = result1 >= result2 ? result2 : result1;
		System.out.println(answer);

	
	}

}