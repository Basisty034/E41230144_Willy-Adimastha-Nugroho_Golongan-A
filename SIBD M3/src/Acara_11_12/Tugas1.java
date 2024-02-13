package Acara_11_12;

import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args){
        String[] bagianNama = {"Willy", "Adimastha", "Nugroho"};
        StringBuilder namaLengkap = new StringBuilder();
        for (String bagian : bagianNama) {
            namaLengkap.append(bagian).append(" ");
        }
        System.out.println("Nama lengkap: " + namaLengkap.toString().trim());
    }
    
}
