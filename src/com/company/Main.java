package com.company;

import java.util.Random;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

                long seed = 792839098;
                Random random = new Random(seed);
                int Array[] = new int[20];
                for (int i = 0; i < Array.length; i++) {
                    Array[i] = random.nextInt();
                }


        for (int i = 0; i < Array.length; i++)
            System.out.println(Array[i]);

        int sum = 0;
        
        for( int num : Array) {
            // суммирование каждого элемента массива
            sum = sum + num;
        }
        System.out.println("Сумма элементов массива равна: " + sum);
        if (sum % 2 == 0)
            System.out.println("Число четное");
        else
            System.out.println("Число нечетное");


    }
}
