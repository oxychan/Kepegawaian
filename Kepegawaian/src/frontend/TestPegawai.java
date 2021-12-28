
package frontend;

import backend.Gaji;
import backend.Jabatan;
import backend.Pegawai;

/**
 *
 * @author taufik
 */
public class TestPegawai {
    public static void main(String[] args) {
//        new Pegawai("1002", "Taufik", new Jabatan().getById(1) , "2001-11-23", "082139929591", "anwrtaufik@gmail.com", "Nganjuk", 5).save();
        
//        new Pegawai().getById("1001").delete();

        for (Pegawai peg : new Pegawai().getAll()) {
            System.out.println("NIP  : " + peg.getNip() + ", Nama : "+ peg.getNama() + ", Jabatan : " + peg.getJabatan().getIdJabatan());
        }
//        
        for(Gaji gaji : new Gaji().getAll()) {
            System.out.println("id " + gaji.getIdGaji() );
        }
        
        Gaji gaji = new Gaji().getById(1);
        System.out.println("id" + gaji.getJenisGaji().getNamaJenisGaji());
        
    }
}
