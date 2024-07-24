
package data;

import java.util.Scanner;

/**
 *
 * @author quang
 */
public class KhachHang {
    private String maKhachHang;
    private String diaChi;

    public KhachHang() {
    }

    public KhachHang(String maKhachHang, String diaChi) {
        this.maKhachHang = maKhachHang;
        this.diaChi = diaChi;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return "KhachHang{" + "maKhachHang=" + maKhachHang + ", diaChi=" + diaChi + '}';
    }
    
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã khách hàng: ");
        maKhachHang = sc.nextLine();
        System.out.print("Nhập địa chỉ khách hàng: ");
        diaChi = sc.nextLine();
    }
  
}
