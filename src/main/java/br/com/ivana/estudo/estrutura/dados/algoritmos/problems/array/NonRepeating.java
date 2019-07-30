package br.com.ivana.estudo.estrutura.dados.algoritmos.problems.array;


import java.util.Arrays;

/*First non-repeating integers in an array*/
public class NonRepeating {

    public static void main(String[] args) {
        System.out.println(nonRepeating(new int[]{1,2,3,10,4,1,10}));
    }

    public static int nonRepeating(int[] array) {
        int[] aux = new int[100];
        Arrays.fill(aux,0);
        for (int i = 0; i < array.length; i++) {
            aux[array[i]]+=1;
            if(aux[array[i]]==2){
                return array[i];
            }
        }
        return 0;
    }
}
