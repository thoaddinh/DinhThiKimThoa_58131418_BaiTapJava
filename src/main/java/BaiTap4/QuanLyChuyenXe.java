
package BaiTap4;

import java.util.ArrayList;

public class QuanLyChuyenXe {
    ArrayList<ChuyenXe> chuyenXes = new ArrayList<>();
    
    public void themChuyenXe(ChuyenXe cx){
        chuyenXes.add(cx);
    }
    //Tong danh thu cho từng loại xe 
    public double doanhThuNoiThanh(){
        int sumNT = 0;
        for(ChuyenXe xeNoiThanh : chuyenXes){
            if(xeNoiThanh instanceof XeNoiThanh){
                sumNT += xeNoiThanh.getDoanhThu();
            }
        }
        return sumNT;
    }
    
    public double doanhThuNgoaiThanh(){
       int temp = 0;
       for(ChuyenXe xeNgoaiThanh : chuyenXes){
            if(xeNgoaiThanh instanceof XeNgoaiThanh){
                temp += xeNgoaiThanh.getDoanhThu();
            }
        }
        return temp;
    }
    
    public double tongDoanhThu(){
        return doanhThuNgoaiThanh()+doanhThuNoiThanh();
    }
    
    public void inDanhSach(){
        for (ChuyenXe chuyenXe : chuyenXes) {
            System.out.println("--------------------------");
            System.out.println("Chuyen xe:" + chuyenXe.getMaChuyenXe());
            System.out.println("Ho Ten Tai Xe: "+chuyenXe.getHoTenTaiXe());
            System.out.println("Ma so xe: "+chuyenXe.getSoXe());
            System.out.println("Doanh Thu: "+chuyenXe.getDoanhThu());
            if(chuyenXe instanceof XeNoiThanh){
                System.out.println("So Km: "+((XeNoiThanh) chuyenXe).getSoKm());
                System.out.println("So Tuyen: "+((XeNoiThanh) chuyenXe).getSoTuyen());
            }
            if(chuyenXe instanceof XeNgoaiThanh){
                System.out.println("So Ngay Di: "+ ((XeNgoaiThanh) chuyenXe).getSoNgayDi());
                System.out.println("Noi Den: "+ ((XeNgoaiThanh) chuyenXe).getNoiDen());
            }
        }
            
    }
}
