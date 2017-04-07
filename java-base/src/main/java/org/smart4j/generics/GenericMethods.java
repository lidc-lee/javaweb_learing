package org.smart4j.generics;

/**
 * Created by AA on 2017/4/7.
 * 泛型
 */
public class GenericMethods {
    public <T> void f(T x) {
        System.out.println(x.getClass().getName());
    }

    public static void main(String[] args){
        GenericMethods gm = new GenericMethods();
        gm.f("hello world");
        gm.f(1.23789);
        gm.f(789);
        gm.f(true);
        gm.f('l');
        gm.f(gm);
    }
}
