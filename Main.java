package com.daryl;

import java.util.LinkedList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(3);
        linkedList.add(5);
        linkedList.add(7);
        linkedList.add(9);
        linkedList.add(11);
        System.out.println("Before: " + linkedList);
        addAndSort(linkedList,12);
        System.out.println("After adding: " + linkedList);
        swap(linkedList,1,5);
        System.out.println("After swapping: " + linkedList);
        System.out.println("The result of the random generated linked list is " + generateLinked());
    }

    private static void addAndSort(LinkedList<Integer> linkedList, int val) {

        if (linkedList.get(linkedList.size() - 1) < val) { //without this if, cannot add to last element
            linkedList.add(linkedList.size(), val);
        }
        else {
            int i = 0;
            while (linkedList.get(i) < val) {
                i++;
            }
            linkedList.add(i, val);
        }
    }

    private static void swap(LinkedList<Integer> linkedList, int index1, int index2){
        int num1 = linkedList.get(index1);
        int num2 = linkedList.get(index2);

        // Swapping the elements
        linkedList.set(index1, num2);
        linkedList.set(index2, num1);
    }

    private static int generateLinked(){
        LinkedList llist= new LinkedList<>();
        Random random= new Random();
        int randint= random.nextInt(8999)+1000;
        for(int i=0;i<500;i++){
            llist.add(random.nextInt(8999)+1000);
        }
        if (llist.contains(randint)){
            return llist.indexOf(randint);
        }
        else {
            return -1;
        }

    }
}

