public class taskT {
    public static void main(String[] args) {
        int[] a = new int[] {1,2,3,5,6,8,9};
         int[] b = new int[] {2,5,6,7,9};
        for (int d:a
                ) {
            System.out.print(d+" ");
        }
        System.out.println();
        for (int d:b
                ) {
            System.out.print(d+" ");
        }
        int[] c = new int[a.length+b.length];
        asd(a,b,c);
        System.out.println();
        for (int d:c
                ) {
            System.out.print(d+" ");
        }


    }
    private static void asd(int[] a, int[] b , int[] c)
    {
        for (int i = 0; i <c.length ; i++) {
            if (i>=a.length)
            {
                c[i]=b[i-a.length];
            } else {
                c[i]=a[i];

            }
        }
        int d = 1,buf;
        while (d!=0)
        {
            d=0;
            for (int i = 0; i <c.length-1 ; i++) {
                if(c[i]>c[i+1])
                { buf=c[i+1];
                    c[i+1]=c[i];

                    c[i]=buf;
                    d++;
                }
            }

        }

    }
}
