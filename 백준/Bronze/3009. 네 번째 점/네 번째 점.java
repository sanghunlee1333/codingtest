import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
	
		Scanner sc = new Scanner(System.in);
		
		int x1 = sc.nextInt(), y1 = sc.nextInt();
		int x2 = sc.nextInt(), y2 = sc.nextInt();
		int x3 = sc.nextInt(), y3 = sc.nextInt();
		
		int x = 0, y = 0;
		if(x1 == x2) {
			x = x3;
		}
		else if(x1 == x3) {
			x = x2;
		}
		else x = x1;
		
		if(y1 == y2) {
			y = y3;
		}
		else if(y1 == y3) {
			y = y2;
		}
		else y = y1;
		
		System.out.print(x + " " + y);
		

	}

}