package struk;

import java.util.Scanner;

class CafeCeria {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("CAFE CERIA\nANEKA MINUMAN");
        System.out.println("SPECIAL MENU : \n1. Soft drinks\n2. Mix juice\n3. Nescafe\n4. Soda nilk\n5. Tea");
        System.out.print("Masukkan nama pembeli: ");
        String customerName = scanner.nextLine();
        System.out.print("Silahkan masukkan pilihan anda: ");
        int choice = scanner.nextInt();
        String message;
        switch (choice) {
            case 1:
                message = "Soft drinks";
                break;
            case 2:
                message = "Mix juice";
                break;
            case 3:
                message = "Nescafe";
                break;
            case 4:
                message = "Soda nilk";
                break;
            case 5:
                message = "Tea";
                break;
            default:
                message = "Minuman tidak tersedia";
        }
        System.out.println("\nMinuman yang anda pesan adalah " + message);
        System.out.println("Pesanan akan segera kami antar");
        System.out.println("Terima Kasih " + customerName + " telah berkunjung diCafe Ceria");
    }
}
