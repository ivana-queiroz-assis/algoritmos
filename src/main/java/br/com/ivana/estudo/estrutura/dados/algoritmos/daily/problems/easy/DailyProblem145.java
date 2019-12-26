package br.com.ivana.estudo.estrutura.dados.algoritmos.daily.problems.easy;

import java.util.LinkedList;

public class DailyProblem145 {

    public static void main(String[] args) {
        forceBrute();
        cleverWay();

    }
    private static void cleverWay() {

    }
    private static void forceBrute() {
        LinkedList<Integer> singleLinkedLis = new LinkedList<>();
        int aux = 0;

        singleLinkedLis.add(1);
        singleLinkedLis.add(2);
        singleLinkedLis.add(3);
        singleLinkedLis.add(4);

        for (int i = 0; i < singleLinkedLis.size(); i++) {
           if ( i % 2 == 0) { //save in aux
               aux = singleLinkedLis.get(0);
           } else { // swap
               singleLinkedLis.set(i-1, singleLinkedLis.get(i));
               singleLinkedLis.set(i, aux);
           }
        }
        singleLinkedLis.forEach(s -> System.out.println(s));
    }

}
