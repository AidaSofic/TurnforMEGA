package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanning = new Scanner(System.in);

        int k = scanning.nextInt(); //number of cars which CAN pass on green in 1 minute
        int n = scanning.nextInt(); //observation with camera started n minutes ago

        int a = scanning.nextInt();// the number of cars that approached the turn in a1 minute
        int b = scanning.nextInt();//the number of these integers(a,b,c) will be the same as n (3 minutes of observation = 3 integers...)
        int c = scanning.nextInt();
        //output = number of cars currently standing at the turn


        //4 3
        //3 4 5
        //For example: in first minutes it comes 3 cars (int a). All pass, because 4 cars can pass in one minute.
        //In second minute, all pass, because the number of cars is the same (4=4). In this moment there is no car on the road.
        //in the third minute 5 cars comes. 4 can pass, so 1 stays behind and the answer is 1.

       // 3 - 4 = -1 = 0 (a - k)
        //4 - 4 = 0 (b - k)
        //5 - 4 = 1 (c - k)
        //output is 1


        int m = a - k;
        if (m < 1){
            m = 0;}

        int g = (b - k) + m;

        int l = g + (c - k);

        System.out.println(l);
        }
    }

        //I know that this is not the final solution, and that I need to do this more complex and better. I guess it would be easier
        //to put the a,b,c integers in array, but I am not sure how to do it from that. But I think I understand the problem. With
        //this code above it works, but only for this 3 integers (number of cars which approach). So, if I want to have more minutes
        // than three, I can't, or I should write more integers, and change the whole code every time.
        // Should I use arrays and integers and which loop you think I should use?

         /*int[] cars = new int[3];
        int i = 0;
        cars[i] = scanning.nextInt();

            }}*/






