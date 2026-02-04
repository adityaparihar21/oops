public class main {
    class Parent {
    Parent() {
        System.out.println("Parent constructor");
    }
}

class Child extends Parent {
    Child() {
        super();
        super();
    }
}

class Main {
    public static void main(String[] args) {
        new Child();
    }
}

    
}
