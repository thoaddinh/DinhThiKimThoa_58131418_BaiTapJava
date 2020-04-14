
package BaiTap3;

public abstract class SinhVienPoly {
    private String hoTen;
    private String nganh;

    public SinhVienPoly() {
    }

    public SinhVienPoly(String hoTen, String nganh) {
        this.hoTen = hoTen;
        this.nganh = nganh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }
    
    public abstract double getDiem();
    
    public String getHocLuc(){
        if(getDiem() < 5) 
            return "Yếu";
        else if(getDiem() >= 5 && getDiem() < 6.5)
            return "Trung Bình";
        else if(getDiem() >= 6.5 && getDiem() <7.5)
            return "Khá";
        else if(getDiem() >= 7.5 && getDiem() < 9)
            return "Giỏi";
        
        return "Xuất Sắc";
    }
    
    public void xuat(){
        System.out.println("Họ tên: "+ getHoTen());
        System.out.println("Ngành học: "+getNganh());
    }
}
