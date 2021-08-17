package basicConcepts;

interface A {
    void add();
    default void show() {
        System.out.println("default method of interface A");
    }
}

interface B {
    default void show() {
        System.out.println("default method of interface B");
    }
}

class C {
    public void show() {
        System.out.println("in class C");
    }
}

class D implements A, B {
    public void add() {
        System.out.println("in adding method of class D");
    }

    public void show() {
        System.out.println("In show method of class D");
    }
}

class E extends C implements A {
    public void add() {
        System.out.println("in adding method of class E");
    }
}

public class LatestInterface {
    public static void main(String[] args) {
        D obj = new D();
        obj.show();

        E obj1 = new E();
        obj1.show();
    }
}
