public class taskG {
    public static void main(String[] args) {
        int[] a = new int[] {1,5,2,8,4,6,3,9,2,5,7};
        for (int d:a
                ) {
            System.out.print(d+" ");
        }
        System.out.println();
        BublShort(a);
        for (int d:a
                ) {
            System.out.print(d+" ");
        }
    }
    private  static  void BublShort(int[] a)
    {
        int g = 1,buf;
        while (g!=0)
        {
            g=0;
            for (int i = 0; i <a.length-1 ; i++) {
                if(a[i]>a[i+1])
                {
                    buf=a[i];
                    a[i]=a[i+1];
                    a[i+1]=buf;
                    g++;
                }
            }

        }

    }
}
