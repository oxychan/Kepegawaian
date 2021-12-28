package backend;

import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author taufik
 */
public class JenisGaji {
    private int idJenisGaji;
    private String namaJenisGaji;
    private int jumlahGaji;

    public JenisGaji() {
    }

    public JenisGaji(int idJenisGaji, String namaJenisGaji, int jumlahGaji) {
        this.idJenisGaji = idJenisGaji;
        this.namaJenisGaji = namaJenisGaji;
        this.jumlahGaji = jumlahGaji;
    }

    public int getIdJenisGaji() {
        return idJenisGaji;
    }

    public void setIdJenisGaji(int idJenisGaji) {
        this.idJenisGaji = idJenisGaji;
    }

    public String getNamaJenisGaji() {
        return namaJenisGaji;
    }

    public void setNamaJenisGaji(String namaJenisGaji) {
        this.namaJenisGaji = namaJenisGaji;
    }

    public int getJumlahGaji() {
        return jumlahGaji;
    }

    public void setJumlahGaji(int jumlahGaji) {
        this.jumlahGaji = jumlahGaji;
    }
    
    public String toString() {
        return namaJenisGaji;
    }
    
    public JenisGaji getById(int id) {
        JenisGaji jenisGaji = new JenisGaji();
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM jenis_gaji WHERE id_jenis='" + id + "'");
        
        try {
            while(rs.next()) {
                jenisGaji = new JenisGaji();
                jenisGaji.setIdJenisGaji(rs.getInt("id_jenis"));
                jenisGaji.setNamaJenisGaji(rs.getString("nama_jenis_gaji"));
                jenisGaji.setJumlahGaji(rs.getInt("jumlah_gaji"));
            }    
        } catch(Exception e) {
            
        }
        
        return jenisGaji;
    }
    
    public ArrayList<JenisGaji> getAll() {
        ArrayList<JenisGaji> listJenisGaji = new ArrayList();
        
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM jenis_gaji");
        
        try {
            while(rs.next()) {
                JenisGaji jenisGaji = new JenisGaji();
                
                jenisGaji.setIdJenisGaji(rs.getInt("id_jenis"));
                jenisGaji.setNamaJenisGaji(rs.getString("nama_jenis_gaji"));
                jenisGaji.setJumlahGaji(rs.getInt("jumlah_gaji"));
                
                listJenisGaji.add(jenisGaji);
            }
                    
        } catch(Exception e) {
            
        }
        
        return listJenisGaji;
    }
    
    public ArrayList<JenisGaji> search(String keyword) {
        ArrayList<JenisGaji> list = new ArrayList();
        
        
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM jenis_gaji " + 
                                            " WHERE id_jenis LIKE '%" + keyword + "%'" + 
                                            " OR nama_jenis_gaji LIKE '%" + keyword + "%'");
        
        try {
            while(rs.next()) {
               JenisGaji jenisGaji  = new JenisGaji();
                jenisGaji.setIdJenisGaji(rs.getInt("id_jenis"));
                jenisGaji.setNamaJenisGaji(rs.getString("nama_jenis_gaji"));
                jenisGaji.setJumlahGaji(rs.getInt("jumlah_gaji"));
                
                list.add(jenisGaji);
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
    public void save() {
        if (getById(idJenisGaji).getIdJenisGaji() == 0) {
            String SQL = "INSERT INTO jenis_gaji (nama_jenis_gaji, jumlah_gaji) VALUES ("
                    + "     '" + this.namaJenisGaji + "', "
                    + "     '" + this.jumlahGaji + "' "
                    + " )";
            this.idJenisGaji = DBHelper.insertQueryGetId(SQL);
        } else {
            String SQL = "UPDATE jenis_gaji SET "
                    + " nama_jenis_gaji='" + this.namaJenisGaji + "', "
                    + " jumlah_gaji='" + this.jumlahGaji + "' "
                    + " WHERE id_jenis='" + this.idJenisGaji + "' ";
            DBHelper.executeQuery(SQL);
        }
    }
    
    public void delete() {
        String SQL = "DELETE FROM jenis_gaji WHERE id_jenis='" + this.idJenisGaji + "'";
        DBHelper.executeQuery(SQL);
    }
}
