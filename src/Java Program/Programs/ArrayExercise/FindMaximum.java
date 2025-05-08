package JavaDemo.Programs.ArrayExercise;

public class FindMaximum {

    public static void main(String[] args) {
        int[] a={1,5,4,3,2};               //finding length
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]>a[j])
                {
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println(a[a.length-1]);   // find maximum number an array

        int[] b={2,1,3,5,6};
        int max=b[0];
        for(int i=1;i<b.length;i++)
        {
            if(b[i]>max)
            {
                max=b[i];
            }
        }
        System.out.println(max);


    }
}
