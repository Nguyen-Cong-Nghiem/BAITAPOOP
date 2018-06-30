import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MainAccount {
    public static void main(String[] args) {
        Account ac = new Account();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao ID: ");
        int id = sc.nextInt();
        System.out.println("Nhap vao blance: ");
        double blance = sc.nextDouble();
        System.out.println("Nhap vao lai xuat: ");
        double laiXuat = sc.nextDouble();
        Date ngayTao = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        String strDate = formatter.format(ngayTao);
        System.out.println("Lai xuat thang la: "+ ac.layLaiThang(laiXuat));
    }
}
