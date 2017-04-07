package org.smart4j.generics;

import java.lang.reflect.Array;

/**
 * Created by AA on 2017/4/7.
 */
public class GenericArrayWithTypeToken<T> {
    private T[] array;
    public GenericArrayWithTypeToken(Class<T> type, int sz) {
        array = (T[]) Array.newInstance(type, sz);
    }
    public void put(int index, T item) {
        array[index] = item;
    }

    public T get(int index) {
        return array[index];
    }

    // Expose the underlying representation:
    public T[] rep() {
        return array;
    }

    public static void main(String[] args) {
        GenericArrayWithTypeToken<Integer> gai =
                new GenericArrayWithTypeToken<Integer>(
                        Integer.class, 10);
        // This now works:
        gai.put(0,1);
        gai.put(1,78);
        Integer[] ia = gai.rep();
        System.out.println(ia[0]);
    }
}
