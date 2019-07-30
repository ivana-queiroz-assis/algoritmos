package br.com.ivana.estudo.estrutura.dados.algoritmos.problems.array;

import java.util.Arrays;


/**
 * Find the second minumum element of an array
 * */
public class SecondMinimum {

    public static void main(String[] args) {
        System.out.println("Second minumum: "+ secondMinimumIterative(new int[]{1,110,10,11,12,9}));
    }

    public static int secondMinimumIterative(int[] array){
        int firstMin = 999999999;
        int secondMin = 9999999;

        for (int i=0;i<array.length;i++){
            if(array[i]<firstMin){
                firstMin = array[i];
            }
        }

        for(int i=0;i<array.length;i++){
            if(array[i]> firstMin && array[i] < secondMin){
                secondMin = array[i];
            }
        }
        return secondMin;
    }
}
