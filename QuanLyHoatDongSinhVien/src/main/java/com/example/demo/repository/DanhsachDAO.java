package com.example.demo.repository;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import com.example.demo.service.Connect;

import com.example.demo.entity.Danhsach;

 
public class DanhsachDAO extends JdbcDaoSupport{
     
    private Connection conn;
    private PreparedStatement ps;

     
    public void insertListBooks(List<Danhsach> listBooks) {
        try {
            conn =Connect.connect();
            // Sét tự động commit false, để chủ động điều khiển
            conn.setAutoCommit(false);
             
            String sql = "INSERT INTO Danhsach(TT, MASV, HovaTen, Ngaysinh,Lop, B1, B2, B3, B4, B5) VALUES (?, ?, ?, ?, ?, ?, ? ,?, ?, ?)";
            ps = conn.prepareStatement(sql);
            for (Danhsach book : listBooks) {
                ps.setInt(1, book.getTT());
                ps.setString(2, book.getMASV());
                ps.setString(3, book.getHovaTen());
                ps.setString(4, book.getNgaysinh());
                ps.setString(5, book.getLop());
                ps.setString(6, book.getB1());
                ps.setString(7, book.getB2());
                ps.setString(8, book.getB3());
                ps.setString(9, book.getB4());	
                ps.setString(10, book.getB5());
                ps.addBatch();
            }
             
            ps.executeBatch();
             
            // Gọi commit() để commit giao dịch với DB
            conn.commit();
             
            System.out.println("Record is inserted into BOOK table!");
             
        } catch (Exception e) {
             
            e.printStackTrace();
            Connect.rollbackQuietly(conn);
            System.out.println("Ket noi hong");
             
        } finally {
             
            try {
                if (ps != null)
                    ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
             
            Connect.disconnect(conn);
        }
    }
     
}

