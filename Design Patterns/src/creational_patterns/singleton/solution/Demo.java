package creational_patterns.singleton.solution;

public class Demo {
    public static void show(){
        var logger1 = Logger.getInstance("file1");
        var logger2 = Logger.getInstance("file1");
        System.out.println(logger1 == logger2);

        var logger3 = Logger.getInstance("file2");
        System.out.println(logger1 == logger3);
    }
}
