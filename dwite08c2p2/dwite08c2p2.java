package dwite08c2p2;
import java.util.*;
import java.io.*;


public class dwite08c2p2 {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        int max = 0;
        int [] out = new int [5];
        for (int i=0; i<5; i++){
            String input = in.nextLine();
            for(int j=0; j<input.length(); j++){
                if (Character.getNumericValue(input.charAt(j))>max){
                    max = Character.getNumericValue(input.charAt(j));
                }
            }
            out [i] = max;
            max = 0;
        }
        for(int k = 0; k<5; k++) 
        System.out.println(out[k]);
        
    }
}
