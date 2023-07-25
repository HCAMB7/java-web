package Control;

import java.sql.*;

import Model.MusteriModel;

public class MusteriControl {
    public void musteriEkle(MusteriModel musteri) {
        try {
            // Veritabanı bağlantısı yapılacak
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/musteriler", "root", "");

            // SQL sorgusunu hazırla
            String sql = "INSERT INTO musteriler (musteriID, ad, soyad) VALUES (?, ?, ?)";

            // PreparedStatement nesnesi oluştur
            PreparedStatement pstmt = conn.prepareStatement(sql);

            // Parametreleri ayarla
            pstmt.setString(1, musteri.getMusteriID());
            pstmt.setString(2, musteri.getAd());
            pstmt.setString(3, musteri.getSoyad());

            // Sorguyu çalıştır
            pstmt.executeUpdate();

            // Kaynakları serbest bırak
            pstmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}