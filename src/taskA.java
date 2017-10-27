import java.util.Scanner;

public class taskA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int a[] = new int[n];
        for (int i = 0; i <n ; i++) {
            a[i]=sc.nextInt();
        }

        int x = sc.nextInt();
        System.out.println(Search(a,x));
    }

    private static int Search(int a[],int x)
    {
        for (int i = 0; i <a.length ; i++) {
            if(a[i]==x)
            {
                return i;
            }
        }
        return -1;
    }
}
