package firebend;
import java.util.*;
import java.io.*;


public class firebend {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0;
        for(int i=0; i<n; i++){
            int num = in.nextInt();
            if (num<0){
                sum += Math.abs(num);
            }
            else {
                sum += num;
            }
        }
        System.out.println(sum);

    }
}
