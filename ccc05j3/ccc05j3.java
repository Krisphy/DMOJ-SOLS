package ccc05j3;
import java.util.*;
import java.io.*;
public class ccc05j3 {
    public static void main (String [] args )
    {
        Scanner in = new Scanner (System.in);
        String input = "";
        String [] statements = new String [10];
        int index = 0;
        while (!input.equals("School"))
        {
            input = in.nextLine();
            if (input.equals("SCHOOL"))
            break;

            statements [index] = input;
            index ++;
        }
        String direction = "";
        String place = "";
        for (int i=statements.length-1; i>=0; i--){
            if (statements[i]!=null && !statements[i].equals("SCHOOL"))
            {
                if (statements[i].equals("R")){
                    direction = "LEFT";
                } 
                else if (statements[i].equals("L")){
                    direction = "RIGHT";
                }
                else {
                    place = statements[i];
                }
                if (i!=0 && !direction.equals("") && !place.equals("") && i%2 ==1){
                    System.out.println("Turn " + direction + " onto " + place + " street.");
                }
                else if (i==0)
                {
                    System.out.println("Turn " + direction + " into your HOME.");
                }
                
            }

        }

    }
}
