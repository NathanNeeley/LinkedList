import java.util.Scanner;
import java.util.InputMismatchException;

public class myTest_Nathan_Neeley
{
   public static void main (String[] args)
   {
      LinkedList_Nathan_Neeley myList = new LinkedList_Nathan_Neeley(); //create a list object
      Scanner input = new Scanner(System.in);
      
      int number = -1; 
      int data = 0;
      int index = 0;
      
      do {
         try {
            //MAIN MENU
            System.out.println("\n---MAIN MENU------"); //heading for options to execute in program
            System.out.println("0 - Exit Program");
            System.out.println("1 - Add First Node");
            System.out.println("2 - Add Last Node");
            System.out.println("3 - Add At Index");
            System.out.println("4 - Remove First Node");
            System.out.println("5 - Remove Last Node");
            System.out.println("6 - Remove At Index");
            System.out.println("7 - Print List Size");
            System.out.println("8 - Print List (Forward)");
            System.out.println("9 - Print List In Reverse");
            System.out.print("Enter menu option: "); //prompt user to enter in integer for menu option
            number = input.nextInt(); //read integer from user
          
            switch (number) {
            
               case 0:
                  break;
               
               case 1:
                  System.out.print("Enter first node you would like to add to the list: "); //prompt user for first node
                  data = input.nextInt(); //read first node from user
                  System.out.println("\nTesting method addFirstNode()"); //heading
                  System.out.print("List content before adding first node: "); //print out list before adding node
                  if (myList.countNodes() == 0)
                     System.out.println("List is Empty"); //if list has zero nodes
                  else {
                     myList.printList(); //method call to print list
                     System.out.println(); //print extra line
                  }
                  myList.addFirstNode(data); //method call
                  System.out.print("List content after adding first node: \t"); //print out list after adding node
                  myList.printList(); //method call to print list
                  System.out.println(); //print extra line
                  break;
            
               case 2: 
                  System.out.print("Enter last node you would like to add to the list: "); //prompt user to enter last node
                  data = input.nextInt(); //read last node from user
                  System.out.println("\nTesting method addLastNode()"); //heading
                  System.out.print("List content before adding last node:  "); //print content before adding last node
                  if (myList.countNodes() == 0)
                     System.out.println("List is Empty"); //if list has zero nodes
                  else {
                     myList.printList(); //method call to print list
                     System.out.println(); //print extra line
                  }
                  myList.addLastNode(data); //method call
                  System.out.print("List content after adding last node: \t"); //print content after adding last node
                  myList.printList(); //method call to print list
                  System.out.println(); //print extra line
                  break;
            
               case 3:
                  System.out.print("Enter index where you would like to add node to list: "); //prompt user to enter index
                  index = input.nextInt(); //read index from user
                  System.out.print("Enter node for specified index to add to list: "); //prompt user to enter node
                  data = input.nextInt(); //read node from user
                  System.out.println("\nTesting method addAtIndex()"); //heading
                  System.out.print("List content before adding node at specified index: "); //print content before adding node
                  if (myList.countNodes() == 0)
                     System.out.println("List is Empty"); //if list has zero nodes
                  else {
                     myList.printList(); //method call to print list
                     System.out.println(); //print extra line
                  }
                  myList.addAtIndex(index, data); //method call
                  System.out.print("List content after adding node at specified index:  "); //print content after adding node
                  myList.printList(); //method call to print list
                  System.out.println(); //print extra line
                  break;
            
               case 4:
                  System.out.println("\nTesting method removeFirstNode()"); //heading
                  System.out.print("List content before removing first node:  "); //print content before removing node
                  if (myList.countNodes() == 0)
                     System.out.println("List is Empty"); //if list has zero nodes
                  else {
                     myList.printList(); //method call to print list
                     System.out.println(); //print extra line
                  }
                  myList.removeFirstNode(); //method call
                  System.out.print("List content after removing first node: \t"); //print content after removing node
                  if (myList.countNodes() == 0)
                     System.out.println("List is Empty"); //if list has zero nodes
                  else { 
                     myList.printList(); //method call to print list
                     System.out.println(); //print extra line
                  }
                  break;
            
               case 5:
                  System.out.println("\nTesting method removeLastNode()"); //heading
                  System.out.print("List content before removing last node:  "); //print content before removing node
                  if (myList.countNodes() == 0)
                     System.out.println(" List is Empty"); //if list has zero nodes
                  else {
                     myList.printList(); //method call to print list
                     System.out.println(); //print extra line
                  }
                  myList.removeLastNode(); //method call
                  System.out.print("List content after removing last node:   "); //print content after removing node
                  if (myList.countNodes() == 0)
                     System.out.println("List is Empty"); //if list has zero nodes
                  else {
                     myList.printList(); //method call to print list
                     System.out.println(); //print extra line
                  }
                  break;
            
               case 6:
                  System.out.print("Enter index where you would like to remove node from list: "); //prompt user for index
                  index = input.nextInt(); //read index from user 
                  System.out.println("\nTesting method removeAtIndex()"); //heading
                  System.out.print("List content before removing node at specified index: "); //print content before removing node
                  if (myList.countNodes() == 0)
                     System.out.println("List is Empty"); //if list has zero nodes
                  else {
                     myList.printList(); //method call to print list
                     System.out.println(); //print extra line
                  }
                  myList.removeAtIndex(index); //method call
                  System.out.print("List content after removing node at specified index:  "); //print content after removing node
                  if (myList.countNodes() == 0)
                     System.out.println("List is Empty"); //if list has zero nodes
                  else {
                     myList.printList(); //method call to print list
                     System.out.println(); //print extra line
                  }
                  break;
            
               case 7:
                  if (myList.countNodes() == 0)
                     System.out.println("List is Empty"); //if list has zero nodes
                  else
                     System.out.println("List Size: " + myList.countNodes()); //print list size
                  break;
            
               case 8:
                  if (myList.countNodes() == 0)
                     System.out.println("List is Empty"); //if list has zero nodes
                  else {
                     System.out.print("List content (forward): "); //print list content
                     myList.printList(); //method call to print list
                     System.out.println(); //print extra line
                  }
                  break;
            
               case 9:
                  if (myList.countNodes() == 0)
                     System.out.println("List is Empty"); //if list has zero nodes
                  else {
                     System.out.print("List content (backward): "); //print list content
                     myList.printInReverse(myList.head); //call recursive method to print list in reverse                     
                     System.out.println(); //print extra line
                  }
                  break;
            
               default:
                  System.out.println("Option not in list. Re-enter menu option."); //default menu option that continues loop
            }
         }
         //catch exception if something besides an integer is entered
         catch (InputMismatchException ex) {
            System.out.println("Invalid input. Re-enter menu option."); //error message
            input.nextLine(); //discard input
         }
      } while (number != 0); //sentinel loop condition
      
      System.out.println("Program is terminated."); //message when program ends
   } 
}
  
