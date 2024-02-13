package Acara_11_12;

import java.util.Scanner;

public class Array {
    public static void main(String[] args){
    int[] angka = {5, 10, 17, 20, 1};
    String[] teks = {"Saya","Sedang","belajar","OOP","Java"};
    
    for(int i=0; i<angka.length; i++){
        System.out.println(angka[i]);
}
    for(int j=0; j<teks.length; j++){
        System.out.print(teks[j]);
        System.out.print(" ");
    }
}
}
