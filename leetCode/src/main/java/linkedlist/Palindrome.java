package linkedlist;

import java.util.Stack;

public class Palindrome {
    public static class Node {
        public int Value;
        public Node next;
        public Node(int value) {
            this.Value = value;

        }
    }
    public static boolean isPalindrome1(Node head){
        Stack<Node> stack = new Stack<Node>();
        Node cur = head;
        while (cur != null) {
            stack.push(cur);
            cur = cur.next;
        }
        while (head != null) {
            if (head.Value != stack.pop().Value) return false;
            head = head.next;
        }
        return true;
    }

    public static boolean isPalindrome2(Node head){
        if (head == null|| head.next == null) return true;
        Node cur = head;
        Node right = head.next;
        while (cur.next != null&& cur.next.next != null) {
            right = right.next;
            cur = cur.next.next;
        }
        Stack<Node> stack = new Stack<Node>();
        while (right != null) {
            stack.push(right);
            right = right.next;
        }
        while (!stack.isEmpty()){
            if (head.Value != stack.pop().Value) return false;
            head = head.next;
        }
        return true;
    }
}
