package Acara_9_10;

import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args){
      Scanner input = new Scanner(System.in);
        int awal, akhir;

        System.out.print("Masukkan nilai awal: ");
        awal = input.nextInt();

        System.out.print("Masukkan nilai akhir: ");
        akhir = input.nextInt();

        System.out.println("Bilangan genap dari " + awal + " hingga " + akhir + " adalah:");
        for (int i = awal; i <= akhir; ++i) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
    }
}
    

