import java.util.Scanner;

public class recH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        System.out.println(phi(k));


    }

    private static int phi(int k) {

        int[] a = new int[k + k + k];
        a[0] = 1;
        a[1] = 1;
        for (int i = 2; i < k + 1; i++) {
            a[i] = a[i - 1] + a[i - 2];

        }

        return a[k];
    }
}

