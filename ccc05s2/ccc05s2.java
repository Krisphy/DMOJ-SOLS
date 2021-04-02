package ccc05s2;
import java.util.*;
import java.io.*;

public class ccc05s2 {
    public static void main (String []args){
        Scanner in = new Scanner(System.in);
        int mouseX = 0;
        int mouseY = 0;
        int c = in.nextInt();
        int r = in.nextInt();
        while (true){
            int changeX = in.nextInt();
            int changeY = in.nextInt();
            if (changeX == 0 && changeY == 0)
            {
                break;    
            }
            else {    
                if (mouseX + changeX > c){
                    mouseX = c;
                }
                else if (mouseX + changeX < 0){
                    mouseX = 0;
                }
                else {
                    mouseX += changeX;
                }     
                if (mouseY + changeY > r){
                    mouseY = r;
                }
                else if (mouseY + changeY < 0){
                    mouseY = 0;
                }
                else{
                    mouseY += changeY;
                } 
       
            } 
            System.out.println(mouseX + " " + mouseY);
        }

    }
}
