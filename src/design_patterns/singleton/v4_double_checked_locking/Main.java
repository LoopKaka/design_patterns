package design_patterns.singleton.v4_double_checked_locking;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

public class Main {
    public static void main(String[] args) {
        // Refection API
        // try {
        // Logger logger = Logger.getInstance();
        // System.out.println(logger.hashCode());

        // Constructor<Logger> loggerConstructor =
        // Logger.class.getDeclaredConstructor();
        // loggerConstructor.setAccessible(true);
        // Logger logger1 = loggerConstructor.newInstance();
        // System.out.println("Using Refection API");
        // System.out.println(logger1.hashCode());
        // } catch (Exception e) {
        // e.printStackTrace();
        // }

        // serialization
        try {
            Logger logger = Logger.getInstance();
            System.out.println(logger.hashCode());

            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("logger.test"));
            objectOutputStream.writeObject(logger);
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("logger.test"));
            Logger logger1 = (Logger) objectInputStream.readObject();
            System.out.println("After serialiozation : " + logger1.hashCode());

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
