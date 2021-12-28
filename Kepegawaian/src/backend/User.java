
package backend;

import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

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
    
    public ArrayList<User> getAll() {
        ArrayList<User> listUser = new ArrayList();
        
         ResultSet rs = DBHelper.selectQuery("SELECT * FROM user ");
         
         try {
             while(rs.next()) {
                 User user = new User();
                 user.setIdUser(rs.getInt("id_user"));
                 user.getPegawai().setNip(rs.getString("nip"));
                 user.setPassword((rs.getString("password")));
                 
                 listUser.add(user);
             }
         } catch(Exception e) {
             
         }
         
         return listUser;
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
    
     public ArrayList<User> search(String keyword) {
        ArrayList<User> listUser = new ArrayList();
        
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM user " + 
                                            " WHERE nip LIKE '%" + keyword + "%'" + 
                                            " OR password LIKE '%" + keyword + "%'");
        
        try {
            while(rs.next()) {
                User user = new User();
                user.setIdUser(rs.getInt("id_user"));
                user.getPegawai().setNip(rs.getString("nip"));
                user.setPassword(rs.getString("password"));
                
                listUser.add(user);
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
        return listUser;
    }

    public void save() {
        if (getById(idUser).getIdUser() == 0) {
            String SQL = "INSERT INTO user (nip, password) VALUES ("
                    + "     '" + this.pegawai.getNip() + "', "
                    + "     '" + this.password + "' "
                    + " )";
            this.idUser = DBHelper.insertQueryGetId(SQL);
        } else {
            String SQL = "UPDATE user SET "
                    + " nip='" + this.pegawai.getNip() + "', "
                    + " password='" + this.password + "' "
                    + " WHERE id_user='" + this.idUser + "'";
            DBHelper.executeQuery(SQL);
        }
    }

    public void delete() {
        String SQL = "DELETE FROM user WHERE id_user='" + this.idUser + "'";
        DBHelper.executeQuery(SQL);
    }
    
    public String getInfoUser() {
        String totalUser = "";
        
        ResultSet rs = DBHelper.selectQuery("SELECT COUNT(*) AS count FROM user");
        
        try {
            while(rs.next()) {
                totalUser = rs.getString("count");
            }
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "error when getting information");
        }
        return totalUser;
    }
}
