/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PERPUSTAKAAN;

import java.util.ArrayList;

public class DataSiswa {
   
ArrayList<Integer> idSiswa = new ArrayList<Integer>();
ArrayList<String> nama = new ArrayList<String>(); 
ArrayList<String> kelas = new ArrayList<String>();
ArrayList<String> telepon = new ArrayList<String>();
ArrayList<Boolean> status = new ArrayList<Boolean>();

public DataSiswa(){
    this.idSiswa.add(1  );
    this.nama.add("Aurellia");
    this.kelas.add("X RPL 2");
    this.telepon.add("  0891772");
    this.status.add(Boolean.TRUE);
    this.idSiswa.add(2  );
    this.nama.add("Natasya   ");
    this.kelas.add("X RPL 3");
    this.telepon.add("  082637");
    this.status.add(Boolean.FALSE);
    this.idSiswa.add(3  );
    this.nama.add("Salsabila");
    this.kelas.add("X TKJ 1");
    this.telepon.add("  0816352");
    this.status.add(Boolean.TRUE);
}
    //method untuk menampilkan data list siswa
    public void viewSiswa(){
        System.out.println("-------- List Siswa --------");
        System.out.println("ID \t Nama \t        Kelas \t  Telepon \tStatus \t");
        for (int i = 0; i < idSiswa.size(); i++) {
            System.out.println(idSiswa.get(i) + "\t" + nama.get(i) + "\t" + kelas.get(i) + "\t" + telepon.get(i) + "  \t" + status.get(i));
        }
//           if (status == Boolean.TRUE) {
//               System.out.println("Anda Diizinkan untuk meminjam buku");
//        }
             }
        }
    
    
//    public int cariSiswa(int id){
//        int found = 0;
//        //pencarian data berdasarkan id
//        for (int i = 0; i < idSiswa.size; i++) {
//            if (idSiswa[i].getIdSiswa() == id) {
//                found = i; 
//                //menyimpan nilai index dari data yg ditemukan
//            }
//        }
//        return found;
//    }
//    
    

    
