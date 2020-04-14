
package BaiTap1;

public class NhanVien {
    private String ten;
    private String tuoi;
    private String diaChi;
    private double tienLuong;
    private int tongSoGioLam;

    public NhanVien() {
    }

    public NhanVien(String ten, String tuoi, String diaChi, double tienLuong, int tongSoGioLam) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.tienLuong = tienLuong;
        this.tongSoGioLam = tongSoGioLam;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTuoi() {
        return tuoi;
    }

    public void setTuoi(String tuoi) {
        this.tuoi = tuoi;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public double getTienLuong() {
        return tienLuong;
    }

    public void setTienLuong(double tienLuong) {
        this.tienLuong = tienLuong;
    }

    public int getTongSoGioLam() {
        return tongSoGioLam;
    }

    public void setTongSoGioLam(int tongSoGioLam) {
        this.tongSoGioLam = tongSoGioLam;
    }
    
    public String getThongTin(){
        return "Ten: "+getTen()+" ,DiaChi: "+getDiaChi()+" ,Tuoi: "+getTuoi()+" ,TienLuong: "+getTienLuong()+" ,TongSoGioLam: "+getTongSoGioLam()+" ,TienThuong: "+tinhThuong();
    }
    public double tinhThuong(){
        if(getTongSoGioLam() >= 200)
            return getTienLuong()*0.2;
        else if(getTongSoGioLam() < 200 && getTongSoGioLam() >= 100)
            return getTienLuong()*0.1;
        else return 0;
    }
    
}
