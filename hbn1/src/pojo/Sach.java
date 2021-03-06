package pojo;
// Generated Apr 2, 2018 7:23:16 PM by Hibernate Tools 4.3.1




public class Sach  implements java.io.Serializable {


     private String maSach;
     private String tenSach;
     private String tacGia;
     private Double giaBan;
     private Integer soLuong;
     private DanhMuc danhMuc;
     private String hinhAnh;

    public Sach() {
    }

	
    public Sach(String maSach) {
        this.maSach = maSach;
    }
    public Sach(String maSach, String tenSach, String tacGia, Double giaBan, Integer soLuong, DanhMuc danhMuc, String hinhAnh) {
       this.maSach = maSach;
       this.tenSach = tenSach;
       this.tacGia = tacGia;
       this.giaBan = giaBan;
       this.soLuong = soLuong;
       this.danhMuc = danhMuc;
       this.hinhAnh = hinhAnh;
    }
   
    public String getMaSach() {
        return this.maSach;
    }
    
    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }
    public String getTenSach() {
        return this.tenSach;
    }
    
    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }
    public String getTacGia() {
        return this.tacGia;
    }
    
    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }
    public Double getGiaBan() {
        return this.giaBan;
    }
    
    public void setGiaBan(Double giaBan) {
        this.giaBan = giaBan;
    }
    public Integer getSoLuong() {
        return this.soLuong;
    }
    
    public void setSoLuong(Integer soLuong) {
        this.soLuong = soLuong;
    }
    public DanhMuc getDanhMuc() {
        return this.danhMuc;
    }
    
    public void setDanhMuc(DanhMuc danhMuc) {
        this.danhMuc = danhMuc;
    }
    public String getHinhAnh() {
        return this.hinhAnh;
    }
    
    public void setHinhAnh(String hinhAnh) {
        this.hinhAnh = hinhAnh;
    }




}


