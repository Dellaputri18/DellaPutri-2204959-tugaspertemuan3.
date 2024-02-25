/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dellaputrw
 */
import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan panjang sisi pertama:");
        double sisi1 = input.nextDouble();
        System.out.println("Masukkan panjang sisi kedua:");
        double sisi2 = input.nextDouble();
        System.out.println("Masukkan panjang sisi ketiga:");
        double sisi3 = input.nextDouble();
        
        if (sisi1 == sisi2 && sisi2 == sisi3) {
            System.out.println("Termasuk Kubus");
        } else {
            System.out.println("Bukan kubus");
        }
    }
}

