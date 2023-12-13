package creational_patterns;

public final class Singleton {
    private static Singleton instance;
    private String value = "";

    private Singleton(String value) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        this.value = value;
    }
    public static Singleton getInstance(String value) {
        if(instance == null) {
          instance = new Singleton(value);
        }
        return instance;
    }

    public String getValue() {
        return value;
    }

}
