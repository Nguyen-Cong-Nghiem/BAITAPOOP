import java.util.Date;
public class Account {
    private int id;
    private double blance ;
    private double laiXuat ;
    private Date ngayTao;

    public Account() {

    }

    public Account(int id, double blance) {
        this.id = id;
        this.blance = blance;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setBlance(double blance) {
        this.blance = blance;
    }

    public double getBlance() {
        return blance;
    }

    public void setLaiXuat(double laiXuat) {
        this.laiXuat = laiXuat;
    }

    public double getLaiXuat() {
        return laiXuat;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public double layLaiThang(double laiXuat) {
         return this.laiXuat/12;
    }

//    public double withdraw(double blance, double laiThang) {
//        return this.blance * this.laiThang;
//    }
}
