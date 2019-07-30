package br.com.ivana.estudo.estrutura.dados.algoritmos.problems.array;

import java.util.Arrays;

public class UberArray {

    public static void main(String[] args) {
        int array[] = new int[]{1,2,3,4,5};

        System.out.println(Arrays.toString(productAllOtherNumbersIterative(array)));
    }

    /*Given an array of integers, return a new array such that each element at index i of the new array is the product of all the numbers in the original array except the one at i.*/
    public static int[] productAllOtherNumbersIterative(int[] array){
        int[] productAllOtherNumbers = new int[array.length];
        int mult = 1;
        for (int i=0;i<array.length;i++){
            for (int j=0;j<array.length;j++){
                if(i!= j){
                   mult*=array[j];
                }
            }
            productAllOtherNumbers[i] = mult;
            mult=1;
        }
        return productAllOtherNumbers;
    }

}
