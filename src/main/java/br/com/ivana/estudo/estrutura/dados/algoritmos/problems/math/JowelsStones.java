package br.com.ivana.estudo.estrutura.dados.algoritmos.problems.math;

//You're given strings J representing the types of stones that are jewels, and S representing the stones you have.
// Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.

import br.com.ivana.estudo.estrutura.dados.algoritmos.AlgoritmosApplication;
import org.springframework.boot.SpringApplication;

//The letters in J are guaranteed distinct, and all characters in J and S are letters. Letters are case sensitive,
// so "a" is considered a different type of stone from "A".
public class JowelsStones {

	public static int numJewelsInStones(String J, String S) {
		int countJewels = 0;
		for(int i=0;i<J.length();i++){
			for(int j=0;j<S.length();j++){
				if(J.charAt(i)== S.charAt(j)){
					countJewels++;
				}
			}
		}
		return countJewels;
	}
	public static void main(String[] args) {
		System.out.println(numJewelsInStones("aA","aAAbbbb"));
	}
}
