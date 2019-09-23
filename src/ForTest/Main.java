package ForTest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main (String[] args) throws java.lang.Exception
    {

        BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
        int arr1[] = new int[11];
        int arr2[] = new int[11];

        for (int i = 0; i < arr1.length; i++)
        {
            String s = inp.readLine();
            arr1[i] = Integer.parseInt(s);
        }
        for (int i = 0; i < arr2.length; i++)
        {
            String s = inp.readLine();
            arr2[i] = Integer.parseInt(s);
        }

        if (permutations(arr1, arr2))
            System.out.println("YES");
        else
            System.out.println("NO");

}
    static Boolean permutations(int arr1[], int arr2[])
    {
        HashMap<Integer, Integer> myHSM = new HashMap<Integer, Integer>();

        for (int i = 0; i < arr1.length; i++)
        {
            int x = arr1[i];
            if (myHSM.get(x) == null)
                myHSM.put(x, 1);
            else
            {
                int k = myHSM.get(x);
                myHSM.put(x, k+1);
            }
        }

        for (int i = 0; i < arr2.length; i++)
        {
            int x = arr2[i];

            if (myHSM.get(x) == null || myHSM.get(x) == 0)
                return false;

            int k = myHSM.get(x);
            myHSM.put(x, k-1);
        }
        return true;
    }
}
