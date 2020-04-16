
package BaiTap4;

public class main4 {

    public static void main(String[] args) {
         XeNoiThanh xe1 = new XeNoiThanh(100,"Nha Trang - Ninh Hoa", "XeNoiThanh01", "Nguyen Van A", "123456", 120000);
         XeNoiThanh xe2 = new XeNoiThanh(150,"Nha Trang - Van Gia", "XeNoiThanh02", "Nguyen Van B", "12345", 100000);
         XeNoiThanh xe3 = new XeNoiThanh(200,"Nha Trang - Cam Ranh", "XeNoiThanh03", "Nguyen Van C", "1234", 150000);
         
         XeNgoaiThanh xe4 = new XeNgoaiThanh("Sai Gon", 1, "XeNgoaiThanh01", "Phan Van A", "12345", 1500000);
         XeNgoaiThanh xe5 = new XeNgoaiThanh("Ha Noi", 2, "XeNgoaiThanh02", "Phan Van B", "123456", 100000);
         XeNgoaiThanh xe6 = new XeNgoaiThanh("Da Nang", 3, "XeNgoaiThanh03", "Phan Van C", "1234578", 1200000);
         
         QuanLyChuyenXe qlcx = new QuanLyChuyenXe();
         qlcx.themChuyenXe(xe1);
         qlcx.themChuyenXe(xe2);
         qlcx.themChuyenXe(xe3);
         qlcx.themChuyenXe(xe4);
         qlcx.themChuyenXe(xe5);
         qlcx.themChuyenXe(xe6);
         
         System.out.println("Tong Doang Thu Xe Noi Thanh: "+ qlcx.doanhThuNoiThanh());
         System.out.println("Tong Doanh Thu Xe Ngoai Thanh: "+qlcx.doanhThuNgoaiThanh());
         System.out.println("Tong Doanh Thu: "+ qlcx.tongDoanhThu());
         
         qlcx.inDanhSach();
         
    }
    
}
