package BinarySearch;
import java.util.Arrays;

public class Arum {
    public static void main(String[] args) {
        int angka[] = { 7, 3, 1, 5, 9 };
        Arrays.sort(angka); 
        int cari = 7; 
        int num = Arrays.binarySearch(angka, cari); 
        if (num >= 0) {
            System.out.println("Pada array "+ Arrays.toString(angka));
            System.out.println("Angka "+ cari+ " ditemukan pada index ke "+ num);
        } else {
            System.out.println("Pada array "+ Arrays.toString(angka));
            System.out.println("Angka "+ cari+ " tidak ditemukan");
        }
    }
}
