package Acara_15_16;

public class BinarySearch {
     public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid; // Elemen ditemukan
            } else if (arr[mid] < target) {
                left = mid + 1; // Cari di sebelah kanan
            } else {
                right = mid - 1; // Cari di sebelah kiri
            }
        }

        return -1; // Elemen tidak ditemukan
    }

    public static void main(String[] args) {
        int[] data = { 0, 2, 5, 6, 9, 10, 15 };
        int target1 = 15;
        int target2 = 5;

        int result1 = binarySearch(data, target1);
        int result2 = binarySearch(data, target2);

        if (result1 != -1) {
            System.out.println("Elemen " + target1 + " ditemukan pada indeks " + result1);
        } else {
            System.out.println("Elemen " + target1 + " tidak ditemukan.");
        }

        if (result2 != -1) {
            System.out.println("Elemen " + target2 + " ditemukan pada indeks " + result2);
        } else {
            System.out.println("Elemen " + target2 + " tidak ditemukan.");
        }
    }
}
