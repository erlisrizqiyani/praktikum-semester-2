package praktikum;

import java.util.Scanner;

public class tugas3 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        getInfo();

        Baju baju = new Baju();
        System.out.print("Masukkan jenis baju : ");
        baju.jenis = sc.nextLine();
        System.out.print("Masukkan jumlah     : ");
        baju.jumlah = sc.nextInt();

        baju.display();


    }

    public static void getInfo(){
        System.out.println("""
                1. Baju A = 100000/buah
                2. Baju B = 125000/buah
                3. Baju C = 175000/buah
                nb. diskon pembelian diatas 100buah""");
    }
}

class Baju{

    String jenis;
    int harga;
    int jumlah;

    public Baju(String jenis, int harga, int jumlah){
        this.jenis=jenis;
        this.harga=harga;
        this.jumlah=jumlah;
    }

    final int bajua = 100000;
    final int bajub = 125000;
    final int bajuc = 175000;

    public Baju() {

    }

    void hargaa(){
        if(this.jumlah>100){
            this.harga = 95000;
        } else this.harga = bajua;
    }

    void hargab(){
        if(this.jumlah>100){
            this.harga = 120000;
        } else this.harga = bajub;
    }

    void hargac(){
        if(this.jumlah>100){
            this.harga = 160000;
        } else this.harga = bajuc;
    }

    void display(){
        if(jenis.equalsIgnoreCase("a")){
            hargaa();
        }
        else if(jenis.equalsIgnoreCase("b")){
            hargab();
        }
        else if(jenis.equalsIgnoreCase("c")){
            hargac();
        }
        System.out.println("Jenis yang anda beli : "+jenis);
        System.out.println("Harga per buah       : "+harga);
        System.out.println("Total harga          : "+harga*jumlah);

    }
}
