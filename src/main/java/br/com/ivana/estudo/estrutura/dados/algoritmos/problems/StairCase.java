package br.com.ivana.estudo.estrutura.dados.algoritmos.problems;

import java.util.HashSet;
import java.util.Set;

public class StairCase {
    /**
     * There's a staircase with N steps, and you can climb 1 or 2 steps at a time. Given N, write a function that returns
     * the number of unique ways you can climb the staircase. The order of the steps matters.
     * <p>
     * For example, if N is 4, then there are 5 unique ways:
     * <p>
     * 1, 1, 1, 1
     * 2, 1, 1
     * 1, 2, 1
     * 1, 1, 2
     * 2, 2
     * What if, instead of being able to climb 1 or 2 steps at a time, you could climb any number from a set of positive
     * integers X? For example, if X = {1, 3, 5}, you could climb 1, 3, or 5 steps at a time.
     * Generalize your function to take in X.
     */
    public static void main(String[] args) {

    }

    public static void stairs(int n) {
        int x[] = {1, 2};
        int soma = 0;
        Set<String> stepsInClimb = new HashSet<>();
        String steps = "";
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x.length; j++) {
                if (soma == n) return;
                else {
                    soma+= i+j;
                }
            }
        }
    }
}

