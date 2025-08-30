import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int starCount = 1;
        for(int j = 0; j < n; j++) {
            for(int i = 0; i < starCount; i++) {
                System.out.print("*");
            }
            starCount++;
            System.out.println();
        }
    }
}