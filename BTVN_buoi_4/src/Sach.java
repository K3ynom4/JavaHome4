
public class Sach {
    private String tenSP,tacGia,theLoai,namXban,ngonNgu,nhaXban;
    private int giaBan;
    public Sach(String tenSP,String tacGia,String theLoai,String namXban,String nhaXban, String ngonNgu,int giaBan){
        this.tenSP= tenSP;
        this.tacGia=tacGia;
        this.theLoai=theLoai;
        this.namXban = namXban;
        this.ngonNgu = ngonNgu;
        this.giaBan = giaBan;
        this.nhaXban = nhaXban;
    }
    public Sach(){
    }
    public String getTenSP() {
        return tenSP;
    }
    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public String getTacGia(){
        return tacGia;
    }
    public String getTheLoai(){
        return theLoai;
    }
    public void setTheLoai(String theLoai){
        this.theLoai= theLoai;
    }

    public String getNamXban() {
        return namXban;
    }

    public void setNamXban(String namXban) {
        this.namXban = namXban;
    }

    public void setGiaBan(int giaBan) {
        this.giaBan = giaBan;
    }

    public int getGiaBan() {
        return giaBan;
    }

    public String getNgonNgu() {
        return ngonNgu;
    }

    public void setNgonNgu(String ngonNgu) {
        this.ngonNgu = ngonNgu;
    }

    public String getNhaXban() {
        return nhaXban;
    }

    public void setNhaXban(String nhaXban) {
        this.nhaXban = nhaXban;
    }

    public boolean kiemTra(String tuKhoa){
        String giaBan_String = String.valueOf(this.giaBan);
        return giaBan_String.equals(tuKhoa) || tenSP.equals(tuKhoa) || tacGia.equals(tuKhoa) || theLoai.equals(tuKhoa)
                || nhaXban.equals(tuKhoa) || namXban.equals(tuKhoa) || ngonNgu.equals(tuKhoa);
    }
    public void inDanhSach(){
        System.out.println("Tên sản phẩm: "+tenSP);
        System.out.println("Giá bán: "+giaBan);
        System.out.println("Thể loại: "+theLoai);
        System.out.println("Tác giả: "+tacGia);
        System.out.println("Nhà xuất bản: "+nhaXban);
        System.out.println("Năm xuất bản: "+ namXban);
        System.out.println("Ngôn ngữ: "+ngonNgu);
    }
}


