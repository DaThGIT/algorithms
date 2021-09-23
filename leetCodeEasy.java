class leetCodeEasy{
    
    public static void main(String[] args) {
        int n = 0;
        for (int i = 123; i < 133; i++) {
            n = reverse(i);
            System.out.println(n);
            System.out.println(reverse(-i));
            int[] posPals = {1221, 1111, 2020, 30491, 123213, 22344322, 21312412, 121};
            for (int j : posPals) {
                System.out.println("\n x = " + j + "\n Palindrom? " + isPalindrome(j));    
            }
        }
    }
    
    public static int reverse(int x){
        int res = 0;
        
        while (x != 0) {
            int pop = x % 10; 
            x = x / 10;
            if (res > Integer.MAX_VALUE/10 || (res == Integer.MAX_VALUE/10 && x%10 > 7)) return 0; 
            if (res < Integer.MIN_VALUE/10 || (res == Integer.MIN_VALUE/10 && x%10 < -8)) return 0;
            res = res * 10 + pop;    
            }    
    
        return res;
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) { 
            ListNode dummy = new ListNode();
            ListNode tail = dummy; 

            while(true){
                if(l1 == null){ 
                    tail.next = l2;
                    break; 
                }

                else if(l2 == null){
                    tail.next = l1;
                    break; 
                }

                if (l1.val <= l2.val){
                    if (l1 != null){
                        ListNode newNode = l1;
                        l1 = l1.next;
                        newNode.next = tail.next; 
                        tail.next = newNode;
                    }
                } 
    
                else {
                    if (l2 != null){
                        ListNode newNode = l2;
                        l2 = l2.next;
                        newNode.next = tail.next; 
                        tail.next = newNode;
                        
                    }
                }
                tail = tail.next; 
            }
        return dummy.next;                     
    }
    
    public static boolean isPalindrome(int x) {
        if (x < 0) return false; 
        int copy, res, rem;
        copy = x;
        res = 0; 

        System.out.println("\n is x a Palindrome? \n" +
                           "\n x = " + x);
        while(copy!=0) {
            rem = copy % 10; 
            res = (res * 10) + rem;
            copy = copy /10; 
            System.out.println("\n copy = " + copy + 
                               "\n" + " remainder = " + rem + 
                               "\n" + " temp result = " + res);
        }
        System.out.println("\n result: " + res);
        
        if (x == res) return true;
        
        return false;    
    }
}

 // Definition for singly-linked list.
class ListNode{
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
 