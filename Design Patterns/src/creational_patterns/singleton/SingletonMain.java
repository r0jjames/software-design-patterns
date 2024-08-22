package creational_patterns.singleton;

import creational_patterns.singleton.solution.Demo;

public class SingletonMain {
    public static void main(String[] args){
//        ConfigDemo();
        Demo.show();
    }


    static void ConfigDemo() {
        ConfigManager configManager = ConfigManager.getInstance();
        configManager.set("name", "Mosh");

        ConfigManager otherConfig = ConfigManager.getInstance();
        System.out.println(otherConfig.get("name"));
    }

    static void ThreadDemo() {
        System.out.println("If you see the same value, then singleton was reused (yay!)" + "\n" +
                "If you see different values, then 2 singletons were created (booo!!)" + "\n\n" +
                "RESULT:" + "\n");
        /*
        //Single Thread
        Singleton singleton = Singleton.getInstance("Foo");
        Singleton anotherSingleton = Singleton.getInstance("Bar");
        System.out.println("First: " + singleton.getValue());
        System.out.println("Second: " + anotherSingleton.getValue());
         */
        //Multi Thread
        Thread threadOne = new Thread(new ThreadFoo());
        Thread threadTwo = new Thread(new ThreadBar());
        threadOne.run();
        threadTwo.run();
    }
    static class ThreadFoo implements Runnable {

        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance("Foo");
            System.out.println("ThreadFoo: " + singleton.getValue());
        }
    }
    static class ThreadBar implements Runnable {

        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance("Bar");
            System.out.println("ThreadBar: " + singleton.getValue());
        }
    }
}
