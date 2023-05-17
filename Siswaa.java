package PERPUSTAKAAN;

/*
    Sengaja tak ganti interface biar gampang ngeoverridenya
*/

public interface Siswaa {

    //enkapsulasi : pembuatan method untuk mengakses "idSiswa"
    public int getIdSiswa(int a);

    //enkapsulasi : pembuatan method untuk mengakses "nama siswa"
    public String getNama(int a);

    //implementasi enkapsulasi dengan pembuatan method utk mengakses data private "alamat"
    public String getKelas(int a);

    //implementasi enkapsulasi dengan pembuatan method utk mengakses data private "telepon"
    public String getTelepon(int a);
    
    //method untuk mengubah status peminjaman siswa
    public void changeStatus(int a, boolean b);

    //method untuk mendapatkan status peminjaman
    public boolean getStatus(int a);
    
}