class LC2096DeleteTheMiddleNodeOfALinkedList {
    class ListNode {
        int val;
        ListNode next;
        ListNode() { }
        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    class Solution {
        public void run() {
            ListNode h7 = new ListNode(6);
            ListNode h6 = new ListNode(2, h7);
            ListNode h5 = new ListNode(1, h6);
            ListNode h4 = new ListNode(7, h5);
            ListNode h3 = new ListNode(4, h4);
            ListNode h2 = new ListNode(3, h3);
            ListNode h1 = new ListNode(1, h2);

            deleteMiddle(h1);
            System.out.println(h1.val);
            while (h1.next != null) {
                System.out.println(h1.next.val);
                h1 = h1.next;
            }
        }

        /**
         * Time Complexity: O(N)
         * Space Complexity: O(1)
         * Two Pointer approach. 
         * Slow ListNode moves through LinkedList by 1
         * Fast ListNode moves through LinkedList by 2
         * Temp ListNode moves through LinkedList by 1, 1 behind the Slow ListNode
         * Since the Slow ListNode moves through the LinkedList at half the speed, by the time the Fast 
         *   ListNode has reached the end, the Slow ListNode will be halfway through the LinkedList. Remove the 
         *   middle ListNode by changing Temp ListNode next value to Slow ListNodes next value.
         */
        public ListNode deleteMiddle(ListNode head) {
            if ( head == null || head.next == null) 
                return null;
            ListNode slow = head;
            ListNode fast = head;
            ListNode temp = head;

            while (fast != null && fast.next != null) {
                temp = slow;
                slow = slow.next;
                fast = fast.next.next;
            }
            temp.next = slow.next;
            return head;
        }
    }   

    public LC2096DeleteTheMiddleNodeOfALinkedList() {
        Solution s = new Solution();
        s.run();
    }
}

