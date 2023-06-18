package leetcode.algorithm;

import lombok.Data;

public class Application {
    public static void traverse(ListNode root) {
        if (root == null) {
            return;
        }
        traverse(root.next);
        System.out.println(root.val);
    }

    public static void main(String[] args) {
        ListNode root = new ListNode(1);
        root.next = new ListNode(2);
        traverse(root);
    }
}

@Data
class ListNode {
    ListNode next;
    int val;

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode() {
    }
}