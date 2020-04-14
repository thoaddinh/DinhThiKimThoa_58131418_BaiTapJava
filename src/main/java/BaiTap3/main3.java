
package BaiTap3;


public class main3 {

    public static void main(String[] args) {
       SinhVienIT svIT = new SinhVienIT(6, 7, 8, "Thoa Dinh", "CNPM");
       SinhVienBiz svBiz = new SinhVienBiz(7, 6, "Thu Pham", "Ke Toan");
       SinhVienPoly svPoly = new SinhVienIT(7, 8, 8, "Nguyen A", "CNPM");
       
       System.out.println("----------Sinh viên IT----");
       svIT.xuat();
       System.out.println("----------Sinh viên Biz----");
       svBiz.xuat();
       System.out.println("----------Sinh viên Poly----");
       svPoly.xuat();
    }
}
