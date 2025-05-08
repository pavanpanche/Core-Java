package JavaDemo;

import java.util.Arrays;

public class MethodExample {
    void add (int[] a)
    {
        System.out.println(Arrays.toString(a));

    }
    public static void main(String[] args) {

            {
                MethodExample me =new MethodExample();
                int[] b={1,2,3,4};
                me.add(b);

            }
        }
    }

