package PERPUSTAKAAN;

import java.util.Scanner;

public class Peminjaman {

    Scanner a = new Scanner(System.in);
    public int getIdS, IDBUKU;

    public void Siswa() {
        DataSiswa data = new DataSiswa();
    }

    public void Listbuku(Databuku list) {
//        Databuku list = new Databuku();
        list.viewBuku();
        System.out.println("");
    }

    public void peminjaman(Databuku book) {
        DataSiswa dat = new DataSiswa();
//        Databuku book = new Databuku();
        
        System.out.println("--------------------------------------------------");
        System.out.println("SELAMAT DATANG DI PERPUSTAKAAN SMK TELKOM MALANG");
        System.out.println("--------------------------------------------------\n");
        dat.viewSiswa();
        System.out.println(" ");
        System.out.print("Masukkan ID Siswa anda : ");
        getIdS = (a.nextInt() - 1);

        if (getIdS >= 3) {
            System.out.println("ID tidak terdaftar");

        }
        
        /*gw kasih "- 1" soalnya IDmu mulai dari 1 bukan 0. sementara array dimulai dari 0*/
        if (dat.getStatus(getIdS) == true) {
            
            System.out.println("--- Peminjaman Buku ---");
            System.out.print("Masukkan nomor buku yang akan dipinjam : ");
            IDBUKU = (a.nextInt() - 1);
            if (IDBUKU == 0) {
                book.kurangiStok(IDBUKU, (book.getStok(IDBUKU)));
                System.out.println("--- List Peminjaman ---");
                System.out.println("Judul Buku: Pemrograman dasar");
                System.out.println("Peminjam: " + dat.getNama(getIdS));
            }

            if (IDBUKU == 1) {
                book.kurangiStok(IDBUKU, (book.getStok(IDBUKU)));
                System.out.println("--- List Peminjaman ---");
                System.out.println("Judul Buku: Matematika");
                System.out.println("Peminjam: " + dat.getNama(getIdS));
            }
            if (IDBUKU == 2) {
                book.kurangiStok(IDBUKU, (book.getStok(IDBUKU)));
                System.out.println("--- List Peminjaman ---");
                System.out.println("Judul Buku: Novel");
                System.out.println("Peminjam: " + dat.getNama(getIdS));
            }
        } else {
            System.out.println("Kamu sudah meminjam buku\nharap mengembalikan buku terlebih dahulu sebelum meminjam kembali");
            System.out.println("--- Pengembalian Buku ---");
            System.out.print("Masukkan nomor buku yang telah dipinjam : "); //anggep aja si user masih inget buku apa yang dipinjem
            IDBUKU = (a.nextInt() - 1);
            
            if (IDBUKU == 0) {
                book.tambahStock(IDBUKU, (book.getStok(IDBUKU)));
                System.out.println("--- List Pengembalian ---");
                System.out.println("Judul Buku: Pemrograman dasar");
                System.out.println("Peminjam: " + dat.getNama(getIdS));
            }

            if (IDBUKU == 1) {
                book.tambahStock(IDBUKU, (book.getStok(IDBUKU)));
                System.out.println("--- List Pengembalian ---");
                System.out.println("Judul Buku: Matematika");
                System.out.println("Peminjam: " + dat.getNama(getIdS));
            }
            if (IDBUKU == 2) {
                book.tambahStock(IDBUKU, (book.getStok(IDBUKU)));
                System.out.println("--- List Pengembalian ---");
                System.out.println("Judul Buku: Novel");
                System.out.println("Peminjam: " + dat.getNama(getIdS));
            }
        }
    }

}
