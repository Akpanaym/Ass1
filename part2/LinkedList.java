package com.company;

class LinkedList<T> {
    unit head;

    LinkedList(){
        head = null;
    }

    public void add(int ind, T value){
        if(ind == 0){
            unit temp = head;
            head = new  unit(value);
            head.nxt = temp;

        } else {
            int currentIndex = 0;
            unit current = head;

            while(current != null){
                if(currentIndex == ind - 1){
                    unit copy = current.nxt;
                    current.nxt = new  unit(value);
                    current.nxt.nxt = copy;
                }
                currentIndex++;
                current = current.nxt;
            }
        }
    }
    public int find(T keyItem){
        int currentIndex = 0;
        unit current = head;
        while(current != null){
            if(current.data == keyItem){
                return currentIndex;
            }
            currentIndex++;
            current = current.nxt;
        }
        return -1;
    }
    public void reverse(){
        unit pre = null;
        unit current1 = head;
        while(current1 != null){
            unit next = current1.nxt;
            current1.nxt = pre;
            pre = current1;
            current1 = next;
        }
        head = pre;
    }

    public  unit remove(int index1){
        if(index1 == 0){
            unit temp = head;
            head = head.nxt;
            return temp;
        } else {
            int currentindex1 = 0;
            unit current1 = head;
            while(currentindex1 != (index1 - 1)){
                current1 = current1.nxt;
                currentindex1++;
            }
            unit temp = current1.nxt;
            current1.nxt = current1.nxt.nxt;
            return temp;
        }
    }
    public void DisplayAll(){
        unit current1 = head;
        while(current1 != null){
            System.out.print(current1.data + " ");
            current1 = current1.nxt;
        }
    }

}

