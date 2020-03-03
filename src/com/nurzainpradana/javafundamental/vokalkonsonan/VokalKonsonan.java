package com.nurzainpradana.javafundamental.vokalkonsonan;

import java.util.Scanner;

public class VokalKonsonan {
    public static void main(String[] args){
        /* Kamus */
        String word = "";
        int vokal = 0;
        int konsonan = 0;

        /* Program */
        //Masukkan Kalimat
        System.out.print("Masukkan Kalimat = ");
        Scanner scanner = new Scanner(System.in);
        word = scanner.nextLine().toLowerCase();

        //Memanggil prosedur yang mengembalikan nilai int
        vokal = num_vokal(word);
        konsonan = num_konsonan(word);

        System.out.println("Jumlah huruf Vokal = " + vokal);
        System.out.println("Jumlah huruf Konsonan = " + konsonan);
    }

    //Dua fungsi statis untuk menghitung huruf konsonan dan vokal
    private static int num_vokal(String word){
        //Kamus
        int i;
        int jumlah_vokal = 0;

        for (i = 0; i < word.length(); i++){
            if (word.charAt(i) == 'a' || word.charAt(i) == 'i' || word.charAt(i) == 'u' || word.charAt(i) == 'e' || word.charAt(i) == 'o'){
                jumlah_vokal++;
            }
        }
        return jumlah_vokal;
    }

    private static int num_konsonan(String word){
        int i;
        int jumlah_konsonan = 0;
        for (i = 0; i < word.length(); i++){
            if (word.charAt(i) != 'a' && word.charAt(i) != 'i' && word.charAt(i) != 'u' && word.charAt(i) != 'e' && word.charAt(i) != 'o' && word.charAt(i) != ' '){
                jumlah_konsonan++;
            }
        }
        return jumlah_konsonan;
    }
}
