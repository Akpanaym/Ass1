package com.company;

public class Main {

    public static void main(String[] args) {

        ArrayList list = new ArrayList();

        list.add(1);

        list.add(2);

        list.add(3);

        list.add(4);

        list.add(5);
        list.add(6);
        list.add(7);




        for(int i = 0; i < list.getSize(); i++){
            System.out.print(list.get(i) + " ");
        }

        System.out.println();

        list.reverse();

        for(int i = 0; i < list.getSize(); i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        System.out.println(list.find(5));

        list.remove(list.find(5));

        for(int i = 0; i < list.getSize(); i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        System.out.println(list.find(5));




    }
}
