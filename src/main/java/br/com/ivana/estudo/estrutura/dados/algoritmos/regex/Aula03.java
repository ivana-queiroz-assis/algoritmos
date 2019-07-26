package br.com.ivana.estudo.estrutura.dados.algoritmos.regex;

public class Aula03 {

    public static void main(String[] args) {

        MyOwnRegex tester = new MyOwnRegex();
        //12 11 15
        //\S matches any non-white space character
        //\s matches any white space character
        tester.checker("\\S\\S\\s\\S\\S\\s\\S\\S"); // Use \\ instead of using \

    }
}
