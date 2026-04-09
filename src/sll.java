//import java.util.Scanner;
//
//class node {
//    int data;
//    node next;
//
//    node(int data) {
//        this.data = data;
//        this.next = null;
//    }
//}
//
//public class sll {
//    node head;
//    node temp;
//    node fast;
//    void create(int data) {
//        node newnode = new node(data);
//        if (head == null) {
//            head = newnode;
//            temp = newnode;
//        } else {
//            temp.next = newnode;
//            temp = newnode;
//        }
//    }
//    void display(node head) {
//        node temp = head;
//        while (temp!= null) {
//            System.out.print(temp.data+" ");
//            temp = temp.next;
//        }
//    }
//    node reverse(node head){
//        temp=head;
//        node prev=null;
//        node next=null;
//        while(temp!=null){
//            next= temp.next;
//            temp.next=prev;
//            prev=temp;
//            temp=next;
//        }
//        return prev;
//    }
//    node mid(){
//        node slow=head;
//        node fast=head;
//        while(fast!=null&& fast.next!=null){
//            slow=slow.next;
//            fast=fast.next.next;
//        }
//        return slow;
//    }
//    void palindrome(node head,node head2){
//        boolean flag=true;
//        while(head2.next!=null){
//            if(head.data!=head2.data){
//                flag=false;
//                break;
//            }
//            head=head.next;
//            head2=head2.next;
//        }
//        if(flag)System.out.print("palindrome");
//        else System.out.print("not");
//    }
//    node reversek(node head, int k) {
//        node temp = head;
//        for (int i = 0; i < k; i++) {
//            temp = temp.next;
//        }
//        node curr = head;
//        node prev=null;
//        node nextnode=null;
//        for (int i = 0; i < k; i++) {
//            reverse(curr);
//        }
//        if (nextnode != null) {
//            head.next = reversek(nextnode, k);
//        }
//
//        return prev;
//    }
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        sll obj= new sll();
//        for(int i=1;i<9;i++){
//            obj.create(i);
//        }
////        for(int i=2;i>0;i--){
////            obj.create(i);
////        }
//        obj.display(obj.head);
//        node temp3=obj.reversek(obj.head,3);
//        obj.display(temp3);
////        node temp =obj.mid();
////        System.out.println();
////        obj.display(temp);
////        System.out.println();
////        node temp2=obj.reverse(temp);
////        obj.display(temp2);
////        obj.palindrome(obj.head,temp2);
//
//    }
//}