package br.com.ivana.estudo.estrutura.dados.algoritmos.regex;

public class Aula02 {

    public static void main(String[] args) {

        MyOwnRegex tester = new MyOwnRegex();
        //06-11-2015
        //The expression \d matches any digit [0-9].
        //The expression \D matches any character that is not a digit.
        tester.checker("\\d\\d\\D\\d\\d\\D\\d\\d\\d\\d");

    }
}
