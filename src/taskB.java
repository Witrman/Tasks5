import java.util.Arrays;
import java.util.Scanner;

public class taskB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] a = Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).toArray();
        int max=a[0];
        int sum = 1;
        int c = 0;

        for (int i = 1; i < a.length; i++) {
            if(a[i]==max)
            {
                sum++;
                c=i;
            }else  if(a[i]>max)
            {
                max=a[i];
                sum=1;
            }


        }
        System.out.println(sum+" "+c);
    }


}
