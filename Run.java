package PERPUSTAKAAN;

import java.util.Scanner;

public class Run {

    public static void main(String[] args) {

        Peminjaman z = new Peminjaman();
        Databuku buku = new Databuku();
//        z.Siswa();
        z.Listbuku(buku); //ini tak kasih 2 biar bisa bandingin sebelum ama sesudah meminjam/mengembalikan
        z.peminjaman(buku);
        z.Listbuku(buku);

    }
}
