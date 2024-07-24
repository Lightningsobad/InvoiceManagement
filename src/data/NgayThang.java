
package data;

/**
 *
 * @author quang
 */
public class NgayThang {
    private int ngay;
    private int thang;
    private int nam;

    public NgayThang() {
    }

    public NgayThang(int thang, int ngay, int nam) {
        this.thang = thang;
        this.ngay = ngay;
        this.nam = nam;
    }

    public int getThang() {
        return thang;
    }

    public void setThang(int thang) {
        this.thang = thang;
    }

    public int getNgay() {
        return ngay;
    }

    public void setNgay(int ngay) {
        this.ngay = ngay;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

    @Override
    public String toString() {
        return "NgayThang{" + "thang=" + thang + ", ngay=" + ngay + ", nam=" + nam + '}';
    }
    
    
}
