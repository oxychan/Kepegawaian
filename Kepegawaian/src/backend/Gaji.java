package backend;

import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author taufik
 */
public class Gaji {
    private int idGaji;
    private JenisGaji jenisGaji = new JenisGaji();
    private String namaGaji;

    public Gaji() {
    }

    public Gaji(int idGaji, JenisGaji jenisGaji, String namaGaji) {
        this.idGaji = idGaji;
        this.jenisGaji = jenisGaji;
        this.namaGaji = namaGaji;
    }

    public String toString() {
        return namaGaji;
    }
    
    public int getIdGaji() {
        return idGaji;
    }

    public void setIdGaji(int idGaji) {
        this.idGaji = idGaji;
    }

    public JenisGaji getJenisGaji() {
        return jenisGaji;
    }

    public void setJenisGaji(JenisGaji jenisGaji) {
        this.jenisGaji = jenisGaji;
    }

    public String getNamaGaji() {
        return namaGaji;
    }

    public void setNamaGaji(String namaGaji) {
        this.namaGaji = namaGaji;
    }
    
     public Gaji getById(int id) {
        Gaji gaji = new Gaji();
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM gaji WHERE id_gaji='" + id + "'");
        
        try {
            while(rs.next()) {
                gaji = new Gaji();
                
                gaji.setIdGaji(rs.getInt("id_gaji"));
                gaji.getJenisGaji().setIdJenisGaji(rs.getInt("id_jenis_gaji"));
                gaji.setNamaGaji(rs.getString("nama_gaji"));
            }    
        } catch(Exception e) {
//            System.out.println("error banget");
        }
        
        return gaji;
    }
    
    public ArrayList<Gaji> getAll() {
        ArrayList<Gaji> listGaji = new ArrayList();
        
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM gaji");
        
        try {
            while(rs.next()) {
                Gaji gaji = new Gaji();
                
                gaji.setIdGaji(rs.getInt("id_gaji"));
                gaji.getJenisGaji().setIdJenisGaji(rs.getInt("id_jenis_gaji"));
                gaji.setNamaGaji(rs.getString("nama_gaji"));
                
                listGaji.add(gaji);
            }
                    
        } catch(Exception e) {
//            System.out.println("gagal getall");
        }
        
        return listGaji;
    } 
         
    public ArrayList<Gaji> search(String keyword) {
        ArrayList<Gaji> list = new ArrayList();
       
        
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM gaji " + 
                                            " WHERE id_gaji LIKE '%" + keyword + "%'" + 
                                            " OR nama_gaji LIKE '%" + keyword + "%'");
        
        try {
            while(rs.next()) {
                 Gaji gaji = new Gaji();
                gaji.setIdGaji(rs.getInt("id_gaji"));
                gaji.getJenisGaji().setIdJenisGaji(rs.getInt("id_jenis_gaji"));
                gaji.setNamaGaji(rs.getString("nama_gaji"));
                
                list.add(gaji);
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
    public void save() {
        if (getById(idGaji).getIdGaji() == 0) {
            String SQL = "INSERT INTO gaji (id_jenis_gaji, nama_gaji) VALUES ("
                    + "     '" + this.getJenisGaji().getIdJenisGaji() + "', "
                    + "     '" + this.namaGaji + "' "
                    + " )";
            this.idGaji = DBHelper.insertQueryGetId(SQL);
        } else {
            String SQL = "UPDATE gaji SET "
                    + " id_jenis_gaji='" + this.getJenisGaji().getIdJenisGaji() + "', "
                    + " nama_gaji='" + this.namaGaji + "' "
                    + " WHERE id_gaji='" + this.idGaji + "' ";
            DBHelper.executeQuery(SQL);
        }
    }
    
    public void delete() {
        String SQL = "DELETE FROM gaji WHERE id_gaji='" + this.idGaji + "'";
        DBHelper.executeQuery(SQL);
    }
    
}
