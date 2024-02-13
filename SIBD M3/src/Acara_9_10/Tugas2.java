package Acara_9_10;

import java.util.Scanner;
import java.io.*;

public class Tugas2 {
        public static void main(String[] args){
         BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
        int i = 1;

        System.out.println("Do While");
        System.out.println("Bilangan kelipatan 2 (1-100)");

        do {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            i++;
        } while (i <= 100);

        System.out.println("\n(total time : 1 second)");
    }
}
