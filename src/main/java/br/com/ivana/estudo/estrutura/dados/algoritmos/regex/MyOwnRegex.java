package br.com.ivana.estudo.estrutura.dados.algoritmos.regex;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyOwnRegex {

    public void checker(String pattern){
        Scanner Input = new Scanner(System.in);
        String Test_String = Input.nextLine();
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(Test_String);
        int count = 0;
        while(m.find()){
            count += 1;
        }
        System.out.format("Number of matches : %d",count);
    }

}