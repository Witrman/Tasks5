public class taskGG {
    public static void main(String[] args) {
        int[] a = new int[] {1,5,2,8,4,6,3,9,2,5,7};
        for (int d:a
                ) {
            System.out.print(d+" ");
        }
        System.out.println();
        InsSort(a);
        for (int d:a
                ) {
            System.out.print(d+" ");
        }
    }
    private static void InsSort(int[] a)
    {
        for(int i=1;i<a.length;i++){
            for(int j=i; j>0 && a[j-1]>a[j];j--){

                int tmp=a[j-1];
                a[j-1]=a[j];
                a[j]=tmp;
            }
        }
    }
}
