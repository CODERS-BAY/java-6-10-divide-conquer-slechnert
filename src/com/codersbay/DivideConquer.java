package com.codersbay;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class DivideConquer {


    public static int findMax(int[] array) {
        int half = (array.length) / 2;
        int maxFront;
        int maxBack;
        if (array.length >= 3) {

            int[] front = new int[half];
            int[] back;

            if (array.length % 2 == 0) {
                back = new int[half];
            } else {
                back = new int[half + 1];
            }

            for (int i = 0; i < front.length; i++) {
                front[i] = array[i];
            }
            for (int j = 0; j < back.length; j++) {
                back[j] = array[front.length + j];
            }
            maxFront = findMax(front);
            maxBack = findMax(back);
        } else if (array.length == 2) {
            if (array[0] > array[1]) {
                return array[0];
            } else return array[1];
        } else return array[0];

        int max;
        if (maxFront > maxBack) {
            max = maxFront;
        } else {
            max = maxBack;
        }
        return max;
    }


    private static int[] randomArray(int length, int girth) {
        int[] randomArray = new int[length];
        int i = 0;
        while (i < length) {
            Random rando = new Random();
            randomArray[i] = rando.nextInt(girth + 1);
            ++i;
        }
        return randomArray;
    }


    public static void main(String[] args) {

        System.out.println("How long should the array be?");
        Scanner sc = new Scanner(System.in);
        int arrayLength = sc.nextInt();

        System.out.println("What should be the highest possible number?");
        Scanner sc2 = new Scanner(System.in);
        int highestRandom = sc2.nextInt();

        int myArray[] = randomArray(arrayLength, highestRandom);

        System.out.println(Arrays.toString(myArray));

        System.out.println(findMax(myArray));


    }

}

