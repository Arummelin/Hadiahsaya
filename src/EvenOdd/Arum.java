package EvenOdd;
import java.util.Scanner;

public class Arum {
    public static void main(String[] args) {
        int angka[] = {1, 2, 3, 12, 13, 23, 123};
        for (int i : angka) {
            if (i % 2 == 1) {
                System.out.println(i + " : Ganjil");
            } else {
                System.out.println(i + " : Genap");
            }
        }
    }
}
