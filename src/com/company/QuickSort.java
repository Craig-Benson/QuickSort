package com.company;

import java.util.Random;

public class QuickSort {

    int size = 10;
    int[] intArray = new int[10];
    Random random = new Random();


    public void buildArray() {

    for(int i = 0; i<intArray.length;i++){

        intArray[i] = random.nextInt(10)+1;
        System.out.println(intArray[i]);
    }
}
    public void swap(){


        int j= intArray[9];
        int low= intArray[0];
        int aux;

        for(int i =0; intArray[i] < low;i++){


        }







    }

    public static void main(String[] args) {
        QuickSort q = new QuickSort();
        q.buildArray();
        q.swap();




    }
}


