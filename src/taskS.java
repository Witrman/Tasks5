
import java.util.Scanner;
import  java.util.Arrays;
public class taskS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] a = sc.nextLine().replace(" ","").toCharArray();
        char[] b = sc.nextLine().replace(" ","").toCharArray();
        char[] c = new char[a.length+b.length];
        for (int i = 0; i <c.length/2; i++) {
            if (a[i]>b[i]) {
                c[i+i] = b[i];
                c [i+i+1] = a [i];
            } else {
                c [i+i] = a [i];
                c [i+i+1] = b [i];

            }

        }


        for (int i=0; i<c.length-1; i++) {
            char t = c[i];
            if (c[i]>c[i+1]) {
                c[i] = c[i+1];
                c [i+1] = t;
            }

        }

        System.out.println (Arrays.toString(c));
    }

    }

