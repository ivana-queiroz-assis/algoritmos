package br.com.ivana.estudo.estrutura.dados.algoritmos.problems.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class PickingNumbers {

    public static int pickingNumbers(List<Integer> a) {
        int count = 0;
        List<Integer> subArray = new ArrayList<>();
        a.sort(Comparator.naturalOrder());
        boolean firstItemFound = true;
        int j = 1;
        for (int i = 0; i < a.size(); i++) {
            if (j < a.size()) {
                if (Math.abs(a.get(j) - a.get(i)) == 1 || Math.abs(a.get(j) - a.get(i)) == 0) {
                    if (firstItemFound) {
                        j = i;
                        firstItemFound = false;
                    }
                    count++;
                } else {
                    subArray.add(count);
                    count = 0;
                    firstItemFound = true;
                    j++;
                }
            }
        }
        return subArray.stream().max(Comparator.naturalOrder()).get();
    }

    public static void main(String[] args) {
        System.out.println(pickingNumbers(Arrays.asList(4, 6, 5, 3, 3, 1)));
    }
}
