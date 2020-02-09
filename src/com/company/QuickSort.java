package com.company;

import java.util.Arrays;
import java.util.Random;

public class QuickSort {

//    int size = 10;
//    int[] intArray = new int[size];
//    Random random = new Random();
//    int low = 0;
//    int aux;
//
//    public void buildArray() {
//
//    for(int i = 0; i<intArray.length;i++){
//
//    intArray[i] = random.nextInt(10)+1;
//
//
//    }
//public void buildArray() {
//
//    for(int i = 0; i<intArray.length;i++){
//
//        intArray[i] = random.nextInt(10)+1;
//
//System.out.println(Arrays.toString(intArray));
//    }
//}

    int size = 10;
    int[] intArray = {7, 2, 2, 4, 1, 10, 1, 1, 8, 9};
    Random random = new Random();
    int low = 0;
    int aux;





    public void swap() {
        System.out.println(Arrays.toString(intArray));
        int i = 1;
        int j = 9;

        while (i < j) {

            while (intArray[low] > intArray[i]) {
                i++;
                if (i == intArray.length - 1) {
                    aux = intArray[i];
                    intArray[i] = intArray[low];
                    intArray[low] = aux;
                    break;
                }

            }
            if (i == j) {
                break;
            }


            while (intArray[low] < intArray[j]) {

                j--;
            }

            if (intArray[i] == intArray[j]) {
                i++;
                j--;
            }
            aux = intArray[i];
            intArray[i] = intArray[j];
            intArray[j] = aux;
            System.out.println(Arrays.toString(intArray));

        }

        System.out.println(Arrays.toString(intArray));
    }


    public static void main(String[] args) {
        QuickSort q = new QuickSort();
//        q.buildArray();
        q.swap();




    }
}


