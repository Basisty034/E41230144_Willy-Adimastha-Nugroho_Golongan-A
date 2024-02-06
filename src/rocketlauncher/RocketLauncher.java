package rocketlauncher;

import java.util.Scanner;

public class RocketLauncher {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        int rocketCount = 0; // Menginisialisasi stok roket
        
        System.out.println("Masukkan jumlah roket yang ingin ditambahkan: ");
        int rocketsToAdd = scanner.nextInt();
        rocketCount += rocketsToAdd; // Menambahkan stok roket sesuai input pengguna
        
        System.out.println("Persiapan menembakkan roket...");
        System.out.println("Sisa roket: " + rocketCount);
        
        System.out.print("Masukkan jumlah roket yang ingin ditembakkan: ");
        int rocketsToShoot = scanner.nextInt();
        
        // Memastikan jumlah roket yang ingin ditembakkan tidak melebihi jumlah roket yang tersedia
        if (rocketsToShoot <= rocketCount) {
            for (int i = 0; i < rocketsToShoot; i++) {
                System.out.println("Menembakkan roket...");
                rocketCount--; // Mengurangi jumlah roket yang tersedia
            }
            System.out.println("Sisa roket: " + rocketCount);
        } else {
            System.out.println("Jumlah roket yang ingin ditembakkan melebihi jumlah roket yang tersedia.");
        }
        
        scanner.close();
    }
}

