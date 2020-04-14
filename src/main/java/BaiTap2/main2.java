package BaiTap2;

import BaiTap1.NhanVien;

public class main2 {

    public static void main(String[] args) {
        QuanLyNhanVien qlnv = new QuanLyNhanVien();
        
        NhanVien nv1 = new NhanVien("Thoa Dinh", "22", "Khanh Hoà", 1500, 200);
        NhanVien nv2 = new NhanVien("Thu Pham", "22", "Khanh Hoà", 1000, 150);
        NhanVien nv3 = new NhanVien("Ngyen A", "22", "Khanh Hoà", 2000, 100);
        NhanVien nv4 = new NhanVien("Nguyen B", "22", "Khanh Hoà", 2500, 150);
        NhanVien nv5 = new NhanVien("Nguyen C", "22", "Khanh Hoà", 1500, 200);
        //add 5 nv
        qlnv.them(nv1);
        qlnv.them(nv2);
        qlnv.them(nv3);
        qlnv.them(nv4);
        qlnv.them(nv5);
        //in ds nhan vien
        qlnv.inDS();
    }
    
}
