package JavaDemo.Programs.ArrayExercise;

// java program to print prime numbers of an array.

public class PrimeExercise3 {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7};
        for(int i=0;i<a.length;i++)   //===>get elements from an array
        {
            int count=0;
            for(int j=1;j<=a[i];j++)   //==>check prime logic
            {
                if(a[i]%j==0)
                {
                    count=count+1;

                }
            }
            if(count==2)
            {
                System.out.println(a[i]);
            }
        }

    }
}
