package br.com.ivana.estudo.estrutura.dados.algoritmos.problems;

import java.util.ArrayList;
import java.util.List;

public class ComputesVsMembers {

    /*
     * Complete the 'answerQuery' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER k
     */

    static List<List<Integer>> result = new ArrayList<>();

    public static long answerQuery(int n, int k) {
        int count = 0;
        findCombinations(n);
        for(List<Integer> lista: result){
            if(!(lista.size() >k)){
                count++;
            }
        }
        return count;
    }


    static void findCombinationsUtil(int arr[], int index,
                                     int num, int reducedNum) {

        if (reducedNum < 0) return;

        if (reducedNum == 0) {

            List<Integer> intList = new ArrayList<Integer>();
            for (int i =0 ; i<index ; i++){
                intList.add(arr[i]);
            }
            result.add(intList);
            return;
        }

        int prev = (index == 0) ?
                1 : arr[index - 1];


        for (int k = prev; k <= num; k++) {

            arr[index] = k;

            // call recursively with
            // reduced number
            findCombinationsUtil(arr, index + 1, num,
                    reducedNum - k);
        }
    }

    static void findCombinations(int n) {
        // array to store the combinations
        // It can contain max n elements
        int arr[] = new int[n];
        findCombinationsUtil(arr, 0, n, n);
    }

    public static void main(String[] args) {
        System.out.println(answerQuery(7,3));
    }

}
