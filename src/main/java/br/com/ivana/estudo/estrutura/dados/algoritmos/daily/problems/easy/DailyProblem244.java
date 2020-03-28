package br.com.ivana.estudo.estrutura.dados.algoritmos.daily.problems.easy;

import java.util.HashSet;
import java.util.Set;


//The Sieve of Eratosthenes
public class DailyProblem244 {

    public static Set<Integer> markedNumbers = new HashSet<>();
    public static Set<Integer> primesNumbers = new HashSet<>();

    public static void main(String[] args) {
        Integer number = new Integer(100);
        // add the numbers primes in markedNumbers
        for(int i=2;i< number;i++){
            markNumbers(i, number);
        }
        collectPrimeNumbers(number);
        primesNumbers.forEach( n-> System.out.println(n));
    }

    public static void markNumbers(int markMultiples, int limit){
        for (int i=2; i<limit;i++){
            markedNumbers.add(i*markMultiples);
        }
    }

    public static void collectPrimeNumbers( int limit){
        for (int i=2; i<limit;i++){
           if( ! markedNumbers.contains(i)){
               primesNumbers.add(i);
           }
        }
    }

}
