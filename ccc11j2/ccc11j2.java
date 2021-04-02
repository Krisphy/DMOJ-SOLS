package ccc11j2;
import java.util.*;
import java.io.*;

public class ccc11j2 {
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        int h1 = s.nextInt();
        int h2 = s.nextInt();
        Boolean hitsTrue = false;
        for (int i=0; i<=h2; i++){

            if (-6*Math.pow(i,4)+h1*Math.pow(i,3)+2*Math.pow(i,2)+i <= 0 && i != 0)
            {   
                hitsTrue=true;
                System.out.println("The balloon first touches ground at hour:");
                System.out.println(i);
                break;
            }
        }
        if (!hitsTrue){
            System.out.println("The balloon does not touch ground in the given time.");
        }
    }
}
