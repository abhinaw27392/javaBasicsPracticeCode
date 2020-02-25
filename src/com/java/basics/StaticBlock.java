package com.java.basics;
import java.util.Scanner;

public class StaticBlock {
    static boolean flag;
    static int B;
    static int H; 
    static {
        Scanner scn = new Scanner(System.in);
        B = scn.nextInt();
        H = scn.nextInt();
        if(B > 0 && H > 0) {      
            flag = true;
        }else {
            flag = false;
            System.out.println("Breadth and height must be positive");
        }

    }

public static void main(String[] args) throws Exception{
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class