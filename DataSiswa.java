package PERPUSTAKAAN;

import java.util.ArrayList;

public class DataSiswa implements Siswaa {

    ArrayList<Integer> idSiswa = new ArrayList<Integer>();
    ArrayList<String> nama = new ArrayList<String>();
    ArrayList<String> kelas = new ArrayList<String>();
    ArrayList<String> telepon = new ArrayList<String>();
    ArrayList<Boolean> status = new ArrayList<Boolean>();

    public DataSiswa() {
        this.idSiswa.add(1);
        this.nama.add("Aurellia");
        this.kelas.add("X RPL 2");
        this.telepon.add("  0891772");
        this.status.add(true);
        
        this.idSiswa.add(2);
        this.nama.add("Natasya   ");
        this.kelas.add("X RPL 3");
        this.telepon.add("  082637");
        this.status.add(false);
        
        this.idSiswa.add(3);
        this.nama.add("Salsabila");
        this.kelas.add("X TKJ 1");
        this.telepon.add("  0816352");
        this.status.add(true);
    }

    //method untuk menampilkan data list siswa
    public void viewSiswa() {
        System.out.println("-------- List Siswa --------");
        System.out.println("ID \t Nama \t        Kelas \t  Telepon \tStatus \t");
        for (int i = 0; i < idSiswa.size(); i++) {
            System.out.println(idSiswa.get(i) + "\t" + nama.get(i) + "\t" + kelas.get(i) + "\t" + telepon.get(i) + "  \t" + status.get(i));
        }
    }
    
    @Override
    public int getIdSiswa(int a) {
        return idSiswa.get(a);
    }
    
    @Override
    public String getNama(int a) {
        return nama.get(a);
    }
    
    @Override
    public String getKelas(int a) {
        return kelas.get(a);
    }
    
    @Override
    public String getTelepon(int a) {
        return telepon.get(a);
    }
    
    @Override
    public void changeStatus(int a, boolean b) {
        status.set(a, b);
    }
    
    @Override
    public boolean getStatus(int a) {
        return status.get(a);
    }
}