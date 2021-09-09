package DOL;
import java.util.Arrays;

public class Arum {
    public static void main(String[] args) {
        int[] knight = { 4,3,1,2 };
        int[] dragon = { 7, 2 };
        Arrays.sort(knight);
        Arrays.sort(dragon);
        int indeksDragon = 0;
        int power = 0;
        for (int x : knight){
            if (indeksDragon < dragon.length){
                if (x >= dragon[indeksDragon]){
                    power += x;
                    indeksDragon++;
                }
            }
        }
        if (indeksDragon == dragon.length){
            System.out.println("Minimum power : " + power);
        } else {
            System.out.println("Knight Fall");
        }
    }
}
