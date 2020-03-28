package br.com.ivana.estudo.estrutura.dados.algoritmos.daily.problems.medium;

import java.util.ArrayList;
import java.util.List;

// You are given an array of integers, where each element represents the maximum number of steps that can be jumped
// going forward from that element. Write a function to return the minimum number of jumps you must take in order to
// get from the start to the end of the array.
public class DailyProblem245 {

    private  static  int[] array = {6, 2, 4, 0, 5 , 1, 1 , 4, 2 , 9};
    public static void main(String[] args) {
        buscaMelhorCombinacao().forEach( x-> System.out.println(x));
    }

    public static List<Integer> buscaMelhorCombinacao(){
        List<Integer> melhorCaminho = new ArrayList<>();
        melhorCaminho.add(array[0]);
        boolean fimArray =false;
        int nextJump = 0;
        int somaActualJumps = array[0];
        while(!fimArray){
            nextJump = findBiggestJump(nextJump, array[nextJump]);
            if (somaActualJumps > array.length) fimArray = true;
            melhorCaminho.add(array[nextJump]);
            somaActualJumps = melhorCaminho.stream()
                    .mapToInt(Integer::intValue)
                    .sum();
        }
        return melhorCaminho;
    }

    public static Integer findBiggestJump( int inicialPosicao, int qntidadeJumps){
        int maxValue = 0 ;
        int posicaoMaxValue = 0;
        int proximoItem = inicialPosicao +1;
        for(int i=proximoItem; i < proximoItem + qntidadeJumps ; i++){
            if( maxValue < array[i]){
                maxValue= array[i];
                posicaoMaxValue = i;
            }
        }
        return posicaoMaxValue;
    }
}
