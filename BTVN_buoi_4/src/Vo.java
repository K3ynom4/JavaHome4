public class Vo {
    private String tenSP,thHieu,mauSacBia,chatLieu,loaiVo,kichThuoc;
    private int giaBan,soTrang;
    public Vo(String tenSP,String thHieu,String mauSacBia,String chatLieu,String loaiVo,String kichThuoc,int giaBan,int soTrang){
        this.tenSP = tenSP;
        this.thHieu = thHieu;
        this.chatLieu = chatLieu;
        this.loaiVo = loaiVo;
        this.mauSacBia = mauSacBia;
        this.giaBan = giaBan;
        this.kichThuoc = kichThuoc;
        this.soTrang = soTrang;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public String getThHieu() {
        return thHieu;
    }

    public void setThHieu(String thHieu) {
        this.thHieu = thHieu;
    }

    public String getChatLieu() {
        return chatLieu;
    }

    public void setChatLieu(String chatLieu) {
        this.chatLieu = chatLieu;
    }

    public int getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(int giaBan) {
        this.giaBan = giaBan;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    public String getKichThuoc() {
        return kichThuoc;
    }

    public void setKichThuoc(String kichThuoc) {
        this.kichThuoc = kichThuoc;
    }

    public String getLoaiVo() {
        return loaiVo;
    }

    public void setLoaiVo(String loaiVo) {
        this.loaiVo = loaiVo;
    }

    public String getMauSacBia() {
        return mauSacBia;
    }

    public void setMauSacBia(String mauSacBia) {
        this.mauSacBia = mauSacBia;
    }
    public boolean kiemTra(String tuKhoa){
        String giaBan_String= String.valueOf(this.giaBan);
        String soTrang_String = String.valueOf(this.soTrang);
        return giaBan_String.equals(tuKhoa)|| tenSP.equals(tuKhoa) || thHieu.equals(tuKhoa) ||
                mauSacBia.equals(tuKhoa) || chatLieu.equals(tuKhoa) || loaiVo.equals(tuKhoa) ||
                kichThuoc.equals(tuKhoa) || soTrang_String.equals(tuKhoa);
    }
    public void inDanhSach(){
        System.out.println("Tên sản phẩm: "+tenSP);
        System.out.println("Giá bán: "+giaBan);
        System.out.println("Thương hiệu: "+thHieu);
        System.out.println("Số trang: "+soTrang);
        System.out.println("Loại vở: "+loaiVo);
        System.out.println("Màu sắc bìa: "+mauSacBia);
        System.out.println("Chất liệu giấy: "+chatLieu);
        System.out.println("Kích thước: "+kichThuoc);
    }
}
