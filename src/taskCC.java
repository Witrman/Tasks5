import java.util.Arrays;
import java.util.Scanner;

public class taskCC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
int[] a = new int[] {0,0,0,0,0,0,0,0,0};
int b =1 ;
         while (b!=0)
         {
             b=sc.nextInt();
             switch (b)
             {
                 case 1:{a[b-1]++; break; }
                 case 2:{a[b-1]++; break; }
                 case 3:{a[b-1]++; break; }
                 case 4:{a[b-1]++; break; }
                 case 5:{a[b-1]++; break; }
                 case 6:{a[b-1]++; break; }
                 case 7:{a[b-1]++; break; }
                 case 8:{a[b-1]++; break; }
                 case 9:{a[b-1]++; break; }
             }

         }

        for (int c:a
             ) {
            System.out.print(c+" ");

        }

    }
}
