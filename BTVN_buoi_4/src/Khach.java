import java.util.Scanner;
import java.util.ArrayList;
import java.util.Formatter;
public class Khach {
    Scanner sc = new Scanner(System.in);
    public void chucNangKhach(ArrayList<Vo> voGhi,ArrayList<But_Chi> butChi,ArrayList<But_Muc> butMuc, ArrayList<Sach> sach){
        System.out.println("|---------------------------|");
        System.out.println("|Các chức năng của khách:   |");
        System.out.println("|1. Tìm kiếm sản phẩm       |");
        System.out.println("|2. Xem danh sách sản phẩm  |");
        System.out.println("|3. Đăng xuất               |");
        System.out.println("|---------------------------|");
        while (true){
            System.out.println("Vui lòng chọn chức năng: ");
            int cn = Integer.parseInt(sc.nextLine());
            switch (cn){
                case 1:
                    timKiemSP(voGhi, butChi, butMuc, sach);
                    break;
                case 2:
                    xemDanhSach(voGhi, butChi, butMuc, sach);
                    break;
                case 3:
                    System.out.println("Bạn đã đăng xuất thành công!!");
                default:
                    break;
            }
        }
    }
    public void timKiemSP(ArrayList<Vo> voGhi,ArrayList<But_Chi> butChi,ArrayList<But_Muc> butMuc, ArrayList<Sach> sach){
        System.out.println("Nhập từ khóa: ");
        String tuKhoa = sc.nextLine();
        System.out.println("1. Hiển thị dạng bảng.");
        System.out.println("2. Hiển thị dạng danh sách.");
        System.out.println("Mời chọn dạng hiển thị: ");
        int id = Integer.parseInt(sc.nextLine());
        while(true){
            switch (id){
                case 1:
                    System.out.println("Dưới đây là bảng danh sách sản phẩm:");
                    System.out.println("--------------------------------------------");
                    System.out.printf("|%-10s|%-10s|%-10s|%-10s|","Tên sản phẩm","Giá bán","Thương hiệu","Thông tin thêm");
                    // em chưa thể làm dạng bảng ạ.
                    break;
                case 2:
                    System.out.println("Dưới đây là danh sách sản phẩm:");
                    System.out.println("--------------------------------------------");
                    for(Sach textbook:sach){
                        if(textbook.kiemTra(tuKhoa)){
                            System.out.println("------");
                            textbook.inDanhSach();
                        }
                    }
                    for(Vo vo:voGhi){
                        if(vo.kiemTra(tuKhoa)){
                            System.out.println("------");
                            vo.inDanhSach();
                        }
                    }
                    for (But_Chi chi:butChi){
                        if(chi.kiemTra(tuKhoa)){
                            System.out.println("------");
                            chi.inDanhSach();
                        }
                    }
                    for (But_Muc muc:butMuc){
                        if (muc.kiemTra(tuKhoa)){
                            System.out.println("------");
                            muc.inDanhSach();
                        }
                    }
                    System.out.println("------");
                    break;
                default:
                    return;
            }
        }
    }
    public void xemDanhSach(ArrayList<Vo> voGhi,ArrayList<But_Chi> butChi,ArrayList<But_Muc> butMuc, ArrayList<Sach> sach){
        System.out.println("Toàn bộ sản phẩm của cửa hàng hiện tại: ");
        int id= 1;
        for (Sach textbook: sach){
            System.out.println("------");
            System.out.println("Thu tu "+id);
            textbook.inDanhSach();
            id++;
        }
        id =1;
        for(Vo vo:voGhi){
            System.out.println("------");
            System.out.println("Thu tu "+id);
            vo.inDanhSach();
            id++;
        }
        id =1;
        for (But_Chi chi:butChi){
            System.out.println("------");
            System.out.println("Thu tu "+id);
            chi.inDanhSach();
            id++;
        }
        id =1;
        for (But_Muc muc : butMuc){
            System.out.println("------");
            System.out.println("Thu tu "+id);
            muc.inDanhSach();
            id++;
        }
        System.out.println("------");
    }
}
