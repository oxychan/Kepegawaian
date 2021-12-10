package backend;

import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author taufik
 */
public class Pegawai {

    private String nip;
    private String nama;
    private Jabatan jabatan = new Jabatan();
    private String ttl;
    private String no_telp;
    private String email;
    private String alamat;
    private int jamKerja;

    public Pegawai() {
    }

    public Pegawai(String nip, String nama, Jabatan jabatan, String ttl, String no_telp, String email, String alamat, int jamKerja) {
        this.nip = nip;
        this.nama = nama;
        this.jabatan = jabatan;
        this.ttl = ttl;
        this.no_telp = no_telp;
        this.email = email;
        this.alamat = alamat;
        this.jamKerja = jamKerja;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Jabatan getJabatan() {
        return jabatan;
    }

    public void setJabatan(Jabatan jabatan) {
        this.jabatan = jabatan;
    }

    public String getTtl() {
        return ttl;
    }

    public void setTtl(String ttl) {
        this.ttl = ttl;
    }

    public String getNo_telp() {
        return no_telp;
    }

    public void setNo_telp(String no_telp) {
        this.no_telp = no_telp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getJamKerja() {
        return jamKerja;
    }

    public void setJamKerja(int jamKerja) {
        this.jamKerja = jamKerja;
    }

    public Pegawai getById(String nip) {
        Pegawai peg = new Pegawai();

        ResultSet rs = DBHelper.selectQuery("SELECT * FROM pegawai "
                + " WHERE nip = '" + nip + "'");

        try {
            while (rs.next()) {
                peg = new Pegawai();
                peg.setNip(rs.getString("nip"));
                peg.setNama(rs.getString("nama"));
                peg.getJabatan().setIdJabatan(rs.getInt("id_jabatan"));
                peg.setTtl(rs.getString("tanggal_lahir"));
                peg.setNo_telp(rs.getString("no_telp"));
                peg.setEmail(rs.getString("email"));
                peg.setAlamat(rs.getString("alamat"));
                peg.setJamKerja(rs.getInt("jam_kerja"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return peg;
    }

    public ArrayList<Pegawai> getAll() {
        ArrayList<Pegawai> ListPegawai = new ArrayList();

        ResultSet rs = DBHelper.selectQuery("SELECT * FROM pegawai");

        try {
            while (rs.next()) {
                Pegawai peg = new Pegawai();
                peg.setNip(rs.getString("nip"));
                peg.getJabatan().setIdJabatan(rs.getInt("id_jabatan"));
                peg.setNama(rs.getString("nama"));
                peg.setTtl(rs.getString("tanggal_lahir"));
                peg.setNo_telp(rs.getString("no_telp"));
                peg.setEmail(rs.getString("email"));
                peg.setAlamat(rs.getString("alamat"));
                peg.setJamKerja(rs.getInt("jam_kerja"));

                ListPegawai.add(peg);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return ListPegawai;
    }

    public ArrayList<Pegawai> search(String keyword) {
        ArrayList<Pegawai> ListPegawai = new ArrayList();

        ResultSet rs = DBHelper.selectQuery("SELECT * FROM pegawai WHERE "
                + " nip LIKE '%" + keyword + "%' "
                + " OR nama LIKE '%" + keyword + "%' "
                + " OR email LIKE '%" + keyword + "%' "
        );

        try {
            while (rs.next()) {
                Pegawai peg = new Pegawai();
                peg.setNip(rs.getString("nip"));
                peg.setNama(rs.getString("nama"));
                peg.getJabatan().setIdJabatan(rs.getInt("id_jabatan"));
                peg.setTtl(rs.getString("tanggal_lahir"));
                peg.setNo_telp(rs.getString("no_telp"));
                peg.setEmail(rs.getString("email"));
                peg.setAlamat(rs.getString("alamat"));
                peg.setJamKerja(rs.getInt("jam_kerja"));

                ListPegawai.add(peg);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return ListPegawai;
    }

    public void save() {
        if (getById(nip).getNip() == null) {
            String SQL = "INSERT INTO pegawai VALUES ("
                    + "     '" + this.nip + "', "
                    + "     '" + this.jabatan.getIdJabatan() + "', "
                    + "     '" + this.nama + "', "
                    + "     '" + this.ttl + "', "
                    + "     '" + this.no_telp + "', "
                    + "     '" + this.email + "', "
                    + "     '" + this.alamat + "', "
                    + "     '" + this.jamKerja + "' "
                    + " )";
            this.nip = DBHelper.insertQueryGetIdStr(SQL);
        } else {
            String SQL = "UPDATE pegawai SET "
                    + " id_jabatan='" + this.jabatan.getIdJabatan() + "', "
                    + " nama='" + this.nama + "', "
                    + " tanggal_lahir='" + this.ttl + "', "
                    + " no_telp='" + this.no_telp + "', "
                    + " email='" + this.email + "', "
                    + " alamat=0'" + this.alamat + "', "
                    + " jam_kerja='" + this.jamKerja + "' "
                    + " WHERE nip='" + this.nip + "'";
            DBHelper.executeQuery(SQL);
        }
    }

    public void delete() {
        String SQL = "DELETE FROM pegawai WHERE nip='" + this.nip + "'";
        DBHelper.executeQuery(SQL);
    }

}
