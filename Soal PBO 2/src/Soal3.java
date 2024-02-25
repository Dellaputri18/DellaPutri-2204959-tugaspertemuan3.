/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dellaputrw
 */
import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan jam masuk (format: 1 sampai 12):");
        int jamMasuk = input.nextInt();
        System.out.println("Masukkan jam keluar (format: 1 sampai 12):");
        int jamKeluar = input.nextInt();
        
        jamMasuk = convertTo24HourFormat(jamMasuk);
        jamKeluar = convertTo24HourFormat(jamKeluar);
 
        int lamaBekerja = hitungLamaBekerja(jamMasuk, jamKeluar);
        
        System.out.println("Lama bekerja: " + lamaBekerja + " jam");
    }

    public static int convertTo24HourFormat(int jam) {
        if (jam == 12) {
            return 0;
        } else {
            return jam;
        }
    }
    
    public static int hitungLamaBekerja(int jamMasuk, int jamKeluar) {
        if (jamMasuk <= jamKeluar) {
            return jamKeluar - jamMasuk;
        } else {
            return (12 - jamMasuk) + jamKeluar;
        }
    }
}

