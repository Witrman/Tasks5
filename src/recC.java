import java.util.Scanner;

public class recC {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        double t = sc.nextInt();
        int k = sc.nextInt();
        double sum=1;
        while (k>0) {
            if(k%2==1)
            {
                sum*=t;
            }
            t*=t;
            k/=2;
        }
        System.out.println(sum);

    }
}
