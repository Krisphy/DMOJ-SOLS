package ccc15s1;
import java.util.*;
import java.io.*;

public class ccc15s1 {
    public static void main (String [] args)
    {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int [] joe = new int [k];
        int h = 0;
        for (int i=0; i<k ; i++){     
            joe[h] = in.nextInt();
            if(joe[h] == 0)
            {
                joe[h-1] = 0;
                h--;
            }
            else{
              h++;  
            }           
        }
        int sum = 0;
        for(int i=0; i<k; i++){
            sum += joe[i];
        }
        System.out.println(sum);

    }
}
