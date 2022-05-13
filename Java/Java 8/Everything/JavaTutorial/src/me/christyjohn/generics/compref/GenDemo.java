package me.christyjohn.generics.compref;

/**
 *  A simple generic class
 *  Here, T is a type of parameter that will be replaced
 *  by real type when an object of type Gen is created.
 */
class Gen<T> {

    T ob; // declare an object of type T

    public Gen(){
    }

    // pass the constructor a reference to
    // an object of type T
    public Gen(T t){
        ob = t;
    }

    T getOb() {
        return ob;
    }

    // show type of T
    void showType() {
        System.out.println("Type of T is " + ob.getClass().getName());
    }
}

public class GenDemo {

    public static void main(String[] args) {
        Gen<Integer> iOb = new Gen<>(88);
        iOb.showType();

        Gen<String> strOb = new Gen<>("Java");
        strOb.showType();

        int v = iOb.getOb();
        System.out.println("Value in iOb : " + v);

        String str = strOb.getOb();
        System.out.println("Value in strOb : " + str);
    }
}
