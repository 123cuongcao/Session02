package Practice.Practice;

import java.util.Scanner;

public class XacThucDuLieuXuDungVongLap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double side1, side2, side3;

        while (true) {
            System.out.println("Nhập vào 3 cạnh của tam giác:");
            System.out.print("Cạnh 1: ");
            side1 = scanner.nextDouble();
            System.out.print("Cạnh 2: ");
            side2 = scanner.nextDouble();
            System.out.print("Cạnh 3: ");
            side3 = scanner.nextDouble();

            if (isValidTriangle(side1, side2, side3)) {
                double perimeter = calculatePerimeter(side1, side2, side3);
                double area = calculateArea(side1, side2, side3);

                System.out.println("Chu vi của tam giác là: " + perimeter);
                System.out.println("Diện tích của tam giác là: " + area);
                break;
            } else {
                System.out.println("Không phải tam giác hợp lệ. Vui lòng nhập lại.");
            }
        }

        scanner.close();
    }

    public static boolean isValidTriangle(double side1, double side2, double side3) {
        return (side1 > 0 && side2 > 0 && side3 > 0) && (side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1);
    }

    public static double calculatePerimeter(double side1, double side2, double side3) {
        return side1 + side2 + side3;
    }

    public static double calculateArea(double side1, double side2, double side3) {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
}
