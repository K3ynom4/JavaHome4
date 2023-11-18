public class But_Muc {
    private String tenSP,thHieu,mauSac,chatLieu,loaiMuc,doMin;
    private int giaBan;
    public But_Muc(String tenSP,String thHieu,String mauSac,String chatLieu,String loaiMuc,String doMin,int giaBan){
        this.tenSP = tenSP;
        this.thHieu = thHieu;
        this.chatLieu = chatLieu;
        this.doMin = doMin;
        this.loaiMuc = loaiMuc;
        this.mauSac = mauSac;
        this.giaBan = giaBan;
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

    public void setChatLieu(String chatLieu) {
        this.chatLieu = chatLieu;
    }

    public String getChatLieu() {
        return chatLieu;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    public String getMauSac() {
        return mauSac;
    }

    public String getLoaiMuc() {
        return loaiMuc;
    }

    public void setLoaiMuc(String loaiMuc) {
        this.loaiMuc = loaiMuc;
    }

    public String getDoMin() {
        return doMin;
    }

    public void setDoMin(String doMin) {
        this.doMin = doMin;
    }

    public int getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(int giaBan) {
        this.giaBan = giaBan;
    }

    public boolean kiemTra(String tuKhoa){
        String giaBan_String= String.valueOf(this.giaBan);
        return giaBan_String.equals(tuKhoa)|| tenSP.equals(tuKhoa) || thHieu.equals(tuKhoa) || mauSac.equals(tuKhoa)
                || chatLieu.equals(tuKhoa) || loaiMuc.equals(tuKhoa) || doMin.equals(tuKhoa);
    }
    public void inDanhSach(){
        System.out.println("Tên sản phẩm: "+tenSP);
        System.out.println("Giá bán: "+giaBan);
        System.out.println("Thương hiệu: "+thHieu);
        System.out.println("Màu sắc: "+mauSac);
        System.out.println("Chất liệu: "+chatLieu);
        System.out.println("Loại mực: "+loaiMuc);
        System.out.println("Độ mịn: "+doMin);
    }
}
