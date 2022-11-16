import java.util.Random;
class Naloga1 {
    public static void main(String[] args) {
        Random r = new Random();
        for(int i = 0; i < 5; i++) {
            int[] a = new int[] {r.nextInt()};
            
            System.out.println(a[i]);
        }
    }
}