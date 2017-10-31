import java.util.Scanner;

public class taskC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] a = sc.nextLine().replace(" ","").toCharArray();
        int sum;
        for (int i = 1; i <10 ; i++) {
            sum=0;
            for (int j = 0; j < a.length; j++) {
                if(a[j]==i+48)
                {
                    sum++;
                }
            }

            System.out.print(sum+" ");
        }
    }
}
