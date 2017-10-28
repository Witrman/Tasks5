import java.util.Scanner;

public class recI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(bcl(n,k));


    }

    private static long bcl(int n,int k)
    {
        if (k>n/2) k=n-k;
        if (k==1)  return n;
        if (k==0)  return 1;
         long r ;
        if (n+k>=90) {
             r=bcl(n-1,k);
            r+=+bcl(n-1,k-1);
        }
        else {
            r=1;
            for (int i=1; i<=k;++i) {
                r*=n-k+i;
                r/=i;
            }
        }
        return r;
    }
}
