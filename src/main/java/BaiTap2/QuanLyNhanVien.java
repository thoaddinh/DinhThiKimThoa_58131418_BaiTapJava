
package BaiTap2;

import BaiTap1.NhanVien;
import java.util.ArrayList;

public class QuanLyNhanVien implements IQuanLy{
    ArrayList<NhanVien> nhanviens = new ArrayList<>();
    
    @Override
    public void them(NhanVien nv) {
        nhanviens.add(nv);
    }

    @Override
    public void inDS() {
        int i = 1;
        for (NhanVien nv : nhanviens) {
            System.out.println("----------Nhan Vien "+i+" -------------");
            System.out.println(nv.getThongTin());
            i++;
        }
    }
    
}
