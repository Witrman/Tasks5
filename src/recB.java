import java.util.Scanner;

public class recB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if(y<0){ System.out.println(1.0/pw(x,y=y-(y*2)));    }
           else {
            System.out.println(pw(x, y));
        }
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
