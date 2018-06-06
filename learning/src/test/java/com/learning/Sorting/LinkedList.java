package com.learning.Sorting;

public class LinkedList
{
   Node head;

   public void printList(Node node)
   {
      while(node !=null)
      {
         System.out.println("List Data ... "+node.data);
         node = node.next;
      }
   }

   public Node reverseList(Node node)
   {
     Node cur= node;
     Node prev=null;
     Node next=null;
      while(cur !=null)
      {
        next=cur.next;
        cur.next=prev;
        prev=cur;
        cur =next;
      }

      node=prev;
      return node;

   }


   public static void main(String args[])
   {
      LinkedList lt = new LinkedList();
      lt.head = new Node(10);
      lt.head.next=new Node(20);
      lt.head.next.next=new Node(30);
      lt.head.next.next.next=new Node(40);
      lt.head.next.next.next.next=new Node(50);
     // lt.printList(lt.head);
      lt.head=lt.reverseList(lt.head);
      lt.printList(lt.head);
   }
}