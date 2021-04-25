package com.company;

public class Main {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.add(0,1);

        list.add(0,2);

        list.add(0,3);
        list.add(0,4);

        list.add(0,5);

        list.DisplayAll();

        System.out.println();

        list.reverse();

        list.DisplayAll();
        System.out.println();
        System.out.println("Finding  4.. " + "The index of 4 is:  " + list.find(4));

        System.out.println("Removing 4.. ");
        list.remove(list.find(4));


        System.out.println("Resulting linked list: ");
        list.DisplayAll();


    }
}
