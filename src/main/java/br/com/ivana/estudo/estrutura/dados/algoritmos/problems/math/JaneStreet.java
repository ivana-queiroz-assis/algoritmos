package br.com.ivana.estudo.estrutura.dados.algoritmos.problems.math;

/*
 * cons(a, b) constructs a pair, and car(pair) and cdr(pair) returns the first and last element of that pair.
 * For example, car(cons(3, 4)) returns 3, and cdr(cons(3, 4)) returns 4.
 * */
public class JaneStreet {

    public static class cons {
        int first;
        int last;

        public cons(int first, int last) {
            this.first = first;
            this.last = first;
        }
    }

    // return first element of that pair
    public static int car(cons cons) {
        return cons.first;
    }

    // return last element of that pair
    public static int cdr(cons cons) {
        return cons.last;
    }

    public static void main(String[] args) {
        System.out.println("First element: " + car(new cons(3, 4))+ " deve ser igual a 3.");
        System.out.println("Last element: " + car(new cons(3, 4))+ " deve ser igual a 4.") ;
    }
}
