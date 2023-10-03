/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import context.DbContext;
import dto.Hoa;
import dto.Loai;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author ChuongHuynh
 */
public class LoaiDAO {
       
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
        public ArrayList<Loai> getAll() {
            
        ArrayList<Loai> list = new ArrayList<>();
             conn = new DbContext().getConnection();
        String sql = "select * from loai";
        try {
             ps = conn.prepareStatement(sql);
             rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Loai(rs.getInt(1),rs.getString(2)));

            }
        } catch (Exception e) {
            System.out.println("hello" + e.toString());
        }
        return list;
    }
        
            public static void main(String[] args) {
        LoaiDAO dao = new LoaiDAO();
        for(Loai l: dao.getAll())
        {
            System.out.println(l);
        }
    }
}
