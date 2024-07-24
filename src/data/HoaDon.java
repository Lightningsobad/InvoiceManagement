package data;

import java.util.*;

/**
 *
 * @author quang
 */
public class HoaDon {

    private String soHD;
    private int soMatHang;
    private KhachHang kh;
    private Hang dsHang[];
    private NgayThang ngayHD;
    private List<Hang> arr = new ArrayList();   //khai báo 1 list hàng hóa trong 1 hóa đơn

    public HoaDon() {
        kh = new KhachHang();
        ngayHD = new NgayThang();
    }

    public HoaDon(String soHD, int soMatHang, KhachHang kh, Hang[] dsHang, NgayThang ngayHD) {
        this.soHD = soHD;
        this.soMatHang = soMatHang;
        this.kh = kh;
        this.dsHang = dsHang;
        this.ngayHD = ngayHD;
    }

    public String getSoHD() {
        return soHD;
    }

    public void setSoHD(String soHD) {
        this.soHD = soHD;
    }

    public int getSoMatHang() {
        return soMatHang;
    }

    public void setSoMatHang(int soMatHang) {
        this.soMatHang = soMatHang;
    }

    public KhachHang getKh() {
        return kh;
    }

    public void setKh(KhachHang kh) {
        this.kh = kh;
    }

    public Hang[] getDsHang() {
        return dsHang;
    }

    public void setDsHang(Hang[] dsHang) {
        this.dsHang = dsHang;
    }

    public NgayThang getNgayHD() {
        return ngayHD;
    }

    public void setNgayHD(NgayThang ngayHD) {
        this.ngayHD = ngayHD;
    }

    public List<Hang> getArr() {
        return arr;
    }

    public void setArr(List<Hang> arr) {
        this.arr = arr;
    }

    @Override
    public String toString() {
        return "HoaDon{" + "soHD=" + soHD + ", soMatHang=" + soMatHang + ", kh=" + kh + ", dsHang=" + dsHang + ", ngayHD=" + ngayHD + ", arr=" + arr + '}';
    }
    
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập ngày: ");
        ngayHD.setNgay(sc.nextInt());
        System.out.print("Nhập tháng: ");
        ngayHD.setThang(sc.nextInt());
        System.out.print("Nhập năm: ");
        ngayHD.setNam(sc.nextInt());
        sc.nextLine();
        System.out.print("Nhập số hóa đơn: ");
        soHD = sc.nextLine();
        kh.nhap();  //nhập thông tin khách hàng
        System.out.print("Nhập số mặt hàng: ");
        soMatHang = Integer.parseInt(sc.nextLine());
        dsHang = new Hang[soMatHang];   //khai báo danh sách hàng có bao nhiêu số mặt hàng
        for (int i = 0; i < soMatHang; i++) {
            dsHang[i] = new Hang(); //hàng thứ i bằng new một hàng hóa mới
            arr.add(dsHang[i]);     //nhét vào trong mảng hàng hóa
        }
        System.out.println("Nhập thông tin hàng: ");
        for (int i = 0; i < arr.size(); i++) {
            System.out.println("Nhập thông tin món hàng thứ #" + (i + 1) + "/" + arr.size() + ":");
            arr.get(i).nhap();  //lấy món hàng thứ i trong mảng ra, nhập thông tin
        }
            
    }

public double tinhTongTien() {  //tính tổng tiền của cả hóa đơn
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) 
            sum += arr.get(i).tinhTongTien();  
        return sum;
    }

    public void inHoaDon() {
        System.out.println("********************************************************");
        System.out.printf("Số HĐ: %-10s", soHD);
        System.out.println("\tNgày tạo:" + ngayHD.getNgay() + "/" + ngayHD.getThang() + "/" + ngayHD.getNam());
        System.out.printf("Mã khách: %-10s", kh.getMaKhachHang());
        System.out.printf("\tĐịa chỉ: %-10s\n", kh.getDiaChi());
        Hang.inTieuDe();
        for (int i = 0; i < arr.size(); i++) {
            arr.get(i).inDuLieu();
        }        
        System.out.println("-----------------");
        System.out.printf("Tổng tiền: %7.1f\n", tinhTongTien());            
      }
    
    public void sapXep() {
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if(arr.get(i).getDonGia() > arr.get(j).getDonGia()){
                    Hang tg = arr.get(i);
                    arr.set(i, arr.get(j));
                    arr.set(j, tg);
                }
            }
        }
    }

    public Hang timMax() {
        Hang max = arr.get(0);  //gán món hàng max (về số lượng) cho món hàng thứ 0
        for (int i = 0; i < arr.size(); i++) {
            if(arr.get(i).getSoLuong() > max.getSoLuong())  //so sánh về số lượng
                max = arr.get(i);   //gán lại max bằng món hàng thứ i
        }
        return max; //trả về một món hàng
    }

}

    

