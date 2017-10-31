import java.util.Scanner;

public class taskE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[] {1,5,2,8,4,6,3,9,2,5,7};
        for (int d:a
                ) {
            System.out.print(d+" ");
        }
        System.out.println();
        Select(a);for (int d:a
                ) {
            System.out.print(d+" ");
        }

    }

    private static void Select( int[] a)
    {
        int i=0, buf =0,m;
        while (i!=a.length)
        {
            buf=a[i];
        m=1000000;
            for (int j = i; j <a.length ; j++) {
                    if(a[j]<m)
                    {
                        m=a[j];
                        a[i]=m;
                        a[j]=buf;
                    }
            }
            i++;

        }


    }
}
