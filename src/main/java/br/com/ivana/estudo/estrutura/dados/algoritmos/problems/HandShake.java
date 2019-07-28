package br.com.ivana.estudo.estrutura.dados.algoritmos.problems;

import java.io.BufferedReader;
import java.nio.file.Files;

public class HandShake {

    int handshake(int n) {
        /*
         At the annual meeting of Board of Directors of Acme Inc, every one starts shaking hands with everyone else in the room.
          Given the fact that any two persons shake hand exactly once, Can you tell the total count of handshakes?
         */
        if(n==1 || n==0) return 0;
        else return (n-1) + handshake(n-1);
    }



}
