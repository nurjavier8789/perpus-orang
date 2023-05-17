/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PERPUSTAKAAN;

import java.util.Scanner;

public class Peminjaman {
   Scanner a = new Scanner(System.in);
   Siswaa z = new Siswaa();
   
    public void Siswa(){
    DataSiswa data = new DataSiswa();
    System.out.println("--------------------------------------------------");
    System.out.println("SELAMAT DATANG DI PERPUSTAKAAN SMK TELKOM MALANG");
    System.out.println("--------------------------------------------------\n");        
    data.viewSiswa();
    System.out.println(" ");
    System.out.println("Masukkan ID Siswa anda : ");
    int getIdS = a.nextInt();
    
        if (getIdS>= 3){
            System.out.println("ID tidak terdaftar");   
            
        }
    }
    
    public void Listbuku(){
    Databuku list = new Databuku();
    System.out.println("---------------------------");
    System.out.println("---------------------------\n");
    // menampilkan daftar buku
    list.viewBuku();
    System.out.println("");
    }
    
    public void peminjaman(){
         DataSiswa dat = new DataSiswa();
         Databuku book = new Databuku();
        System.out.println("--- Peminjaman Buku ---");
        System.out.println("Masukkan nomor buku yang akan dipinjam : ");
        int IDBUKU = a.nextInt();
        if (IDBUKU==1) {
        System.out.println("--- List Peminjaman ---");
        System.out.println("Judul Buku: Pemrograman dasar");
        System.out.println("Peminjam: " + dat.nama );
        }
        
        if (IDBUKU==2) {
        System.out.println("--- List Peminjaman ---");
        System.out.println("Judul Buku: Matematika");
        System.out.println("Peminjam: " + dat.nama );}
        if (IDBUKU==3) {
        System.out.println("--- List Peminjaman ---");
        System.out.println("Judul Buku: Novel");
        System.out.println("Peminjam: " + dat.nama );}
        System.out.println("");
    }
    
}