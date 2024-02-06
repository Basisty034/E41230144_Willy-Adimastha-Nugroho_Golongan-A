package drivetransaction;

import java.util.ArrayList;
import java.util.Scanner;

 

class Product {
    String brand;
    double price;

    public Product(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }
}

class Transaction {
    ArrayList<Product> products = new ArrayList<>();
    double totalAmount = 0;

    public void addProduct(Product product) {
        products.add(product);
        totalAmount += product.price;
    }

    public void displayReceipt() {
        System.out.println("Receipt:");
        for (Product product : products) {
            System.out.println(product.brand + "\t$" + product.price);
        }
        System.out.println("Total: $" + totalAmount);
    }
        
        public void clearTransaction() {
        products.clear();
        totalAmount = 0;
        
    }
}

public class DriveTransaction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Transaction currentTransaction = new Transaction();

      
      System.out.println("Selamat datang di toko kami, ada yang bisa kami bantu?");
      System.out.println("Masukkan pernyataan Anda (Saya ingin membeli sesuatu/Untuk saat ini, saya ingin melihat-lihat barang saja): ");
        String statement = scanner.nextLine();

        if (statement.equalsIgnoreCase("Saya ingin membeli sesuatu")) {
            while (true) {
                System.out.println("Baiklah berikut adalah daftar komponen yang ada di toko kami:");
                System.out.println("1. HDD");
                System.out.println("2. SSD");
                System.out.println("3. Flash Disk");
                System.out.println("4. Optical Drive");
                System.out.println("5. Floppy Drive");
                System.out.println("6. Selesai");

            System.out.print("Pilih menu (1-6): ");
            String menuChoice = scanner.nextLine();

            if (menuChoice.equals("1")) {
                // Menu SanDisk
                System.out.println("Menu HDD:");
                // Menambahkan beberapa produk contoh ke dalam memori
                Product product1 = new Product("AlphaKhansk Disk", 250000);
                Product product2 = new Product("Khrashnoyarsk Disk", 395000);
                Product product3 = new Product("CruzerMansta Disk", 140500);

                System.out.println("1. " + product1.brand + "\t$" + product1.price);
                System.out.println("2. " + product2.brand + "\t$" + product2.price);
                System.out.println("3. " + product3.brand + "\t$" + product3.price);

               while (true) {
                    System.out.print("Pilih produk HDD (1-3) atau 'selesai' untuk kembali ke menu utama: ");
                    String input = scanner.nextLine();

                    if (input.equalsIgnoreCase("selesai")) {
                        // Kembali ke menu utama
                        break;
                    }

                    try {
                        int selectedProduct = Integer.parseInt(input);
                        switch (selectedProduct) {
                            case 1:
                                currentTransaction.addProduct(product1);
                                break;
                            case 2:
                                currentTransaction.addProduct(product2);
                                break;
                            case 3:
                                currentTransaction.addProduct(product3);
                                break;
                            default:
                                System.out.println("Pilihan tidak valid. Silakan pilih 1-3.");
                                break;
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Masukan tidak valid. Silakan masukkan nomor (1-3) atau 'selesai'.");
                    }
                }
            } else if (menuChoice.equals("2")) {
                // Menu Komponen Lain
                System.out.println("Menu SSD:");
                // Tambahkan produk lain di sini
                
                 // Menu SanDisk
                System.out.println("Menu SSD:");
                // Menambahkan beberapa produk contoh ke dalam memori
                Product product1 = new Product("Adata XPG SX8200 Pro", 136000);
                Product product2 = new Product("Adata XPG Gammix S50 Lite", 105400);
                Product product3 = new Product("WD Black SN750 NVMe", 865000);

                System.out.println("1. " + product1.brand + "\t$" + product1.price);
                System.out.println("2. " + product2.brand + "\t$" + product2.price);
                System.out.println("3. " + product3.brand + "\t$" + product3.price);

                while (true) {
                    System.out.print("Pilih SSD (1-3) atau 'selesai' untuk kembali ke menu utama: ");
                    // Logika untuk memproses pilihan produk Komponen Lain
                    // ...

                    String input = scanner.nextLine();

                    if (input.equalsIgnoreCase("selesai")) {
                        // Kembali ke menu utama
                        break;
                    }

                    // Logika untuk memproses pilihan produk Komponen Lain
                    // ...
                    try {
                        int selectedProduct = Integer.parseInt(input);
                        switch (selectedProduct) {
                            case 1:
                                currentTransaction.addProduct(product1);
                                break;
                            case 2:
                                currentTransaction.addProduct(product2);
                                break;
                            case 3:
                                currentTransaction.addProduct(product3);
                                break;
                            default:
                                System.out.println("Pilihan tidak valid. Silakan pilih 1-3.");
                                break;
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Masukan tidak valid. Silakan masukkan nomor (1-3) atau 'selesai'.");
                    }
                }        
            } else if (menuChoice.equals("3")) {
                // Menu Komponen Lain
                System.out.println("Menu Flash Disk:");
                // Tambahkan produk lain di sini
                
                 // Menu SanDisk
                System.out.println("Menu Flash Disk:");
                // Menambahkan beberapa produk contoh ke dalam memori
                Product product1 = new Product("Extreme Pro USB 3.2", 100000);
                Product product2 = new Product("Kingston", 400400);
                Product product3 = new Product("Corsair Flash Voyager GTX USB 3.1", 900000);

                System.out.println("1. " + product1.brand + "\t$" + product1.price);
                System.out.println("2. " + product2.brand + "\t$" + product2.price);
                System.out.println("3. " + product3.brand + "\t$" + product3.price);

                while (true) {
                    System.out.print("Pilih Flash Disk (1-3) atau 'selesai' untuk kembali ke menu utama: ");
                    // Logika untuk memproses pilihan produk Komponen Lain
                    // ...

                    String input = scanner.nextLine();

                    if (input.equalsIgnoreCase("selesai")) {
                        // Kembali ke menu utama
                        break;
                    }

                    // Logika untuk memproses pilihan produk Komponen Lain
                    // ...
                    try {
                        int selectedProduct = Integer.parseInt(input);
                        switch (selectedProduct) {
                            case 1:
                                currentTransaction.addProduct(product1);
                                break;
                            case 2:
                                currentTransaction.addProduct(product2);
                                break;
                            case 3:
                                currentTransaction.addProduct(product3);
                                break;
                            default:
                                System.out.println("Pilihan tidak valid. Silakan pilih 1-3.");
                                break;
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Masukan tidak valid. Silakan masukkan nomor (1-3) atau 'selesai'.");
                    }
                }
                
             } else if (menuChoice.equals("4")) {
                // Menu Komponen Lain
                System.out.println("Menu Optical Drive:");
                // Tambahkan produk lain di sini
                
                 // Menu SanDisk
                System.out.println("Menu Optical Drive:");
                // Menambahkan beberapa produk contoh ke dalam memori
                Product product1 = new Product("PX-891SAF", 450000);
                Product product2 = new Product("Black BC-12B1ST", 800400);
                Product product3 = new Product("Blue WH16NS40", 130000);

                System.out.println("1. " + product1.brand + "\t$" + product1.price);
                System.out.println("2. " + product2.brand + "\t$" + product2.price);
                System.out.println("3. " + product3.brand + "\t$" + product3.price);

                while (true) {
                    System.out.print("Pilih Optical Drive (1-3) atau 'selesai' untuk kembali ke menu utama: ");
                    // Logika untuk memproses pilihan produk Komponen Lain
                    // ...

                    String input = scanner.nextLine();

                    if (input.equalsIgnoreCase("selesai")) {
                        // Kembali ke menu utama
                        break;
                    }

                    // Logika untuk memproses pilihan produk Komponen Lain
                    // ...
                    try {
                        int selectedProduct = Integer.parseInt(input);
                        switch (selectedProduct) {
                            case 1:
                                currentTransaction.addProduct(product1);
                                break;
                            case 2:
                                currentTransaction.addProduct(product2);
                                break;
                            case 3:
                                currentTransaction.addProduct(product3);
                                break;
                            default:
                                System.out.println("Pilihan tidak valid. Silakan pilih 1-3.");
                                break;
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Masukan tidak valid. Silakan masukkan nomor (1-3) atau 'selesai'.");
                    }
                }
             } else if (menuChoice.equals("5")) {
                // Menu Komponen Lain
                System.out.println("Menu Floppy Drive:");
                // Tambahkan produk lain di sini
                
                 // Menu SanDisk
                System.out.println("Menu Floppy Drive:");
                // Menambahkan beberapa produk contoh ke dalam memori
                Product product1 = new Product("NEC FD1231H", 145600);
                Product product2 = new Product("Krupyatch K4560HQ", 231000);
                Product product3 = new Product("Ngorgh S5500KH", 156000);

                System.out.println("1. " + product1.brand + "\t$" + product1.price);
                System.out.println("2. " + product2.brand + "\t$" + product2.price);
                System.out.println("3. " + product3.brand + "\t$" + product3.price);

                while (true) {
                    System.out.print("Pilih Flash Disk (1-3) atau 'selesai' untuk kembali ke menu utama: ");
                    // Logika untuk memproses pilihan produk Komponen Lain
                    // ...

                    String input = scanner.nextLine();

                    if (input.equalsIgnoreCase("selesai")) {
                        // Kembali ke menu utama
                        break;
                    }

                    // Logika untuk memproses pilihan produk Komponen Lain
                    // ...
                    try {
                        int selectedProduct = Integer.parseInt(input);
                        switch (selectedProduct) {
                            case 1:
                                currentTransaction.addProduct(product1);
                                break;
                            case 2:
                                currentTransaction.addProduct(product2);
                                break;
                            case 3:
                                currentTransaction.addProduct(product3);
                                break;
                            default:
                                System.out.println("Pilihan tidak valid. Silakan pilih 1-3.");
                                break;
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Masukan tidak valid. Silakan masukkan nomor (1-3) atau 'selesai'.");
                    }
                }
                 } else if (menuChoice.equals("6")) {
                // Keluar dari program
                currentTransaction.displayReceipt();
                 System.out.println("Total pembayaran: $" + currentTransaction.totalAmount);

                    System.out.println("Konfirmasi pembayaran?");
                    System.out.print("Pilih 'Ya' atau 'Tidak': ");
                    String paymentConfirmation = scanner.nextLine();

                    if (paymentConfirmation.equalsIgnoreCase("Ya")) {
                        // Pembayaran diterima
                        System.out.println("Terima kasih telah berbelanja di toko kami! Sampai jumpa di kunjungan berikutnya");
                        currentTransaction.clearTransaction();
                        break;
                    } else if (paymentConfirmation.equalsIgnoreCase("Tidak")) {
                        // Pembayaran tidak diterima, kembali ke menu utama
                        System.out.println("Pembayaran dibatalkan");
                        currentTransaction.clearTransaction();
                        break;
                    } else {
                        System.out.println("Pilihan tidak valid. Silakan pilih 'Ya' atau 'Tidak'.");
                    }
            
                System.out.println("Terima kasih telah berbelanja di toko kami! Sampai jumpa di kunjungan berikutnya");
                break;
            } else {
                System.out.println("Pilihan tidak valid. Silakan pilih 1-6."); 
            }
            }
             
     } else if (statement.equalsIgnoreCase("Untuk saat ini, saya ingin melihat-lihat barang saja")) {
            System.out.println("Berikut daftar menu kami:");

            // Tampilkan daftar menu tanpa harga
            System.out.println("1. HDD");
            System.out.println("2. SSD");
            System.out.println("3. Flash Disk");
            System.out.println("4. Optical Drive");
            System.out.println("5. Floppy Drive");
            System.out.println("6. Selesai");

            // Pengguna dapat memilih menu atau keluar dari program
            System.out.print("Pilih menu (1-6) atau 'selesai' untuk keluar: ");
            String menuChoice = scanner.nextLine();

            if (menuChoice.equalsIgnoreCase("Selesai")) {
                        System.out.println("Terima kasih!");
            } else {
                // Logika untuk menu pilihan yang dipilih
            }
        } else {
            System.out.println("Pilihan tidak valid. Silakan masukkan 'Ya' atau 'Tidak'.");
        }
        scanner.close();
    }
}