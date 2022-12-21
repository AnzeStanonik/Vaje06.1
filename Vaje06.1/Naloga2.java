import java.util.Random;
class Naloga2 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] a = new int[5];
        int sestevek = 0;
        int j = 0;
        int b = 0;
        int c = 0;
        for(int i = 0; i < a.length; i++) {
            a[i] = r.nextInt();
            j = i + 1;   
            System.out.println("Stevilo " + j + " = " + a[i]);
            if(i == 0) {
                b = a[i];
                c = a[i];
            }
            if(a[i] > a[j]) {
                b = a[j];
            }else {
                c = a[j];
            }
        }
        System.out.println(b);
        System.out.println(c);
    }
}