package org.smart4j.generics;

/**
 * Created by AA on 2017/4/7.
 * 泛型数组
 */
public class GenericArray<T> {
    private T[] array;

    public GenericArray(int n) {
        array = (T[]) new Object[n];
    }

    public T get(int index) {
        return array[index];
    }

    public void put(int index,T item) {
        this.array[index] = item;
    }
    // Method that exposes the underlying representation:
    public T[] rep() {
        return array;
    }

    public static void main(String[] args) {
        GenericArray<Integer> gai =
                new GenericArray<Integer>(45);
        for (int i = 0; i < 45; i++)
            gai.put(i, i);
        for (int i = 0; i < 45; i++)
            System.out.print(gai.get(i) + " ");
        System.out.println();
        try {
            Object[] ia = gai.rep();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
