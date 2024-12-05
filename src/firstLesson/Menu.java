package firstLesson;

import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
		System.out.println(">>Lựa Chọn Tính Năng<<");
		System.out.println("++__________________++");
		System.out.println("|1. Cộng");
		System.out.println("|2. Trừ");
		System.out.println("|3. Kết thúc");
		System.out.println("++__________________++");
		Scanner sc = new Scanner(System.in);
		System.out.println("Lựa chọn của bạn là: ");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			System.out.println("Bạn đã chọn phép cộng");
			break;
		case 2:
			System.out.println("Bạn đã chọn phép trừ");
			break;
		case 3:
			System.out.println("Bạn đã chọn thoát chương trình");
			System.exit(0);
			break;
		default:
			System.out.println("Nhập sai rồi, nhập lại đê");

		}
		sc.close();

	}
}
