package br.com.ivana.estudo.estrutura.dados.algoritmos.data.structure;

public class Queu {
    private static class Node {
        private int data;
        private Node next;

        private Node(int data) {
            this.data = data;
        }
    }

    private Node head; // remove from the head
    private Node tail; // add things

    public boolean isEmpty() {
        return head == null;
    }

    public int peek() {
        return head.data;
    }

    public void add(int data) {
        Node node = new Node(data);
        if (tail != null) {
            tail.next = node;
        }
        tail = node;
        if (head == null) head = node;
    }

    public int remove() {
        int dataRemoved = head.data;
        head = head.next;
        if (head == null) tail = null;
        return dataRemoved;
    }
}
