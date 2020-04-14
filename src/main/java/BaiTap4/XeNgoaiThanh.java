
package BaiTap4;

public class XeNgoaiThanh extends ChuyenXe{
    private String noiDen;
    private double soNgayDi;

    public XeNgoaiThanh(String noiDen, double soNgayDi, String maChuyenXe, String hoTenTaiXe, String soXe, double doanhThu) {
        super(maChuyenXe, hoTenTaiXe, soXe, doanhThu);
        this.noiDen = noiDen;
        this.soNgayDi = soNgayDi;
    }
   
    public XeNgoaiThanh() {
    }

    public String getNoiDen() {
        return noiDen;
    }

    public void setNoiDen(String noiDen) {
        this.noiDen = noiDen;
    }

    public double getSoNgayDi() {
        return soNgayDi;
    }

    public void setSoNgayDi(double soNgayDi) {
        this.soNgayDi = soNgayDi;
    }
    
    
    
}
