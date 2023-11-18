
public class But_Chi {
    private String tenSP,thHieu,mauSac,chatLieu,doCung;
    private int giaBan;
    public But_Chi(String tenSP,String thHieu,String mauSac,String chatLieu,String doCung,int giaBan){
        this.tenSP = tenSP;
        this.thHieu = thHieu;
        this.chatLieu = chatLieu;
        this.doCung = doCung;
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

    public String getChatLieu() {
        return chatLieu;
    }

    public void setChatLieu(String chatLieu) {
        this.chatLieu = chatLieu;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    public String getDoCung() {
        return doCung;
    }

    public void setDoCung(String doCung) {
        this.doCung = doCung;
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
                || chatLieu.equals(tuKhoa) || doCung.equals(tuKhoa);
    }
    public void inDanhSach(){
        System.out.println("Tên sản phẩm: "+tenSP);
        System.out.println("Giá bán: "+giaBan);
        System.out.println("Thương hiệu: "+thHieu);
        System.out.println("Màu sắc: "+mauSac);
        System.out.println("Chất liệu: "+chatLieu);
        System.out.println("Độ cứng: "+doCung);
    }
}
