package com.company;

import java.util.Random;

public class QuickSort {

    int size = 10;
    int[] intArray = new int[10];
    Random random = new Random();
    int low = 0;
    int aux;

    public void buildArray() {

    for(int i = 0; i<intArray.length;i++){

        intArray[i] = random.nextInt(10)+1;
        System.out.println(intArray[i]);
    }
}
    public void swap() {

        int i = 1;
        int j = 9;

        while (i < j){
            while (intArray[i] < intArray[low]) {
                i++;
            }
            aux = intArray[i];

            while(intArray[j] > intArray[low]) {

                j--;
            }


            intArray[i] = intArray[j];
            intArray[j] = aux;
        }
        }



//    public boolean isSorted(){
//      if(intArray[low] > intArray[] ==)
//    }

    public static void main(String[] args) {
        QuickSort q = new QuickSort();
        q.buildArray();
        q.swap();




    }
}


