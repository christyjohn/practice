package me.christyjohn.generics.compref;

class PreGenerics {
    private Object obj;

    public PreGenerics(Object obj) {
        this.obj = obj;
    }

    public Object getObj() {
        return obj;
    }
}

public class BeforeGenerics {

    public static void main(String[] args) {

        PreGenerics pg = new PreGenerics(new String("Christy"));
        String name = (String) pg.getObj();

        PreGenerics pg1 = new PreGenerics(39);
        int age = (int) pg1.getObj();
    }
}
