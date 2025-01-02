import org.w3c.dom.NodeList;

class ListNode {
    public  int val;
     public  ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    public int getVal(){
          return this.val;
    }
  }

public class Leetcode206_ReverseLinkedList {


    public static void main(String[] args) {
        ListNode root = new ListNode(1);
        root.next = new ListNode(2);
        root.next.next = new ListNode(3);
        root.next.next.next = new ListNode(4);
        root.next.next.next.next = new ListNode(5);
        printList(root);
        ListNode newRoot = reverseList(root);
        System.out.println("printing reverse");
        printList(newRoot);
    }

    public static void printList(ListNode root){
        ListNode head = root;
        while(head != null){
            System.out.print(head.getVal());
            if(head.next != null){
                System.out.print(" -> ");
            }
            head = head.next;
        }
    }


    public static ListNode reverseList(ListNode head) {
        ListNode prev =null;
        ListNode current  = head;
        ListNode next = null;
//        current = head;
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
    }


