package firstLesson;

import java.util.Scanner;

public class Bai01 {
	public static void main(String[] args) {
		System.out.println("run bai 01");
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ten sinh vien");
		String a = sc.nextLine();
		System.out.println("nhap diem");
		int b = sc.nextInt();
		System.out.println("ten sinh vien la" + a + ", co diem la" + b);
		sc.close();
	}
}
