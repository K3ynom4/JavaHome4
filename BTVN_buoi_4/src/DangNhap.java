import java.util.ArrayList;
import java.util.Scanner;
public class DangNhap {
    Scanner sc = new Scanner(System.in);
    private String taiKhoan, matKhau;

    public String getTaiKhoan() {
        return taiKhoan;
    }

    public void setTaiKhoan(String taiKhoan) {
        this.taiKhoan = taiKhoan;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }
    public DangNhap(ArrayList<Vo> voGhi, ArrayList<But_Chi> butChi, ArrayList<But_Muc> butMuc, ArrayList<Sach> sach){
        System.out.println("Nhập tài khoản: ");
        taiKhoan = sc.nextLine();
        if(getTaiKhoan().equals("admin")){
            System.out.println("Hãy nhập mật khẩu admin: ");
            matKhau = sc.nextLine();
            if(getMatKhau().equals("admin")){
                System.out.println("Đăng nhập thành công!");
                Admin admin = new Admin();
                admin.thaoTacAdmin(voGhi, butChi, butMuc, sach);
            }
            else System.out.println("Mật khẩu sai, Vui lòng nhập lại!!");
        } else if (getTaiKhoan().equals("khach")) {
            Khach khach = new Khach();
            khach.chucNangKhach(voGhi, butChi, butMuc, sach);
        }
    }
}
