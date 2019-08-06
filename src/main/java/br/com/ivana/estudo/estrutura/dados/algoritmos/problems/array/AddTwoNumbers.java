package br.com.ivana.estudo.estrutura.dados.algoritmos.problems.array;

import java.util.List;


/*
* You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example:

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.
* */
public class AddTwoNumbers {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        String stringL1= "";
        String stringL2= "";
        StringBuilder input1 = new StringBuilder();
        StringBuilder input2 = new StringBuilder();
        while (l1.next != null){
            stringL1 += String.valueOf(l1.val);
            l1= l1.next;
        }
        while (l2.next != null){
            stringL2 += String.valueOf(l2.val);
            l2= l2.next;
        }
        input1.append(stringL1);
        input1 = input1.reverse();

        input2.append(stringL2);
        input2 = input2.reverse();

        int numberL1 = Integer.parseInt(input1.toString());
        int numberL2 = Integer.parseInt(input2.toString());
        int total = numberL1 + numberL2;

        ListNode totalListNode = new ListNode();

    }
}
