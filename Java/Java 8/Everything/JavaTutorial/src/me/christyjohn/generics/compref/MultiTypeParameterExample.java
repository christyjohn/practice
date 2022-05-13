package me.christyjohn.generics.compref;

class MultiTypes<T , U , V> {
    private T t;
    private U u;
    private V v;

    public MultiTypes(T t, U u , V v) {
        this.t = t;
        this.u = u;
        this.v = v;
    }

    public T getT() {
        return t;
    }

    public U getU() {
        return u;
    }

    public V getV() {
        return v;
    }
}

public class MultiTypeParameterExample {
    public static void main(String[] args) {
        MultiTypes<String, Integer, Double> multiTypes =
                new MultiTypes<>("The Building", 50, 145.5);
        System.out.println(multiTypes.getT() + " is " +
                multiTypes.getU() + " year old, and is " +
                multiTypes.getV() + " kms away from the city.") ;
    }
}
