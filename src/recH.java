import java.util.Scanner;

public class recH {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();
    int[] a = new int[k+k];
    a[0]=1;
    a[1]=1;
        for (int i = 2; i <k+1 ; i++) {
            a[i]=a[i-1]+a[i-2];

            }
        for (int i = 0; i <k+1 ; i++) {
            if(k==a[i])
            {
                System.out.println(i);
                break;
            }
        }

}
}
