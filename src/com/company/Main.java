package com.company;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i < 10; i++)
        {
            array[i] = console.nextInt();
        }

        int min = array[0];

        for(int i = 1; i < 10; i++)
        {
            if(array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(min);
    }
}