package com.java.queue;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueEx {
    public static void main(String[] args) {
        int i;

        Queue queue=new PriorityQueue();
        //System.out.println(queue.remove());//no such element exception
        //System.out.println(queue.element());//no such element exception
        System.out.println(queue.peek());//return null if no element is there
        System.out.println(queue.poll());//return null if no element is there
        for( i=0;i<5;i++) {
            System.out.println(queue.offer(i));
        }
        System.out.println(queue);
        System.out.println(queue.element());//return the head
        System.out.println(queue.peek());//return the head element
        //System.out.println("queue"+queue.poll());//remove and return the head element
        queue.poll();//
        System.out.println("remove"+queue.remove());//remove and return head element
//        for( i=1;i<5;i++) {
//            System.out.println("removed"+queue.remove());
//        }
//        System.out.println(queue);

        System.out.println(queue);
    }
}
