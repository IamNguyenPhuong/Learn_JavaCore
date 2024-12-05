package Simple_Program;

import java.util.Scanner;

public class PT_bac_2 {
	public static void solveQuadraticEquation() {
		System.out.println("Nhập vào 3 số nguyên a, b, c:");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if (a == 0) {
			if (b == 0 && c == 0) {
				System.out.println("Phương trình có vô số nghiệm");
			} else if (b == 0 && c != 0) {
				System.out.println("Phương trình vô nghiệm");
			} else {
				double x = -1.0 * c / b;
				System.out.println("Giá trị của x là " + x);
			}
		} else {
			double delta = b * b - 4 * a * c;
			if (delta < 0) {
				System.out.println("Phương trình vô nghiệm");
			} else if (delta == 0) {
				System.out.println("Phương trình có nghiệm kép x = " + (-b / (2.0 * a)));
			} else {
				System.out.println("Phương trình có 2 nghiệm phân biệt");
				double x1 = (-b + Math.sqrt(delta)) / (2 * a);
				double x2 = (-b - Math.sqrt(delta)) / (2 * a);
				System.out.println("x1 = " + x1);
				System.out.println("x2 = " + x2);
			}
		}

	}
}
