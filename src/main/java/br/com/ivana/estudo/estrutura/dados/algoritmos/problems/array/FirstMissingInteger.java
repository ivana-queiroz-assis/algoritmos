package br.com.ivana.estudo.estrutura.dados.algoritmos.problems.array;


import java.util.Arrays;

/*
* Given an array of integers, find the first missing positive integer in linear time and constant space.
* In other words, find the lowest positive integer that does not exist in the array.
* The array can contain duplicates and negative numbers as well.

For example, the input [3, 4, -1, 1] should give 2. The input [1, 2, 0] should give 3.
* */
public class FirstMissingInteger {
    public static void main(String[] args) {
       System.out.println(firstMissingInteger(new int[]{3,4,-1,1}));
        System.out.println(firstMissingInteger(new int[]{1,2,0}));
        System.out.println(firstMissingInteger(new int[]{1,2,3,4,5,6,7,8,10}));

    }

    public static int firstMissingInteger(int[] array){
        int a = 1;
        int max= 0;
       for(int i=0;i<array.length;i++){
            if(array[i]>max){
                max=array[i];
            }
            if(array[i]<0){
                array[i]=0;
            }
       }
       int[] aux = new int[max+1];
       Arrays.fill(aux,0);
       for(int i=0;i<array.length;i++){
            aux[array[i]]=1;
       }
       for(int i=1;i<aux.length;i++){
           if(aux[i]==0){
               return i;
           }
       }
       return aux.length;
    }
}
