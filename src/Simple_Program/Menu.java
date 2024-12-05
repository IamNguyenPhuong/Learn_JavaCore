package Simple_Program;

import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println(">> Lựa Chọn Tính Năng <<");
			System.out.println("++__________________++");
			System.out.println("|1. Giải phương trình bậc 1");
			System.out.println("|2. Giải phương trình bậc 2");
			System.out.println("|3. Thoát chương trình");
			System.out.println("++__________________++");
			System.out.println("Lựa chọn của bạn là: ");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				PT_bac_1.solveLinearEquation();
				break;
			case 2:
				PT_bac_2.solveQuadraticEquation();
				break;
			case 3:
				System.out.println("Bạn đã chọn thoát chương trình");
				System.exit(0);
				break;
			default:
				System.out.println("Nhập sai, vui lòng thử lại!");
			}
		}

	}
}
