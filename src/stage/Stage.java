package stage;

import data.HoaDon;

/**
 *
 * @author quang
 */
public class Stage {

    public static void main(String[] args) {
        HoaDon hd1 = new HoaDon();  
        hd1.nhap();
        hd1.inHoaDon();
        sapxepDonHang(hd1);
        timkiemMatHang(hd1);

    }

    public static void sapxepDonHang(HoaDon hd) {   //hàm có tham số đầu vào là một object hóa đơn
        System.out.println("Sau khi sắp xếp danh sách hàng tăng dần theo thành tiền: ");
        hd.sapXep();
        hd.inHoaDon();

    }

    public static void timkiemMatHang(HoaDon hd) {  
        System.out.println("Mặt hàng có số lượng mua lớn nhất: ");
        System.out.println(hd.timMax());
    }

}
