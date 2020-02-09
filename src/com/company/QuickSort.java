package com.company;

import java.util.Arrays;
import java.util.Random;

public class QuickSort {

    int size = 10;
    int[] intArray = {10, 3, 5, 9, 8, 4, 1, 3, 7, 2};
    Random random = new Random();
    int low = 0;
    int aux;

    public void buildArray() {

//    for(int i = 0; i<intArray.length;i++){
//
////        intArray[i] = random.nextInt(10)+1;
//        intArray[i] = random.nextInt(10)+1;
//
//    }


        System.out.println(Arrays.toString(intArray));
}
    public void swap() {

        int i = 1;
        int j = 9;

        while (i < j){

            while (intArray[low] > intArray[i]) {
                    i++;
                    if (i == intArray.length-1){
                        aux = intArray[i];
                        intArray[i] = intArray[low];
                        intArray[low] = aux;
                        break;
                    }

            }
            if(i == j){break;}



            while(intArray[low] < intArray[j]) {

                j--;
            }

            aux = intArray[i];
            intArray[i] = intArray[j];
            intArray[j] = aux;
            System.out.println(Arrays.toString(intArray));
            i++;
            j--;
        }

        System.out.println(Arrays.toString(intArray));
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


