package JavaDemo.ArrayExercise;

import java.util.Arrays;
// merge to arrays and copy into another array.

public class Exercise6 {
    public static void main(String[] args) {
        int[] a={1,2,3};
        int[] b={4,5,6};
        int l1=a.length;
        int l2=b.length;
        int[] c=new int[l1+l2];
        for(int i=0;i<a.length;i++)
        {
            c[i]=a[i];
        }
        int an=l1;
        for(int j=0;j<b.length;j++)
        {
            c[an]=b[j];
            an++;
        }
        System.out.println(Arrays.toString(c));

    }
}
