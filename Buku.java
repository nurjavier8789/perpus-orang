package PERPUSTAKAAN;

/*
    tak bikin class absract soalnya biar ada yang bisa di extends
    pit tujuannya tetep sama kok, ngeOverride
*/

public abstract class Buku {

    //implementasi enkapsulasi dengan pembuatan method utk mengakses data private "idBuku"
    public abstract int getIdBuku(int a);

    //implementasi enkapsulasi dengan pembuatan method utk mengakses data private "stok"
    public abstract int getStok(int a);

    //implementasi enkapsulasi dengan pembuatan method utk mengakses data private "judulBuku" 
    public abstract String getJudulBuku(int a);

    // method untuk mengurangi stok sejumlah 1
    public abstract void kurangiStok(int a, int b);

    public abstract void tambahStock(int a, int b);
}