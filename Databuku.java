package PERPUSTAKAAN;

import java.util.ArrayList;

public class Databuku extends Buku {

    ArrayList<Integer> idBuku = new ArrayList<Integer>();
    ArrayList<Integer> stok = new ArrayList<Integer>();
    ArrayList<String> Judul = new ArrayList<String>();

    public Databuku() {
        this.idBuku.add(1);
        this.stok.add(15);
        this.Judul.add("    Pemrograman");

        this.idBuku.add(2);
        this.stok.add(25);
        this.Judul.add("    Matematika");

        this.idBuku.add(3);
        this.stok.add(18);
        this.Judul.add("    Novel");
    }
//method untuk menampilkan data list buku

    public void viewBuku() {
        System.out.println("-------- List Buku --------");
        System.out.println("ID Buku \tJudul \tStok \t");
        for (int i = 0; i < idBuku.size(); i++) {
            System.out.println(idBuku.get(i) + "\t" + Judul.get(i) + "\t" + stok.get(i));
        }
    }
    
    @Override
    public int getIdBuku(int a) {
        return idBuku.get(a);
    }
    
    @Override
    public int getStok(int a) {
        return stok.get(a);
    }
    
    @Override
    public String getJudulBuku(int a) {
        return Judul.get(a);
    }
    
    @Override
    public void kurangiStok(int a, int b) {
        stok.set(a, b - 1);
    }
    
    @Override
    public void tambahStock(int a, int b) {
        stok.set(a, b + 1);
    }
    
    //ini overload, tapi tujuan aslinya buat ngambil total dari arraynya
    public int getStok() {
        return Judul.size();
    }

//    public int cariBuku(int id){
//        int found = 0;
//        //pencarian data berdasarkan id
//        for (int i = 1; i < idBuku.size; i++) {
//            if (idBuku[i].getIdBuku()== id) {
//                found = i; 
//                //menyimpan nilai index dari data yg ditemukan
//            }
//        }
//        return found;        
//    }
//    
}
