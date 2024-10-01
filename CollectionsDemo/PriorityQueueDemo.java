package CollectionsDemo;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(30);
        queue.add(10);
        queue.add(20);
        System.out.println(queue.peek());
        //queue.poll();
        System.out.println(queue);
        Integer n =1;
        while(!queue.isEmpty()){
            System.out.printf("Element %d : %d \n",n,queue.poll());
            n+=1;
        }
    }
}