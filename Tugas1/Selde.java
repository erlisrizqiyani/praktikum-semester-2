package kumpulantugas;
import java.util.*;

public class Selde {

    public static int selde(int input, String balik){
        String angka = String.valueOf(input);
        for (int i = angka.length(); i>0; i--){
            String angka1 = angka.substring(i-1,i);
            balik += angka1;
        } int balik1 = Integer.parseInt(balik);
        return balik1;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner get = new Scanner(System.in);
        int angka = get.nextInt();
        String format = "";

        if (selde(angka, format) == angka){
            System.out.println(angka + " adalah selde.");
        }else System.out.println(angka + " bukan selde.");

    }
}
