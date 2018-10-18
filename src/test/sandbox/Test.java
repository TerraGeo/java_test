package test.sandbox;

import java.util.ArrayDeque;
import java.util.Queue;

public class Test {
    public static void main(String[] args) {
        Queue<String> queue = new ArrayDeque<>();
        queue.add("TCP");
        queue.add("UDP");
        queue.add("IRC");
        queue.add("SNMP");
        ((ArrayDeque<String>) queue).addFirst("ARP");
        System.out.println(queue);
    }
}
