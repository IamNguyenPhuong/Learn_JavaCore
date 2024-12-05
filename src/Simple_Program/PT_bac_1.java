package Simple_Program;

import java.util.Scanner;

public class PT_bac_1 {
	public static void solveLinearEquation() {
		System.out.println("Nhập vào 2 số a và b");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if (a == 0 && b == 0) {
			System.out.println("Phương trình có vô số nghiệm");
		} else if (a == 0 && b != 0) {
			System.out.println("Phương trình vô nghiệm");
		} else {
			double x = -1.0 * b / a;
			System.out.println("Giá trị của x là " + x);
		}

	}
}
