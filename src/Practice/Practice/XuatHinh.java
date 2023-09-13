package Practice.Practice;

import java.util.Scanner;

public class XuatHinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Chọn 1 trong những hình sau");
        System.out.println("1.In hình chữ nhật");
        System.out.println("2.Bottom-left");
        System.out.println("3.Top-left");
        int option = sc.nextInt();
        System.out.println("Bạn đã chọn lựa chọn:"+option);

        switch(option){
            case 1 :
                for(int i=0; i<=2; i++){
                    System.out.print("\n");
                    for(int j=0; j<=6; j++){
                        System.out.print("*");
                    }
                }
                break;
            case 2 :
                for(int i=0; i<=4; i++){
                    System.out.print("\n");
                    for(int j=0; j<=i; j++){
                        System.out.print("*");
                    }
                }
                break;
            case 3 :
                for(int i=0; i<=4; i++){
                    System.out.print("\n");
                    for(int j=4; j>=i; j--){
                        System.out.print("*");
                    }
                }
                break;
        }

    }

}
