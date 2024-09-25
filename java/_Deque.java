import java.util.*;
public class _Deque {
  public static void main(String[]args){
    // Deque<String>deque=new LinkedList<String>();
    // deque.add("Element 1(Tail)");
    // deque.addFirst("Element 2(Head)");
    // deque.addLast("Element 3(Tail)");
    // deque.push("Element 4(Head)");
    // deque.offer("Element 5(Tail)");
    // deque.offerFirst("Element 6(Head)");
    // System.out.println(deque+"\n");
    // deque.removeFirst();
    // deque.removeLast();
    // System.out.println("Deque after removing"+"first and last: "+deque);
    Deque<String>dq=new ArrayDeque<String>();
    dq.add("Prem");
    dq.addFirst("Anand");
    dq.addLast("Kumar");
    System.out.println(dq);
    System.out.println(dq.size());
    System.out.println(dq.pop());
    System.out.println(dq.poll());
    System.out.println(dq.pollFirst());
    System.out.println(dq.pollLast());
    System.out.println(dq);
  }
}
