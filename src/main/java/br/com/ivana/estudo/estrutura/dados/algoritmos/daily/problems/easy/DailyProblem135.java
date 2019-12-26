package br.com.ivana.estudo.estrutura.dados.algoritmos.daily.problems.easy;

import br.com.ivana.estudo.estrutura.dados.algoritmos.arvore.No;

public class DailyProblem135 {

    public static void main(String[] args) {
        No root = new No(10L);
        No rootCopy = root;
        for (int i=1; i<10;i++){
            if(i%2 == 1) {
                No no= new No((long)(i));
                root.setLeft(no);
                root = no;
            }
            else {
                No no = new No((long) (i));
                root.setRight(no);
                root = no;
            }
        }
        rootCopy.printInOrder();
        System.out.println(rootCopy.findMinimumPath());
    }


}
