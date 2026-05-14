//Write a Java program to find the total number of nodes in a given
//linked list without using the built-in size() method.
//Traverse the list manually and count each node.
import java.util.LinkedList;
public class CountNodes {
    public static void main(String[] args){
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("Linked List contains : "+list);
        int count = countNodes(list);
        System.out.println("Total no of nodes in a given linked list is : "+count);
    }
    public static int countNodes(LinkedList<Integer> l){
        int count = 0;
        for(Integer ref : l){
            count++;
        }
        return count;
    }
}