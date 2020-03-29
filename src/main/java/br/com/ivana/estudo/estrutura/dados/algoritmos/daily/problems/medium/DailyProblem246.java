package br.com.ivana.estudo.estrutura.dados.algoritmos.daily.problems.medium;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

//Given a list of words, determine whether the words can be chained to form a circle. A word X can be placed in front of another word Y in a circle if the last character of X is same as the first character of Y.

//For example, the words ['chair', 'height', 'racket', touch', 'tunic'] can form the following circle: chair --> racket --> touch --> height --> tunic --> chair.
public class DailyProblem246 {


    public static void main(String[] args) {
        new DailyProblem246().run();
    }

    public void run(){
        List<String> possibleChain = Arrays.asList("chair", "height", "racket", "touch", "tunic" );

        System.out.println("Can be chained in form a circle ? " + canBeChainedInCircle(possibleChain));
    }

    public boolean canBeChainedInCircle(List<String> possibleChain ){
        LinkedList<String> chainSet = new LinkedList<>();
        LinkedList<String> auxChainRestantsElements = new LinkedList<>(possibleChain);


        chainSet.add(possibleChain.get(0));
        auxChainRestantsElements.remove(possibleChain.get(0));
        for(int j= 1;j<possibleChain.size(); j++){
            //search in the next element of the chain
            for (int i=0; i< possibleChain.size(); i++){
                // not the last element of the chain
               if(j != possibleChain.size()-1) {
                   if (canInsert(auxChainRestantsElements.get(i), chainSet.get(chainSet.size()- 1))) {
                       chainSet.add(auxChainRestantsElements.get(i));
                       auxChainRestantsElements.remove(i);
                       break;
                   }
                   // last element of the possible chain
               }else{
                   if (canInsert(chainSet.get(0), auxChainRestantsElements.get(i))) {
                       chainSet.add(auxChainRestantsElements.get(i));
                       auxChainRestantsElements.remove(i);
                       break;
                   }
               }
            }
        }
        return true;
    }

    public boolean canInsert(String stringToInsert, String lastStringChain){
        char lastCharacter = lastStringChain.charAt(lastStringChain.length() - 1);

        if(stringToInsert.startsWith(String.valueOf(lastCharacter))){
            return true;
        }else {
            return false;
        }
    }
}
