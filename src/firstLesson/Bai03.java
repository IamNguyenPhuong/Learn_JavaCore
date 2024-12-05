package firstLesson;

import java.util.Scanner;

public class Bai03 {
	public static void main(String[] args) {
		System.out.println("nhap vao so can thiet");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("the tich la " + Math.pow(a, 3));
		sc.close();

	}
}
