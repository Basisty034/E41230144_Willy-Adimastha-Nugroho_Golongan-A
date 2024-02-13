package Acara_11_12;

import java.util.Scanner;
import java.util.Random;

public class Tugas2 {
    public static void main(String[] args){
         Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah deret: ");
        int jumlahDeret = scanner.nextInt();
        int[] deretAcak = new int[jumlahDeret];
        Random random = new Random();
        for (int i = 0; i < jumlahDeret; i++) {
            deretAcak[i] = random.nextInt(100); 
        }
        System.out.println("Deretan angka acak:");
        for (int angka : deretAcak) {
            System.out.print(angka + " ");
        }
    }
}
