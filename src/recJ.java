import java.util.Scanner;

public class recJ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sol(n,1,2,3);
    }

    private static void sol(int n, int  q,int w , int e)
    {
        if(n>0)
        {
            sol(n-1, q, w, e);

            System.out.println( n+" "+  q+" "+w);

            sol(n-1, w, e, q);
        }
    }

}
