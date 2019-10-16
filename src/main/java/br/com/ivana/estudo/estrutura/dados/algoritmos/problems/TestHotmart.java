package br.com.ivana.estudo.estrutura.dados.algoritmos.problems;

import java.util.*;

public class TestHotmart {


    public static void main(String[] args) {
//        System.out.println(usernamesSystem(Arrays.asList("alex","xylos", "alex", "alan")).toString());
        System.out.println(usernamesSystem(Arrays.asList("john", "john1", "tom", "john1")).toString());
    }

    public static List<String> usernamesSystem(List<String> u) {
        List<String> copy = new ArrayList<>();
        int count = 1;
        if (!hasDuplicates(u)) {
            return u;
        } else {
            for (int i = 0; i < u.size(); i++) {
                if (!copy.contains(u.get(i))) {
                    copy.add(u.get(i));
                } else {
                    String oldValue = u.get(i);
                    if (alreadyCounted(oldValue)) {
                        int numberOfTimeCounted = Character.getNumericValue(oldValue.charAt(oldValue.length() - 1));
                        numberOfTimeCounted++;
                        oldValue = oldValue.substring(0, oldValue.length() - 1);
                        oldValue += String.valueOf(numberOfTimeCounted);
                        u.set(i,oldValue);
                    } else {
                        String newValue = oldValue + String.valueOf(count);
                        if(u.contains(newValue)){
                            count++;
                            newValue= oldValue + String.valueOf(count);
                            u.set(i,newValue);
                        }else {
                            u.set(i, oldValue + String.valueOf(count));
                        }
                    }
                }
            }
        }
        return u;
    }

    public static boolean hasDuplicates(List<String> lista) {
        Set<String> set = new HashSet<String>(lista);
        if (set.size() < lista.size()) return true;
        return false;
    }

    public static boolean alreadyCounted(String nome) {
        return nome.matches(".*([0-9])$");
    }
}
