package Prime;
import java.util.Scanner;

public class Arum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka, cek = 0;
        System.out.print("Masukan Angka : ");
        angka=input.nextInt();
        for (int i=2; i<=angka; i++){
            if (angka%i==0){
                cek++;
            } 
        }
        if (cek==1){
            System.out.println(angka+" adalah bilangan prima");
        }else {
            System.out.println(angka+" bukan bilangan prima");
        }
    }
}
