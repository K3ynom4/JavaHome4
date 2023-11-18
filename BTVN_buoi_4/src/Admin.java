import java.util.ArrayList;
import java.util.Scanner;
public class Admin {
    Scanner sc = new Scanner(System.in);
    public void thaoTacAdmin(ArrayList<Vo> voGhi,ArrayList<But_Chi>butChi, ArrayList<But_Muc> butMuc, ArrayList<Sach> sach){
        System.out.println("|--------------------------|");
        System.out.println("|Các chức năng của Admin:  |");
        System.out.println("|1. Thêm vở ghi            |");
        System.out.println("|2. Sửa vở ghi             |");
        System.out.println("|3. Xóa vở ghi             |");
        System.out.println("|4. Thêm bút chì           |");
        System.out.println("|5. Sửa bút chì            |");
        System.out.println("|6. Xóa bút chì            |");
        System.out.println("|7. Thêm bút mực           |");
        System.out.println("|8. Sửa bút mực            |");
        System.out.println("|9. Xóa bút mực            |");
        System.out.println("|10. Thêm sách mới         |");
        System.out.println("|11. Sửa sách              |");
        System.out.println("|12. Xóa sách              |");
        System.out.println("|13. Xem danh sách sản phẩm|");
        System.out.println("|14. Đăng xuất             |");
        System.out.println("|--------------------------|");
        while(true){
            System.out.println("Hãy chọn chức năng: ");
            int cn= Integer.parseInt(sc.nextLine());
            switch (cn){
                case 1:
                    themVoGhi(voGhi);
                    break;
                case 2:
                    suaVoghi(voGhi);
                    break;
                case 3:
                    xoaVoGhi(voGhi);
                    break;
                case 4:
                    themButChi(butChi);
                    break;
                case 5:
                    suaButChi(butChi);
                    break;
                case 6:
                    xoaButChi(butChi);
                    break;
                case 7:
                    themButMuc(butMuc);
                    break;
                case 8:
                    suaButMuc(butMuc);
                    break;
                case 9:
                    xoaButMuc(butMuc);
                    break;
                case 10:
                    themSachmoi(sach);
                    break;
                case 11:
                    suaSach(sach);
                    break;
                case 12:
                    xoaSach(sach);
                    break;
                case 13:
                    xemDanhSach(voGhi, butChi, butMuc, sach);
                    break;
                case 14:
                    System.out.println("Đã đăng xuất khỏi Admin");
                    return;
                default:
                    break;
            }
        }
    }

    public void themVoGhi(ArrayList<Vo> voGhi){
        String tenSP,thHieu,loaiVo,mauSacBia,chatLieu,kichThuoc;
        int giaBan,soTrang;
        System.out.print("Tên vở ghi mới: ");
        tenSP = sc.nextLine();
        System.out.print("Giá bán mới: ");
        giaBan = Integer.parseInt(sc.nextLine());
        System.out.print("Thương hiệu vở ghi mới: ");
        thHieu = sc.nextLine();
        System.out.print("Số trang của vở ghi mới: ");
        soTrang = Integer.parseInt(sc.nextLine());
        System.out.print("Loại vở mới(kẻ ô,kẻ ngang,kẻ caro): ");
        loaiVo = sc.nextLine();
        System.out.print("Màu sắc bìa mới: ");
        mauSacBia = sc.nextLine();
        System.out.print("Chất liệu vở ghi mới(giấy trắng,giấy màu): ");
        chatLieu = sc.nextLine();
        System.out.print("Kích thước của vở mới(A4,A5,A6): ");
        kichThuoc = sc.nextLine();
        Vo voMoi= new Vo(tenSP,thHieu,loaiVo,mauSacBia,chatLieu,kichThuoc,giaBan,soTrang);
        voGhi.add(voMoi);
        System.out.println("Đã thêm thành công.");
    }
    public void suaVoghi(ArrayList<Vo> voGhi){
        System.out.println("Nhập thứ tự vở ghi bạn muốn sửa: ");
        int id = Integer.parseInt(sc.nextLine());
        String tenSP,thHieu,loaiVo,mauSacBia,chatLieu,kichThuoc;
        int giaBan,soTrang;
        System.out.print("Tên vở ghi muốn sửa là: ");
        tenSP = sc.nextLine();
        System.out.print("Giá bán bạn muốn là: ");
        giaBan = Integer.parseInt(sc.nextLine());
        System.out.print("Thương hiệu vở ghi bạn muốn là: ");
        thHieu = sc.nextLine();
        System.out.print("Số trang bạn muốn là: ");
        soTrang = Integer.parseInt(sc.nextLine());
        System.out.print("Loại vở bạn muốn là: ");
        loaiVo = sc.nextLine();
        System.out.print("Màu sắc bìa bạn muốn là: ");
        mauSacBia = sc.nextLine();
        System.out.print("Chất liệu bạn muốn là: ");
        chatLieu = sc.nextLine();
        System.out.print("Kích thước bạn muốn là: ");
        kichThuoc = sc.nextLine();
        voGhi.get(id-1).setTenSP(tenSP);
        voGhi.get(id-1).setGiaBan(giaBan);
        voGhi.get(id-1).setThHieu(thHieu);
        voGhi.get(id-1).setSoTrang(soTrang);
        voGhi.get(id-1).setLoaiVo(loaiVo);
        voGhi.get(id-1).setMauSacBia(mauSacBia);
        voGhi.get(id-1).setChatLieu(chatLieu);
        voGhi.get(id-1).setKichThuoc(kichThuoc);
        System.out.println("Đã sửa thành công.");
    }
    public void xoaVoGhi(ArrayList<Vo> voGhi){
        System.out.println("Nhập thứ tự bạn muốn xóa: ");
        int id = Integer.parseInt(sc.nextLine());
        if(id <= voGhi.size()){
            voGhi.remove(id-1);
            System.out.println("Đã xóa thành công.");
        }
        else System.out.println("Không thể thực hiện thao tác.");
    }
    public void themButChi(ArrayList<But_Chi> butChi){
        String tenSP,thHieu,mauSac,chatLieu,doCung;
        int giaBan;
        System.out.println("Tên bút chì mới: ");
        tenSP = sc.nextLine();
        System.out.println("Giá bút chì mới: ");
        giaBan = Integer.parseInt(sc.nextLine());
        System.out.println("Thương hiệu bút chì mới: ");
        thHieu= sc.nextLine();
        System.out.println("Màu sắc bút chì mới: ");
        mauSac = sc.nextLine();
        System.out.println("Chất liệu bút chì mới(Gỗ, nhựa): ");
        chatLieu = sc.nextLine();
        System.out.println("Độ cứng bút chì mới(HB,2B,3B,4B,5B,6B,7B,8B,9B,10B): ");
        doCung = sc.nextLine();
        But_Chi chi= new But_Chi(tenSP,thHieu,mauSac,chatLieu,doCung,giaBan);
        butChi.add(chi);
        System.out.println("Đã thêm thành công");
    }
    public void suaButChi(ArrayList<But_Chi> butChi){
        String tenSP,thHieu,mauSac,chatLieu,doCung;
        int giaBan;
        System.out.println("Nhập thứ tự bạn muốn sửa:");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Tên bút chì muốn là: ");
        tenSP = sc.nextLine();
        System.out.println("Giá bút chì muốn là: ");
        giaBan = Integer.parseInt(sc.nextLine());
        System.out.println("Thương hiệu bút chì muốn là: ");
        thHieu= sc.nextLine();
        System.out.println("Màu sắc bút chì muốn là: ");
        mauSac = sc.nextLine();
        System.out.println("Chất liệu bút chì muốn là: ");
        chatLieu = sc.nextLine();
        System.out.println("Độ cứng bút chì muốn là: ");
        doCung = sc.nextLine();
        butChi.get(id-1).setTenSP(tenSP);
        butChi.get(id-1).setGiaBan(giaBan);
        butChi.get(id-1).setThHieu(thHieu);
        butChi.get(id-1).setMauSac(mauSac);
        butChi.get(id-1).setDoCung(doCung);
        butChi.get(id-1).setChatLieu(chatLieu);
        System.out.println("Bạn đã sửa thành công.");

    }
    public void xoaButChi(ArrayList<But_Chi> butChi){
        System.out.println("Nhập thứ tự bạn muốn xóa: ");
        int id = Integer.parseInt(sc.nextLine());
        if(id<= butChi.size()){
            butChi.remove(id-1);
            System.out.println("Đã xóa thành công");
        } else System.out.println("Không thể thực hiện thao tác.");
    }
    public void themButMuc(ArrayList<But_Muc> butMuc){
        String tenSP,thHieu,mauSac,chatLieu,loaiMuc,doMin;
        int giaBan;
        System.out.println("Tên bút mực mới: ");
        tenSP = sc.nextLine();
        System.out.println("Giá bút mực mới: ");
        giaBan = Integer.parseInt(sc.nextLine());
        System.out.println("Thương hiệu bút mực mới: ");
        thHieu = sc.nextLine();
        System.out.println("Màu sắc bút mực mới: ");
        mauSac = sc.nextLine();
        System.out.println("Chất liệu bút mực mới(Nhựa, kim loại): ");
        chatLieu= sc.nextLine();
        System.out.println("Loại mực bút mực mới(mực dầu, mực nước): ");
        loaiMuc = sc.nextLine();
        System.out.println("Độ mịn bứt mực mới(0.5mm, 0.7mm, 1mm, 1.5mm, 2mm, 2.5mm, 3mm, 3.5mm, 4mm, 4.5mm, 5mm): ");
        doMin = sc.nextLine();
        But_Muc muc = new But_Muc(tenSP,thHieu,mauSac,chatLieu,loaiMuc,doMin,giaBan);
        butMuc.add(muc);
        System.out.println("Đã thêm thành công.");
    }
    public void suaButMuc(ArrayList<But_Muc> butMuc){
        System.out.println("Nhập thứ tự bạn muốn sửa: ");
        int id = Integer.parseInt(sc.nextLine());
        String tenSP,thHieu,mauSac,chatLieu,loaiMuc,doMin;
        int giaBan;
        System.out.println("Tên bút mực muốn là: ");
        tenSP = sc.nextLine();
        System.out.println("Giá bút mực muốn là: ");
        giaBan = Integer.parseInt(sc.nextLine());
        System.out.println("Thương hiệu bút mực sửa là: ");
        thHieu = sc.nextLine();
        System.out.println("Màu sắc bút mực muốn sửa là: ");
        mauSac = sc.nextLine();
        System.out.println("Chất liệu bút mực muon sua la(Nhựa, kim loại): ");
        chatLieu= sc.nextLine();
        System.out.println("Loại mực bút mực muốn sửa là(mực dầu, mực nước): ");
        loaiMuc = sc.nextLine();
        System.out.println("Độ mịn bứt mực muốn sửa là(0.5mm, 0.7mm, 1mm, 1.5mm, 2mm, 2.5mm, 3mm, 3.5mm, 4mm, 4.5mm, 5mm): ");
        doMin = sc.nextLine();
        butMuc.get(id-1).setTenSP(tenSP);
        butMuc.get(id-1).setGiaBan(giaBan);
        butMuc.get(id-1).setThHieu(thHieu);
        butMuc.get(id-1).setMauSac(mauSac);
        butMuc.get(id-1).setChatLieu(chatLieu);
        butMuc.get(id-1).setLoaiMuc(loaiMuc);
        butMuc.get(id-1).setDoMin(doMin);
        System.out.println("Đã sửa thành công.");
    }
    public void xoaButMuc(ArrayList<But_Muc> butMuc){
        System.out.println("Nhập thứ tự bạn muốn xóa: ");
        int id = Integer.parseInt(sc.nextLine());
        if(id<= butMuc.size()) {
            butMuc.remove(id-1);
            System.out.println("Đã xóa thành công.");

        }
        else System.out.println("Không thể thực hiện thao tác.");
    }
    public void themSachmoi(ArrayList<Sach> sach){
        String tenSP,tacGia,theLoai,namXban,ngonNgu,nhaXban;
        int giaBan;
        System.out.println("Tên sách mới là: ");
        tenSP = sc.nextLine();
        System.out.println("Giá bán sách mới là: ");
        giaBan = Integer.parseInt(sc.nextLine());
        System.out.println("Tên tác giá là: ");
        tacGia = sc.nextLine();
        System.out.println("Thể loại của sách mới là: ");
        theLoai = sc.nextLine();
        System.out.println("Nhà xuất bản của sách mới là: ");
        nhaXban = sc.nextLine();
        System.out.println("Năm xuất bản của sách mới là: ");
        namXban = sc.nextLine();
        System.out.println("Ngôn ngữ của sách mới là: ");
        ngonNgu = sc.nextLine();
        Sach sachMoi= new Sach(tenSP,tacGia,theLoai,namXban,ngonNgu,nhaXban,giaBan);
        sach.add(sachMoi);
        System.out.println("Đã thêm sách thành công.");
    }
    public void suaSach(ArrayList<Sach> sach){
        System.out.println("Nhập thứ tự sách muốn sửa: ");
        int id = Integer.parseInt(sc.nextLine());
        String tenSP,tacGia,theLoai,namXban,ngonNgu,nhaXban;
        int giaBan;
        System.out.println("Tên sách sửa là: ");
        tenSP = sc.nextLine();
        System.out.println("Giá bán sách sửa là: ");
        giaBan = Integer.parseInt(sc.nextLine());
        System.out.println("Tên tác giá sửa là: ");
        tacGia = sc.nextLine();
        System.out.println("Thể loại của sách sửa là: ");
        theLoai = sc.nextLine();
        System.out.println("Nhà xuất bản của sách sửa là: ");
        nhaXban = sc.nextLine();
        System.out.println("Năm xuất bản của sách sửa là: ");
        namXban = sc.nextLine();
        System.out.println("Ngôn ngữ của sách sửa là: ");
        ngonNgu = sc.nextLine();
        sach.get(id-1).setTenSP(tenSP);
        sach.get(id-1).setGiaBan(giaBan);
        sach.get(id-1).setTacGia(tacGia);
        sach.get(id-1).setTheLoai(theLoai);
        sach.get(id-1).setNhaXban(nhaXban);
        sach.get(id-1).setNamXban(namXban);
        sach.get(id-1).setNgonNgu(ngonNgu);
        System.out.println("Đã sửa sách thành công.");
    }
    public void xoaSach(ArrayList<Sach> sach){
        System.out.println("Nhập thứ tự sách muốn xóa: ");
        int id = Integer.parseInt(sc.nextLine());
        if (id <= sach.size()){
            sach.remove(id-1);
            System.out.println("Đã xóa sách thành công.");
        } else System.out.println("Không thể thực hiện thao tác");
    }
    public void xemDanhSach(ArrayList<Vo> voGhi,ArrayList<But_Chi> butChi,ArrayList<But_Muc> butMuc, ArrayList<Sach> sach){
        System.out.println("Toàn bộ sản phẩm của cửa hàng hiện tại: ");

        for (Sach textbook: sach){
            System.out.println("------");
            textbook.inDanhSach();
        }
        for(Vo vo:voGhi){
            System.out.println("------");
            vo.inDanhSach();
        }
        for (But_Chi chi:butChi){
            System.out.println("------");
            chi.inDanhSach();
        }
        for (But_Muc muc : butMuc){
            System.out.println("------");
            muc.inDanhSach();
        }
        System.out.println("------");
    }
}
