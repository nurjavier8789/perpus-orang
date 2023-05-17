/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PERPUSTAKAAN;

/**

 */
public class Siswaa {
    private int idSiswa;
    private String nama;
    private String kelas;
    private String telepon;
    boolean status;

    public Siswaa(int idSiswa, String nama, String kelas, String telepon, boolean status) { //constructor
        this.idSiswa = idSiswa;
        this.nama = nama;
        this.kelas = kelas;
        this.telepon = telepon;
        this.status = status;
    }

    Siswaa() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    //enkapsulasi : pembuatan method untuk mengakses "idSiswa"
    public int getIdSiswa() {
        return idSiswa;
    }

    //enkapsulasi : pembuatan method untuk mengakses "nama siswa"
    public String getNama() {
        return nama;
    }

    //implementasi enkapsulasi dengan pembuatan method utk mengakses data private "alamat"
    public String getKelas() {
        return kelas;
    }

    //implementasi enkapsulasi dengan pembuatan method utk mengakses data private "telepon"
    public String getTelepon() {
        return telepon;
    }
    
    //method untuk mengubah status peminjaman siswa
    public void changeStatus(){
        this.status = !this.status;
    }

    //method untuk mendapatkan status peminjaman
    public String getStatus() {
        if (status) {
            return "Diijinkan meminjam";
        }
        else{
            return "Tidak Diijinkan meminjam, \n harap melakukan pengembalian buku sebelum melakukan peminjaman lain";
        }
    }

    //implementasi enkapsulasi dengan pembuatan method utk mengakses data private "isStatus"
    public boolean isStatus() {
        return status;
    }
    
}