package firstLesson;

import java.util.Scanner;

public class Bai02 {
	public static void main(String[] args) {
		System.out.println("nhap vao 2 so a va b");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("chu vi la " + 2 * (a + b) + "\ndien tich la " + (a * b));
		int c = Math.min(a, b);
		System.out.println("so nho nhat la " + c);
		sc.close();
	}
}
