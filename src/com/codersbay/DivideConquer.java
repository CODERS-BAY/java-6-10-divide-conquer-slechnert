package com.codersbay;

public class DivideConquer {

    public static void main(String[] args) {
        System.out.println("Divide and conquer");


    }

    private static int[] split(int[] array) {
        int half = (array.length) / 2;

        //zu klein, kein split
        if (array.length < 3) {
            return array;
        }

        //split
        int[] front = new int[half];
        int[] back;
        //halbieren, ungerade anpassen
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

        front = split(front);
        back = split(back);

        int[] newArray = new int[array.length];
        newArray = merge(front, back);

    }

    private static int[] merge(int[] front, int[] back) {

    }


}

