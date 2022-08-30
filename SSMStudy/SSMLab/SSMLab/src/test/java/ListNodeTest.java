import java.util.LinkedList;

/**
 * @Author: CXB
 * @ClassName: ListNodeTest
 * @Date: 2022/8/30 1:16
 * @Description: //TODO
 * @Version: V1.0
 **/
public class ListNodeTest {
    //      Definition for singly-linked list.

    public static void main(String[] args) {
        ListNode l1=new ListNode(-1);
        ListNode p1=l1;
        ListNode l2= new ListNode(-1);
        ListNode p2=l2;
        for (int i = 0; i < 5; i++) {
           p1.next= new ListNode(i+3);p1=p1.next;
           p2.next= new ListNode(i+3);p2=p2.next;
        }
        new Solution().addTwoNumbers(l1.next,l2.next);
    }
}
     class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }

    }
    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            //在此处写入代码
            LinkedList<Integer> stack = new LinkedList<Integer>();
            ListNode p1 = l1;
            while (p1 != null) {
                stack.push(p1.val);
                p1 = p1.next;
            }
            LinkedList<Integer> stack2 = new LinkedList<Integer>();
            ListNode p2 = l2;
            while (p2 != null) {
                stack2.push(p2.val);
                p2 = p2.next;
            }
            ListNode res = new ListNode(-1);
            int num = 0;
            int carry = 0;

            while (!(stack.isEmpty()) || !(stack2.isEmpty())) {
                int a = stack.isEmpty() ? 0 : stack.pop();
                int b = stack2.isEmpty() ? 0 : stack2.pop();
                int sum = a + b;
                num = sum % 10;
                ListNode curr = new ListNode(num+carry);
                carry = sum / 10;
                curr.next = res.next;
                res.next = curr;
            }
            return res.next;

        }
    }

