//Christopher Lee, 12/17/25, pd 6
//Program will ask the user for 5 whole numbers, add each number to a stack and then replaces every value in the stack with two occurrences of that value.
//Program will also ask the user for 10 whole numbers, add each number to a queue and then rearrange the order of the values so that all of the evens appear before the odds.

import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

class StackQueueMini {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    Stack<Integer> s = new Stack<Integer>();
    Queue<Integer> q = new LinkedList<Integer>();

    for(int i=0;i<5;i++)
    {
      System.out.print("Enter a number: ");
      s.add(in.nextInt());
    }//end loop to fill stack

    System.out.println("original stack contains : bottom " + s + " top");
    jas(s);
    System.out.println("stack now contains after method: bottom " +s+ " top");

    for(int i=0;i<10;i++)
    {
      System.out.print("Enter a number: ");
      q.add(in.nextInt());
    }//end loop to fill queue 
    in.close();

    System.out.println("original queue contains : front " + q+" back");
    lia(q);
    System.out.println("queue now contains after method: front " +q+" back");
  } // end main

  public static void jas(Stack<Integer> e)
  {
    Stack<Integer> leo = new Stack<Integer>();
    while(!e.isEmpty())
      leo.add(e.pop());
    while(!leo.isEmpty())
    {
      Integer med = leo.pop();
      e.push(med);
      e.push(med); 
    }//end loop through list
  }//end method

  public static void lia(Queue<Integer> e)
  {
    Queue<Integer> kat = new LinkedList<Integer>();
    int o = e.size();
    for(int p=0;p<o;p++)
      {
      if(e.peek()%2==0)
        e.add(e.remove());
      else
        kat.add(e.remove());
    }//end for loop through list 
      while(!kat.isEmpty())
        e.add(kat.remove());
  }//end method
} // end class