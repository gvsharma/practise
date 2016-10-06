package hackerearth;

/**
 * Created by GV Sharma on 8/14/2016.
 */
public class Challenge1 {
    public static void main(String args[]) {
        int x,y;
        x = 3 & 6;
        y = 3 | 6;
        System.out.println(x + " " + y);
    }

    static class newthread implements Runnable {
        Thread t;
        newthread() {
            t = new Thread(this,"Hello");
            t.start();
        }
        public void run() {
            System.out.println(t.getName());
        }
    }
}
