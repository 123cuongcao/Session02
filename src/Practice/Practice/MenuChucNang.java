package Practice.Practice;


import java.util.Scanner;

public class MenuChucNang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;

        while(choice!=4){
            System.out.println("1.Kiểm tra tính chẳn lẻ của 1 số :");
            System.out.println("2.Kiểm tra số nguyên tố:");
            System.out.println("3.Kiểm tra 1 số có chia hết cho 3 hay không:");
            System.out.println("4.thoat");
             choice = Integer.parseInt(sc.nextLine()) ;

            switch (choice){
                case 1:
                    System.out.print("Nhập số: ");
                    int num = Integer.parseInt(sc.nextLine());
                    if(num%2==0) System.out.println("số chẵn");
                    else System.out.println("số lẻ");
                break;
                case 2:
                    System.out.print("Nhập số: ");
                    int num1 = Integer.parseInt(sc.nextLine());
                    boolean isPrime = true ;
                    for(int i=2; i<Math.sqrt(num1); i++){
                        if(num1%i == 0){
                            isPrime = false ;
                            break;
                        }
                    }
                    if(isPrime) System.out.println("số nguyên tố");
                    else System.out.println("ko phải số nguyên tố");
                    break;
                case 3:
                    System.out.print("Nhập số: ");
                    int num2 = Integer.parseInt(sc.nextLine());
                    if(num2%3 == 0) System.out.println("số chia hết cho 3");
                    else System.out.println("số không chia hết cho 3");
                    break;
                case 4:
                   break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Hãy chọn lại.");
            }
        }

    }

}
