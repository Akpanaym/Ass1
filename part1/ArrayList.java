package com.company;

import java.util.Scanner;

public class ArrayList<T> {
    private Object[] ar;

    private int measure;

    private int capacity = 5;



    public ArrayList(){
        ar = new Object[capacity];
    }

    public int getSize(){
        return this.measure;
    }



    public T get(int ind){
        return (T)ar[ind];
    }


    public void add(T newItem){
        if(measure == capacity){
            increaseBuffer();
        }

        ar[measure++] = newItem;
    }

    public T remove(int index){
        T item = (T)ar[index];
        for(int i = index; i < measure - 1; i++){
            ar[i] = ar[i + 1];
        }
        measure--;


        return item;

    }

    public int find(T keyitem){
        for(int i = 0; i < measure; i++){
            if(ar[i] == keyitem){

                return i;
            }
        }
        return -1;
    }

    public void reverse(){
        for(int i = 0; i < (measure / 2); i++){
            T temp = (T)ar[measure - 1 - i];
            ar[measure - 1 - i] = ar[i];
            ar[i] = temp;
        }
    }

    private void increaseBuffer(){
        capacity = (int)(1.5 * capacity);
        Object[] ar2 = new Object[capacity];
        for(int i = 0; i < measure; i++){
            ar2[i] = ar[i];
        }
        ar = ar2;
    }
}
