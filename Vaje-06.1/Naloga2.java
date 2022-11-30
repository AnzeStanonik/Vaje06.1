import java.util.Random;
class Naloga2 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] a = new int[5];
        int sestevek = 0;
        int j = 0;
        int b;
        for(int i = 0; i < a.length; i++) {
            a[i] = r.nextInt();
            j = i + 1;   
            System.out.println("Stevilo " + j + " = " + a[i]);
        }
        System.out.println(Math.min(a[1], a[2]));
    }
}