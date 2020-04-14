
package BaiTap1;

public class Main1 {

    public static void main(String[] args) {
        NhanVien nv1 = new NhanVien("Thoa Dinh", "22", "Khanh Hoà", 1500, 200);
        NhanVien nv2 = new NhanVien("Thu Pham", "22", "Khanh Hoà", 1000, 150);
        
        System.out.println("-------------------------");
        System.out.println(nv1.getThongTin());
        System.out.println(nv2.getThongTin());
    }
    
}
