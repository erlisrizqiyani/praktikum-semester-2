package kumpulantugas;

import java.util.*;

public class MenghitungLuas {

    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        int menu = get.nextInt();

        switch(menu){
            case 1 :
                Persegi   psegi = new Persegi();
                psegi.sisi = get.nextInt();
                System.out.print(psegi.luas());
                break;

            case 2 :
                Segitiga  stiga = new Segitiga();
                stiga.alas = get.nextInt();
                stiga.tinggi = get.nextInt();
                System.out.print(stiga.luas());
                break;

            case 3 :
                Lingkaran lingk = new Lingkaran();
                lingk.jejari = get.nextInt();
                System.out.print((double)lingk.luas());
                break;

            default :
                System.out.println("Input yang anda masukan tidak sesuai");
                break;
        }

    }
}

class Persegi {
    int sisi;
    int luas(){
        return sisi *sisi;
    }
}

class Segitiga {
    int alas, tinggi;
    int luas(){
        return alas*tinggi*1/2;
    }
}

class Lingkaran {
    int jejari;
    int luas(){
        if (jejari % 7 == 0){
            jejari = 22/7 * jejari *jejari;
        } else jejari = (int) (jejari*jejari*3.14);
        return jejari;

    }
}
