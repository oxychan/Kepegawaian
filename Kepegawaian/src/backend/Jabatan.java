
package backend;

import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author taufik
 */
public class Jabatan {
    private int idJabatan;
    private String jabatan;

    public Jabatan() {
    }

    public Jabatan(int idJabatan, String jabatan) {
        this.idJabatan = idJabatan;
        this.jabatan = jabatan;
    }

    public int getIdJabatan() {
        return idJabatan;
    }

    public void setIdJabatan(int idJabatan) {
        this.idJabatan = idJabatan;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }
    
    public String toString() {
        return jabatan;
    }
    
    public Jabatan getById(int id) {
        Jabatan jabatan = new Jabatan();
        
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM jabatan "+
                                            " WHERE id_jabatan = '" + id + "'");
        
        try {
            while(rs.next()) {
                jabatan = new Jabatan();
                jabatan.setIdJabatan(rs.getInt("id_jabatan"));
                jabatan.setJabatan(rs.getString("nama_jabatan"));
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
        
        return jabatan;
    }
    
    public ArrayList<Jabatan> getAll() {
        ArrayList<Jabatan> ListJabatan = new ArrayList();
        
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM jabatan");
        
        try {
            while(rs.next()) {
                Jabatan jabatan = new Jabatan();
                jabatan.setIdJabatan(rs.getInt("id_jabatan"));
                jabatan.setJabatan(rs.getString("nama_jabatan"));
                
                ListJabatan.add(jabatan);
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
        
        return ListJabatan;
    }
    
    public ArrayList<Jabatan> search(String keyword) {
        ArrayList<Jabatan> ListJabatan = new ArrayList();
        
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM jabatan WHERE "
                                        + " nama_jabatan LIKE '%" + keyword + "%' "
                                        );
        
        try {
            while(rs.next()) {
                Jabatan jabatan = new Jabatan();
                jabatan.setIdJabatan(rs.getInt("id_jabatan"));
                jabatan.setJabatan(rs.getString("nama_jabatan"));
                
                ListJabatan.add(jabatan);
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
        
        return ListJabatan;
    }
    
    public void save() {
        if(getById(idJabatan).getIdJabatan() == 0) {
            String SQL = "INSERT INTO jabatan (nama_jabatan) VALUES ("
                    + "     '" + this.jabatan + "') ";
            this.idJabatan = DBHelper.insertQueryGetId(SQL);
        } else {
            String SQL = "UPDATE jabatan SET "
                    + " nama_jabatan ='" + this.jabatan + "' "
                    + " WHERE id_jabatan='" + this.idJabatan + "'";
            DBHelper.executeQuery(SQL);
        }
    }
    
    public void delete() {
        String SQL = "DELETE FROM jabatan WHERE id_jabatan='" + this.idJabatan + "'";
        DBHelper.executeQuery(SQL);
    }
}
