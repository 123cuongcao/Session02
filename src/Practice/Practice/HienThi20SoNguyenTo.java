package Practice.Practice;

import java.util.Scanner;

public class HienThi20SoNguyenTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Đây là chương trình hiển thị 20 số nguyên tố đầu tiên");
        System.out.println("bấm 1 để bắt đầu chương trình");
        int start = sc.nextInt();
        int count =0;
        int num = 2;
        if(start == 1){
            while(count<10){
                    boolean isPrime = true;
                    for (int i = 2; i <= Math.sqrt(num); i++) {
                        if (num%i==0) {
                            isPrime = false;
                            break;
                        }
                    }
                    if (isPrime) {
                        System.out.print(num+",");
                        count++;
                    }
                    num++;
            }
        }

    }
}
