package kumpulantugas;

import java.util.*;

public class SuratKaisar {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner get  = new Scanner(System.in);
        String input = get.nextLine();
        int input2   = get.nextInt();

        System.out.print(teksUser(input, input2));

    }

    public static String teksUser(String kata, int angka){
        int N = kata.length();
        char[] huruf = new char[N];
        char[] huruf2 = new char[N];
        int[] Int = new int[N];
        int[] Int2 = new int[N];

        for (int i = 0; i<N; i++){
            huruf[i] = kata.charAt(i);
            Int[i]   = huruf[i];
            if ((char) Int[i] != ' '){
                Int2[i]  = Int[i] + angka;
            } else Int2[i]  = Int[i];

        }

        for (int i = 0; i<N; i++){
            if ((char) Int2[i] > 'z'){
                Int2[i]=Int[i]+(angka-26);
            }
            else   if ((char) Int2[i]> 'Z' && (char) Int2[i] < 'a'){
                Int2[i]=Int[i]+(angka-26);
            }

        }
        for (int i = 0; i<N; i++){
            huruf2[i]= (char)Int2[i];
        }

        return String.valueOf(huruf2);

    }


}