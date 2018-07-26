package com.company;

import java.util.Scanner;

public class PairProcessSolution {
    public static void main(String[] args) {
        int num1, num2, sum, product, average;

        Scanner keyboard = new Scanner(System.in);

        System.out.print( "First Number? :" );
        num1 = keyboard.nextInt();

        System.out.print( "Last Number?  :" );
        num2 = keyboard.nextInt();

        sum=num1+num2;
        product=num1*num2;
        average=sum/2;
        System.out.println("Product="+product+" Sum="+sum+" Average="+average);

        if(sum<1000){
            System.out.print("~");

        }
        if(sum>200){
            System.out.print("*");
        }
    }
}
