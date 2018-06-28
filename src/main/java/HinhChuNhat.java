import java.util.Scanner;

public class HinhChuNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height: ");
        double height = sc.nextDouble();
        System.out.println("Enter the width: ");
        double width = sc.nextDouble();
        Rectangle rectangle = new Rectangle(height,width );
        System.out.println("Hinh chu nhat la: " + rectangle.display());
        System.out.println("Dien tich la : " + rectangle.getArea());
        System.out.println("Chu vi la : " + rectangle.getPerimeter());
    }
}
