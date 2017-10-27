import java.util.Scanner;

public class recA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x =sc.nextInt();
        int y = sc.nextInt();
        System.out.println(pw(x,y));
    }

    private static int pw(int x,int y)
    {
        if (y==0)
        {
            return  1;
        }
        else {
             return x=x*pw(x,y-1);
        }
    }
}
