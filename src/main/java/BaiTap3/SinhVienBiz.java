
package BaiTap3;

public class SinhVienBiz extends SinhVienPoly{
    private double diemMarketing;
    private double diemSale;

    public SinhVienBiz(double diemMarketing, double diemSale, String hoTen, String nganh) {
        super(hoTen, nganh);
        this.diemMarketing = diemMarketing;
        this.diemSale = diemSale;
    }

    public double getDiemMarketing() {
        return diemMarketing;
    }

    public void setDiemMarketing(double diemMarketing) {
        this.diemMarketing = diemMarketing;
    }

    public double getDiemSale() {
        return diemSale;
    }

    public void setDiemSale(double diemSale) {
        this.diemSale = diemSale;
    }
    
    @Override
    public double getDiem() {
        return (2*getDiemMarketing()+ getDiemSale())/3;
    }
        @Override
    public void xuat() {
        super.xuat();
        System.out.println("Điểm: "+getDiem());
        System.out.println("Học lực: "+getHocLuc());
    }
}
