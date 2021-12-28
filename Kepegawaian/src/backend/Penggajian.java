package backend;

import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author taufik
 */
public class Penggajian {
    private int idPenggajian;
    private Pegawai pegawai = new Pegawai();
    private Gaji gaji = new Gaji();
    private String tglGaji;
    private int totalGaji;

    public Penggajian() {
    }

    public Penggajian(int idPenggajian, Pegawai pegawai, Gaji gaji, String tglGaji, int totalGaji) {
        this.idPenggajian = idPenggajian;
        this.pegawai = pegawai;
        this.gaji = gaji;
        this.tglGaji = tglGaji;
        this.totalGaji = totalGaji;
    }

    public int getIdPenggajian() {
        return idPenggajian;
    }

    public void setIdPenggajian(int idPenggajian) {
        this.idPenggajian = idPenggajian;
    }

    public Pegawai getPegawai() {
        return pegawai;
    }

    public void setPegawai(Pegawai pegawai) {
        this.pegawai = pegawai;
    }

    public Gaji getGaji() {
        return gaji;
    }

    public void setGaji(Gaji gaji) {
        this.gaji = gaji;
    }

    public String getTglGaji() {
        return tglGaji;
    }

    public void setTglGaji(String tglGaji) {
        this.tglGaji = tglGaji;
    }

    public int getTotalGaji() {
        return totalGaji;
    }

    public void setTotalGaji(int totalGaji) {
        this.totalGaji = totalGaji;
    }
    
    public Penggajian getById(int id) {
        Penggajian penggajian = new Penggajian();
        
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM penggajian WHERE id_penggajian='" + id + "' ");
        
        try {
            while(rs.next()) {
                penggajian = new Penggajian();
                
                penggajian.setIdPenggajian(rs.getInt("id_penggajian"));
                penggajian.getPegawai().setNip(rs.getString("nip"));
                penggajian.getGaji().setIdGaji(rs.getInt("id_gaji"));
                penggajian.setTglGaji(rs.getString("tgl_penggajian"));
                penggajian.setTotalGaji(rs.getInt("total_gaji"));
            }
        } catch(Exception e) {
            
        }
        
        return penggajian;
    }

    public ArrayList<Penggajian> getAll() {
        ArrayList<Penggajian> listPenggajian = new ArrayList();
        
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM penggajian");
        
        try {
            while(rs.next()) {
                Penggajian penggajian = new Penggajian();
                
                penggajian.setIdPenggajian(rs.getInt("id_penggajian"));
                penggajian.getPegawai().setNip(rs.getString("nip"));
                penggajian.getGaji().setIdGaji(rs.getInt("id_gaji"));
                penggajian.setTglGaji(rs.getString("tgl_penggajian"));
                penggajian.setTotalGaji(rs.getInt("total_gaji"));
                
                listPenggajian.add(penggajian);
            }
        } catch(Exception e) {
            
        }
        
        return listPenggajian;
    }
    
    public ArrayList<Penggajian> search(String keyword) {
        ArrayList<Penggajian> list = new ArrayList();
 
        
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM penggajian " + 
                                            " WHERE id_penggajian LIKE '%" + keyword + "%'" + 
                                            " OR nip LIKE '%" + keyword + "%'");
        
        try {
            while(rs.next()) {
                Penggajian penggajian = new Penggajian();
                
                penggajian.setIdPenggajian(rs.getInt("id_penggajian"));
                penggajian.getPegawai().setNip(rs.getString("nip"));
                penggajian.getGaji().setIdGaji(rs.getInt("id_gaji"));
                penggajian.setTglGaji(rs.getString("tgl_penggajian"));
                penggajian.setTotalGaji(rs.getInt("total_gaji"));
                
                list.add(penggajian);
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
    public void save() {
        if (getById(idPenggajian).getIdPenggajian() == 0) {
            String SQL = "INSERT INTO penggajian (nip, id_gaji, tgl_penggajian, total_gaji) VALUES ("
                    + "     '" + this.getPegawai().getNip() + "', "
                    + "     '" + this.getGaji().getIdGaji() + "', "
                    + "     '" + this.tglGaji + "', "
                    + "     '" + this.totalGaji + "' "
                    + " )";
            this.idPenggajian = DBHelper.insertQueryGetId(SQL);
        } else {
            String SQL = "UPDATE penggajian SET "
                    + "  nip='" + this.getPegawai().getNip() + "', "
                    + "  id_gaji='" + this.getGaji().getIdGaji() + "', "
                    + "  tgl_penggajian='" + this.tglGaji + "', "
                    + "  total_gaji='" + this.totalGaji + "' "
                    + " WHERE id_penggajian='" + this.idPenggajian + "' ";
            DBHelper.executeQuery(SQL);
        }
    }
    
    public void delete() {
        String SQL = "DELETE FROM penggajian WHERE id_penggajian='" + this.idPenggajian + "'";
        DBHelper.executeQuery(SQL);
    }
    
    public String getInfoPenggajian() {
        String totalPenggajian = "";
        
        ResultSet rs = DBHelper.selectQuery("SELECT COUNT(*) AS count FROM penggajian");
        
        try {
            while(rs.next()) {
                totalPenggajian = rs.getString("count");
            }
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "error when getting information");
        }
        return totalPenggajian;
    }
}
