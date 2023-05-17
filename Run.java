package PERPUSTAKAAN;

import java.util.Scanner;

public class Run {

    public static void main(String[] args) {

        Peminjaman z = new Peminjaman();
        Databuku buku = new Databuku();
//        z.Siswa();
        z.Listbuku(buku);
        z.peminjaman(buku);
        z.Listbuku(buku);

    }
}
