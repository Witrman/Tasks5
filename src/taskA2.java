import java.util.Scanner;

public class taskA2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println(CountMax(a));
    }

    private  static int CountMax(int[] a)
    {
        int max=a[0];
        int sum = 1;
        for (int i = 1; i < a.length; i++) {
            if(a[i]==max)
            {
                sum++;
            }else  if(a[i]>max)
            {
                max=a[i];
                sum=1;
            }


        }
        return sum;
    }
}
