package ccc10j2;
import java.util.*;
import java.io.*;

public class ccc10j2 {
    public static void main (String [] args)
    {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        int s = in.nextInt();
        boolean nikkyUp = true, byronUp = true;
        int nikky = 0;
        int byron = 0;
        int s1 = 0;
        int n1 = 0;
        int n2 = 0;
        while(true)
        {
            if(nikkyUp){
                nikky++;
                n1++;
                if(n1>= a){
                    nikkyUp=false;
                }
            }
            else {
                nikky--;
                n1--;
                if(n1<=b){
                    nikkyUp=true;
                }
            }

            if(byronUp){
                byron++;
                n2++;
                if(n2>=c){
                   byronUp=false; 
                }
            }
            else{
                byron--;
                n2--;
                if(n2<=d){
                    byronUp=true;
                }
            }
            s1++;
            if(s1>=s)
            {
                if (nikky > byron)
                    System.out.println("Nikky");

                if (byron > nikky)
                    System.out.println("Byron");

                if (byron == nikky)
                    System.out.println("Tied");
                break;
            }   
        }
    }
}
