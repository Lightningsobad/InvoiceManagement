
package data;

import java.util.Scanner;

/**
 *
 * @author quang
 */
public class Hang {
    private String tenHang;
    private double soLuong;
    private double donGia;

    public Hang() {
    }

    public Hang(String tenHang, double soLuong, double donGia) {
        this.tenHang = tenHang;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public double getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(double soLuong) {
        this.soLuong = soLuong;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    @Override
    public String toString() {
        return "Hang{" + "tenHang=" + tenHang + ", soLuong=" + soLuong + ", donGia=" + donGia + '}';
    }
    
    
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên hàng: ");
        tenHang = sc.nextLine();
        System.out.print("Nhập số lượng: ");
        soLuong = Double.parseDouble(sc.nextLine());
        System.out.print("Nhập đơn giá: ");
        donGia = sc.nextDouble();
    }
    
    public double tinhTongTien() {  //tính tổng thành tiền
        return soLuong * donGia;
    }
    
    public static void inTieuDe() {
        System.out.printf("|%-10s|%-10s|%-10s|%-10s|\n", "TÊN HÀNG", "SỐ LƯỢNG", "ĐƠN GIÁ", "THÀNH TIỀN");
        
    }
    
    public void inDuLieu() {
        System.out.printf("|%-10s|%-10.1f|%-10.1f|%-10.1f\n", tenHang, soLuong, donGia, tinhTongTien());
    }
    
}
