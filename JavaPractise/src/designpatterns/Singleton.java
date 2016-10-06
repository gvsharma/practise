package designpatterns;

/**
 * Created by GV Sharma on 9/13/2016.
 */
public class Singleton {
    private static Singleton mInstance;

    public Singleton getInstance() {
        if (mInstance != null) {
            mInstance = new Singleton();
        }
        return mInstance;
    }

//    public static
}
