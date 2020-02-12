/*
This class define a linked list that stores integer values.
*/

public class LinkedList_Nathan_Neeley
{
   public Node head, tail;

   //constructor method to create a list of object with head, tail, and size. 
   public LinkedList_Nathan_Neeley()
   {
      head = null;
      tail = null;
   }
  
   //method add node to end of list
   public void addLastNode(int data) 
   {
      if (tail == null) 
         head = tail = new Node(data); //empty list
      else 
      {
         tail.next = new Node(data); //link new node as last node
         tail = tail.next; //make tail pointer points to last node
      }
   }
  
   //======== Your part to complete for this assignment =========
   
   //method #1: add first node
   public void addFirstNode(int data)
   {
      Node newNode = new Node(data); //create new node
      newNode.next = head; //link new node as first node
      head = newNode; //head points to new node
      if (tail == null)
         tail = head; //if empty list
   }
      
   //method #2: add node at index
   public void addAtIndex(int index, int data)
   {
      if (index <= 0)
         addFirstNode(data); //add as first node
      else if (index >= countNodes() - 1)
         addLastNode(data); //add as last node
      else {
         Node current = head; //move pointer current to the correct position
         Node temp = head.next; //temp is one step ahead of current
         for (int i = 1; i < index; i++) {
            current = current.next; //advance pointer current by one position
            temp = temp.next; //advance pointer temp by one position
         }
         
         temp = current.next; //link the new node to the list
         current.next = new Node(data); //create new node with data as parameter
         (current.next).next = temp;
      }
   }
      
   //method #3: remove first node
   public void removeFirstNode()
   {
      if (countNodes() != 0) {
         head = head.next; //head points to second node
         if (head == null)
            tail = null; //if empty list
      }
   }
      
   //method #4: remove last node
   public void removeLastNode()
   {
      Node current = head; //current points to head
      if (countNodes() == 1)
         head = tail = null; 
      
      else if (countNodes() >= 2) {
         for (int i = 0; i < countNodes() - 2; i++)
            current = current.next; //move current to second to last node
         
         current.next = null; //remove last node by making it null
         tail = current; //tail points to current
      }
   }
    
   //method #5: remove node at index
   public void removeAtIndex(int index)
   {
      if (index <= 0)
         removeFirstNode(); //remove first node
      else if (index >= countNodes() - 1)
         removeLastNode(); //remove last node
      else {
         Node previous = head; //previous points to head
         for (int i = 1; i < index; i++) {
            previous = previous.next; //advance previous by one position
         }
         Node current = previous.next; //current pointer is one position ahead of previous
         
         previous.next = current.next; //update the links
         
         tail = previous.next; //tail is updated
      }
   }
          
   //method #6: countNodes
   public int countNodes()
   {
      int listSize = 0; //initialize listSize variable
      Node current = head; //curret points to head
      
      while (current != null) {
         listSize++; //increment listSize by 1 ahead reaches end of list
         current = current.next; //advance current by one position
      }
      return listSize; //return listSize variable
         
   }
   
   //method #7: printInReverse  (Recursive method)
   public void printInReverse(Node L)
   {
      if (L != null) {
         printInReverse(L.next); //recursive call until end of list
         System.out.print(L.data + "   "); //print out L node
      } 
   }   

   //================= end of your part ==============

   //method to print out the list
   public void printList() 
   {
      Node temp; //create temp node
      temp = head; //temp points to head
      while (temp != null)
      {
         System.out.print(temp.data + "   "); //print out temp until reaches end of list
         temp = temp.next; //advance temp by one position
      }
   }
  
   //class to create nodes as objects
   private class Node
   {
      private int data;  //data field
      private Node next; //link field
       
      public Node(int item) //constructor method
      {
         data = item;
         next = null;
      }
   }
}

