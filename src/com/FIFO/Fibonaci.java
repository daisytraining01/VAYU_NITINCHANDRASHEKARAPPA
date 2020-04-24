package com.FIFO;

import java.util.Scanner;

public class Fibonaci 
{
    public static void main(String[] args) 
    {
       
        fibonaviwhileloop();
    	fibonancifor();
    }
    public static void fibonaviwhileloop()
    {
    	int num;
        int first = 0;
        int second = 0;
        int thrid = 1;
        int i=1;
       Scanner s = new Scanner(System.in);
        System.out.print(" Fibonaci value n:");
        num = s.nextInt();
       
       while(i<=num)
        {
        	first = second;
        	second = thrid;
        	thrid = first + second;
            System.out.print(first+" ");
            i++;
        }
    }
    public static void fibonancifor()
    {
    	 int num;
         int first = 0;
         int second = 0;
         int thrid = 1;
        Scanner s = new Scanner(System.in);
         System.out.print(" Fibonaci value n:");
         num = s.nextInt();
        
         for(int i = 1; i <= num; i++)
         {
         	first = second;
         	second = thrid;
         	thrid = first + second;
             
             System.out.print(first+" ");
         }
    }
}