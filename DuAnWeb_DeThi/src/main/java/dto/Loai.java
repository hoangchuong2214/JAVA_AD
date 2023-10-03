/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

/**
 *
 * @author ChuongHuynh
 */
public class Loai {
    private int MaLoai;
    private String TenLoai;

    public Loai() {
    }

    public Loai(int MaLoai) {
        this.MaLoai = MaLoai;
    }

    public Loai(int MaLoai, String TenLoai) {
        this.MaLoai = MaLoai;
        this.TenLoai = TenLoai;
    }

    public int getMaLoai() {
        return MaLoai;
    }

    public void setMaLoai(int MaLoai) {
        this.MaLoai = MaLoai;
    }

    public String getTenLoai() {
        return TenLoai;
    }

    public void setTenLoai(String TenLoai) {
        this.TenLoai = TenLoai;
    }

    @Override
    public String toString() {
        return "Loai{" + "MaLoai=" + MaLoai + ", TenLoai=" + TenLoai + '}';
    }
    
    
}
