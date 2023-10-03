/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

import java.sql.Date;

/**
 *
 * @author ChuongHuynh
 */
public class Hoa {
    private int maHoa;
    private String tenHoa; 
    private int Gia;
    private String Hinh;
    private int MaLoai;
    private Date NgayCapNhat;

    public Hoa() {
    }

    public Hoa(int maHoa) {
        this.maHoa = maHoa;
    }

    public Hoa(int maHoa, String tenHoa, int Gia, String Hinh, int MaLoai, Date NgayCapNhat) {
        this.maHoa = maHoa;
        this.tenHoa = tenHoa;
        this.Gia = Gia;
        this.Hinh = Hinh;
        this.MaLoai = MaLoai;
        this.NgayCapNhat = NgayCapNhat;
    }

    public int getMaHoa() {
        return maHoa;
    }

    public void setMaHoa(int maHoa) {
        this.maHoa = maHoa;
    }

    public String getTenHoa() {
        return tenHoa;
    }

    public void setTenHoa(String tenHoa) {
        this.tenHoa = tenHoa;
    }

    public int getGia() {
        return Gia;
    }

    public void setGia(int Gia) {
        this.Gia = Gia;
    }

    public String getHinh() {
        return Hinh;
    }

    public void setHinh(String Hinh) {
        this.Hinh = Hinh;
    }

    public int getMaLoai() {
        return MaLoai;
    }

    public void setMaLoai(int MaLoai) {
        this.MaLoai = MaLoai;
    }

    public Date getNgayCapNhat() {
        return NgayCapNhat;
    }

    public void setNgayCapNhat(Date NgayCapNhat) {
        this.NgayCapNhat = NgayCapNhat;
    }

    @Override
    public String toString() {
        return "Hoa{" + "maHoa=" + maHoa + ", tenHoa=" + tenHoa + ", Gia=" + Gia + ", Hinh=" + Hinh + ", MaLoai=" + MaLoai + ", NgayCapNhat=" + NgayCapNhat + '}';
    }
    
    
    
}
