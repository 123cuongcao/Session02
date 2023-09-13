package Practice.Practice;

import java.util.Scanner;

public class CacSoNguyenTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Đây là chương trình hiển thị những số nguyên tố bé hơn 100");
        System.out.println("Ấn số 1 để chạy");
        int start = sc.nextInt();

        if (start == 1) {
            for (int i = 2; i <= 100; i++) {
                boolean isPrime = true;
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    System.out.print(i + ",");
                }
            }
        } else {
            System.out.println("Bạn phải nhập số 1");
        }
    }
}
