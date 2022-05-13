package me.christyjohn.generics.compref;

class PostGenerics<T> {
    private T t;

    public PostGenerics(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }
}

public class GenericsExample {
    public static void main(String[] args) {
        PostGenerics<String> pg = new PostGenerics("Christy");
        String name = pg.getT();
        System.out.println(name);

        PostGenerics<Integer> pg1 = new PostGenerics<>(38);
        int age = pg1.getT();
        System.out.println(age);
    }
}
