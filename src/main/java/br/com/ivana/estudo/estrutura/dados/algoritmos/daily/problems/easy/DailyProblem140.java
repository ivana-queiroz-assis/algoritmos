package br.com.ivana.estudo.estrutura.dados.algoritmos.daily.problems.easy;

public class DailyProblem140 {
    public static void main(String[] args) {
        int[] lista = {2,4,6,8,10,2,6,10};

        int[] countOcorrencies = new int[11];
        int[] aux = new int[lista.length];

        //count the ocorrencies
        for (int i = 0; i < lista.length; i++) {
            countOcorrencies[lista[i]] += 1;
        }

        for (int i = 0; i < countOcorrencies.length ; i++) {
            System.out.println(countOcorrencies[i]);
        }


    }
}
