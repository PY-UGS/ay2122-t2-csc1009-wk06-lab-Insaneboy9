package com.daryl;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Random;

public class Q4to6 {

    public static void main(String[] args) {
        HashMap hash= new HashMap();
        hash.put(0,1);
        hash.put(1,3);
        hash.put(2,5);
        hash.put(3,7);
        hash.put(4,9);
        hash.put(5,11);
        System.out.println("Before: " + hash);
        addAndSort(hash,6);
        System.out.println("After adding: " + hash);
        swap(hash,1,5);
        System.out.println("After swapping: " + hash);
        System.out.println("The result of the random generated hash map is " + generateLinked());
    }

    private static void addAndSort(HashMap hash, int val) {
        if ((int)hash.get(hash.size()-1) < val) { //without this if, cannot add to last element
           hash.put(hash.size(), val);
        }
        else {
            int i = 0;
            while ((int)hash.get(i) < val) {
                i++;
            }
            int num= (int) hash.size();
            for(int a=i+1;a<hash.size();a++){
                Object oldnum=hash.get(num-1);
                hash.put(num,oldnum);
                num-=1;

            }
            hash.put(i, val);
        }
    }

    private static void swap(HashMap hash, int index1, int index2){
        int num1 = (int)hash.get(index1);
        int num2 = (int)hash.get(index2);

        // Swapping the elements
        hash.remove(index1);
        hash.put(index1,num2);
        hash.remove(index2);
        hash.put(index2,num1);
    }

    private static int generateLinked(){
        HashMap map= new HashMap();
        Random random= new Random();
        int randint= random.nextInt(8999)+1000;
        for(int i=0;i<500;i++){
            map.put(i,random.nextInt(8999)+1000);
        }
        for(int i=0;i<500;i++){
            if((int)map.get(i)==randint){
                return i;
            }
        }
        return -1;
    }

}