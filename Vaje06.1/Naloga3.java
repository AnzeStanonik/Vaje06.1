import java.util.Scanner;
import java.util.Random;
class Naloga3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int[] a = new int[10];  
        for(int i = 0; i < a.length; i++) {
            a[i] = rand.nextInt(11);
        }
        int b = sc.nextInt();
        int c = 0;
        for(int i = 0; i < a.length; i++) {
            if(a[i] == b){
                System.out.println(i);
            }else {
                c++;
            }
        }
        if(c == 10){
            System.out.println("Izbranega stevila ni med nakljucnimi vrednostmi.");
        }
    }
}