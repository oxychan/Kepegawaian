
package backend;

import java.sql.ResultSet;

/**
 *
 * @author taufik
 */
public class User {
    private int idUser;
    private Pegawai pegawai = new Pegawai();
    private String password;

    public User() {
    }

    public User(int idUser, Pegawai pegawai, String password) {
        this.idUser = idUser;
        this.pegawai = pegawai;
        this.password = password;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public Pegawai getPegawai() {
        return pegawai;
    }

    public void setPegawai(Pegawai pegawai) {
        this.pegawai = pegawai;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public User getById(int id) {
        User user = new User();
        
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM user "+
                                            " WHERE id_user = '" + id + "'");
        
        try {
            while(rs.next()) {
                user = new User();
                user.setIdUser(rs.getInt("id_user"));
                user.getPegawai().setNip(rs.getString("nip"));
                user.setPassword(rs.getString("password"));
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
        
        return user;
    }
    
    public User login(String nip, String password) {
        User user = new User();
        
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM user " + 
                                            " WHERE nip='" + nip + "'" + 
                                            " AND password='" + password + "'");
        
        try {
            while(rs.next()) {
                user = new User();
                user.setIdUser(rs.getInt("id_user"));
                user.getPegawai().setNip(rs.getString("nip"));
                user.setPassword(rs.getString("password"));
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
        return user;
    }
}
