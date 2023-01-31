package datastructures.deque;
import java.util.ArrayDeque;
import java.util.Iterator;

public class Dequeue {
    public static void main(String[] args) {
        //offer vs add: offer return false when queue is full whereas
        // add throws an exception
        ArrayDeque<Integer> queue = new ArrayDeque<>();

        //write
        queue.add(15);
        queue.addFirst(23);
        queue.addLast(89);
        System.out.println(queue);

        queue.offer(16);
        queue.offerFirst(19);
        queue.offerLast(49);
        System.out.println(queue);
        //read
        System.out.println(queue.getFirst());
        System.out.println(queue.getLast());
        System.out.println(queue.peek());
        System.out.println(queue.peekFirst());
        System.out.println(queue.peekLast());

        //delete
       /* System.out.println(queue.remove()); // removes first element in queue
        System.out.println(queue.remove(16));
        System.out.println(queue.removeFirst()); //same as remove()
        System.out.println(queue.removeLast()); //removes last element in queue*/

        /*using poll*/
        /*poll()
        * pollFirst()
        * pollLast()
        * clear()*/

        //Iterator<Integer> itr = new queue.iterator();
        //while (itr.hasNext()) System.out.println(itr.next());
    }
}
