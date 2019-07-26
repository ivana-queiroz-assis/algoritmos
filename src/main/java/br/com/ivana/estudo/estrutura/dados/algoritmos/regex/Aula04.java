package br.com.ivana.estudo.estrutura.dados.algoritmos.regex;

public class Aula04 {

    // The expression \w will match any word character. And characters (a-z,A-Z and 0-9) and underscores (_).
    // \W matches any non-word character.

    //www.hackerrank.com
    public static void main(String[] args) {

        MyOwnRegex tester = new MyOwnRegex();
        tester.checker("\\w\\w\\w\\W\\w\\w\\w\\w\\w\\w\\w\\w\\w\\w\\W\\w\\w\\w"); // Use \\ instead of using \

    }
}
