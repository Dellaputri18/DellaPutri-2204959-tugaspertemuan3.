/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dellaputrw
 */

import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan tiga karakter (huruf kecil):");
        String str = input.nextLine();
        
        if (str.length() != 3) {
            System.out.println("Masukkan harus terdiri dari tiga karakter!");
            return;
        }
        
        char[] chars = str.toCharArray();
        
        if (isConsonant(chars[0]) && isVowel(chars[1]) && isConsonant(chars[2])) {
            System.out.println("Urutan konsonan-vokal-konsonan ditemukan!");
        } else {
            System.out.println("Urutan konsonan-vokal-konsonan tidak ditemukan.");
        }
    }
    
    public static boolean isConsonant(char c) {
        return !isVowel(c) && Character.isLetter(c);
    }
    
    public static boolean isVowel(char c) {
        return "aeiou".indexOf(c) != -1;
    }
}

