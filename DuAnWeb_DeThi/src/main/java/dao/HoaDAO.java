/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import context.DbContext;
import dto.Hoa;
import static java.nio.file.Files.list;
import static java.rmi.Naming.list;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import static java.util.Collections.list;

/**
 *
 * @author ChuongHuynh
 */
public class HoaDAO {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public ArrayList<Hoa> gettop5() {
        ArrayList<Hoa> list = new ArrayList<>();
        conn = new DbContext().getConnection();
        String sql = "select top 5 * from Hoa order by ngaycapnhat desc";
        try {
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Hoa(rs.getInt(1), rs.getString(2),
                        rs.getInt(3), rs.getString(4),
                        rs.getInt(5), rs.getDate(6)));

            }
        } catch (Exception e) {
            System.out.println("hello" + e.toString());
        }
        return list;
    }

    public ArrayList<Hoa> getByCatID(int catId) {
        ArrayList<Hoa> list = new ArrayList<>();
        conn = new DbContext().getConnection();
        String sql = "select * from hoa where maloai=?";
        try {
            ps = conn.prepareStatement(sql);
            ps.setInt(1,catId);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Hoa(rs.getInt(1), rs.getString(2),
                        rs.getInt(3), rs.getString(4),
                        rs.getInt(5), rs.getDate(6)));

            }
        } catch (Exception e) {
            System.out.println("hello" + e.toString());
        }
        return list;
    }
    
    public static void main(String[] args) {
        HoaDAO dao = new HoaDAO();
        for(Hoa x: dao.getByCatID(3))
        {
            System.out.println(x);
        }
    }
}
