package org.example;

public class SingletonExample {

    private SingletonExample() {

    }

    //Create a class named TestSingleton below
    public static class TestSingleton {
     private static final SingletonExample INSTANCE = new SingletonExample();
    }

    public static SingletonExample getInstance() {
        return TestSingleton.INSTANCE;
    }

    public static void main(String... args) {
        SingletonExample singletonExample1 = SingletonExample.getInstance();
        System.out.println(singletonExample1);
        SingletonExample singletonExample2 = SingletonExample.getInstance();
        System.out.println(singletonExample2);


    }
}