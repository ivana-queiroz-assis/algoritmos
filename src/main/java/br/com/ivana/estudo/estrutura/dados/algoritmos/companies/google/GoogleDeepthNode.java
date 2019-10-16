package br.com.ivana.estudo.estrutura.dados.algoritmos.companies.google;

import java.util.Stack;

/*
* Given the root of a binary tree, return a deepest node.*/
public class GoogleDeepthNode {

    static int maxDeepest=0;
    static Stack<Node> fila= new Stack<>();

    public static void main(String[] args) {
        Node node = new Node(1);
        node.left = new Node(1);
        node.left.left = new Node(1);
        largura(node);
        System.out.println(maxDeepest);
    }

    public static void traverseInOrder(Node node){
       if (node != null) {
           System.out.println("Entrando 1 nível");
           traverseInOrder(node.left);
           System.out.println(" " + node.value);
           System.out.println("Tentando visitar nó direita");
           traverseInOrder(node.right);
       }
    }

    public static void largura(Node node){
        if(node!=null){
            if(node.left!=null){
                fila.push(node.left);
            }
            if(node.right!=null){
                fila.push(node.right);
            }
            maxDeepest++;
            if(!fila.empty())  largura(fila.pop());
        }
    }

    public static class Node{
        int value;
        Node left;
        Node right;

        public Node(int value){
            this.value = value;
        }
    }
}
