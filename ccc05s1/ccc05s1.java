package ccc05s1;
import java.util.*;
import java.io.*;

public class ccc05s1 {
    public static void main (String [] args)
    {
        Scanner in = new Scanner(System.in);
        int loop = in.nextInt();
        ArrayList<String> phoneNum= new ArrayList<String>(loop);

        for (int i=0; i<loop; i++){
            String input = in.nextLine();
            String exportNum = "";
            for (int j=0; j<40; j++){
                if (input.charAt(j) == 'A' || input.charAt(j) == 'B' || input.charAt(j) == 'C')
                    exportNum += String.valueOf(2);
                if (input.charAt(j) == 'D' || input.charAt(j) == 'E' || input.charAt(j) == 'F')
                    exportNum += String.valueOf(3);
                if (input.charAt(j) == 'G' || input.charAt(j) == 'H' || input.charAt(j) == 'I')
                    exportNum += String.valueOf(4);
                if (input.charAt(j) == 'J' || input.charAt(j) == 'K' || input.charAt(j) == 'L')
                    exportNum += String.valueOf(5);
                if (input.charAt(j) == 'M' || input.charAt(j) == 'N' || input.charAt(j) == 'O')
                    exportNum += String.valueOf(6);
                if (input.charAt(j) == 'P' || input.charAt(j) == 'Q' || input.charAt(j) == 'R' || input.charAt(j) == 'S')
                    exportNum += String.valueOf(7);
                if (input.charAt(j) == 'T' || input.charAt(j) == 'U' || input.charAt(j) == 'V')
                    exportNum += String.valueOf(8);
                if (input.charAt(j) == 'W' || input.charAt(j) == 'X' || input.charAt(j) == 'Y' || input.charAt(j) == 'Z')
                    exportNum += String.valueOf(9);
                
                if (input.charAt(j) != '-' && (int)input.charAt(j) == 0)
                exportNum += input.charAt(j);
            }
            phoneNum.set(i, exportNum);
        }
        System.out.println(phoneNum.get(1));
    }
}
