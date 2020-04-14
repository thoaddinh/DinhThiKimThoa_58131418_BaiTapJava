
package BaiTap4;

public class XeNoiThanh extends ChuyenXe{
    private double soKm;
    private String soTuyen;

    public XeNoiThanh(double soKm, String soTuyen, String maChuyenXe, String hoTenTaiXe, String soXe, double doanhThu) {
        super(maChuyenXe, hoTenTaiXe, soXe, doanhThu);
        this.soKm = soKm;
        this.soTuyen = soTuyen;
    }

    public XeNoiThanh() {
    }
    
    public double getSoKm() {
        return soKm;
    }

    public void setSoKm(double soKm) {
        this.soKm = soKm;
    }

    public String getSoTuyen() {
        return soTuyen;
    }

    public void setSoTuyen(String soTuyen) {
        this.soTuyen = soTuyen;
    }

    
}
