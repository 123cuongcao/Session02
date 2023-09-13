package Practice.Practice;

import java.util.Scanner;

public class SoChanTrongKhoang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("hãy số bắt đầu:");
        int start = sc.nextInt();
        System.out.println("hãy hập số kết thúc");
        int end = sc.nextInt();
        int sum = 0;
        for(int i = start; i <= end; i++){
            if(i % 2 == 0){
                sum += i;
            }
        }
        System.out.println("tỗng những số chẵn trong đoạn đã cung cấp:"+sum);
    }
}
