
package BaiTap3;

public class SinhVienIT extends SinhVienPoly{
    private double diemJava;
    private double diemHTML;
    private double diemCss;
    
    public SinhVienIT(double diemJava, double diemHTML, double diemCss, String hoTen, String nganh) {
        super(hoTen, nganh);
        this.diemJava = diemJava;
        this.diemHTML = diemHTML;
        this.diemCss = diemCss;
    }

    public double getDiemJava() {
        return diemJava;
    }

    public void setDiemJava(double diemJava) {
        this.diemJava = diemJava;
    }

    public double getDiemHTML() {
        return diemHTML;
    }

    public void setDiemHTML(double diemHTML) {
        this.diemHTML = diemHTML;
    }

    public double getDiemCss() {
        return diemCss;
    }

    public void setDiemCss(double diemCss) {
        this.diemCss = diemCss;
    }
    
    
    @Override
    public double getDiem() {
        return (2*getDiemJava() + getDiemHTML() + getDiemCss())/4;
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Điểm: "+getDiem());
        System.out.println("Học lực: "+getHocLuc());
    }
    
}
