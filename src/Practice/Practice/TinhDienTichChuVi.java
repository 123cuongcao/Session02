package Practice.Practice;
import java.util.Scanner;

public class TinhDienTichChuVi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Chọn hình cần tính:");
            System.out.println("1. Hình chữ nhật");
            System.out.println("2. Hình tam giác");
            System.out.println("3. Hình tròn");
            System.out.println("4. Thoát");

            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("Nhập chiều dài: ");
                    double dai = Double.parseDouble(sc.nextLine());
                    System.out.print("Nhập chiều rộng: ");
                    double rong = Double.parseDouble(sc.nextLine());

                    double chuViHCN = 2 * (dai + rong);
                    double dienTichHCN = dai * rong;

                    System.out.println("Chu vi hình chữ nhật: " + chuViHCN);
                    System.out.println("Diện tích hình chữ nhật: " + dienTichHCN);
                    break;
                case 2:
                    System.out.print("Nhập cạnh a: ");
                    double a = Double.parseDouble(sc.nextLine());
                    System.out.print("Nhập cạnh b: ");
                    double b = Double.parseDouble(sc.nextLine());
                    System.out.print("Nhập cạnh c: ");
                    double c = Double.parseDouble(sc.nextLine());

                    double chuViTG = a + b + c;
                    double p = chuViTG / 2; // Nửa chu vi
                    double dienTichTG = Math.sqrt(p * (p - a) * (p - b) * (p - c));

                    System.out.println("Chu vi hình tam giác: " + chuViTG);
                    System.out.println("Diện tích hình tam giác: " + dienTichTG);
                    break;
                case 3:
                    System.out.print("Nhập bán kính: ");
                    double banKinh = Double.parseDouble(sc.nextLine());

                    double chuViHT = 2 * Math.PI * banKinh;
                    double dienTichHT = Math.PI * banKinh * banKinh;

                    System.out.println("Chu vi hình tròn: " + chuViHT);
                    System.out.println("Diện tích hình tròn: " + dienTichHT);
                    break;
                case 4:
                    System.exit(0); // Thoát chương trình
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Hãy chọn lại.");
            }
        }
    }
}
